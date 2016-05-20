/**
 * generated by Xtext
 */
package questions.generator;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import questions.Answer;
import questions.IntValueQuestion;
import questions.MultipleChoice;
import questions.Question;
import questions.QuestionSet;
import questions.SingleChoice;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class QuestionsDSLGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<QuestionSet> _filter = Iterators.<QuestionSet>filter(_allContents, QuestionSet.class);
    final Function1<QuestionSet, Boolean> _function = new Function1<QuestionSet, Boolean>() {
      public Boolean apply(final QuestionSet it) {
        return Boolean.valueOf(true);
      }
    };
    final QuestionSet root = IteratorExtensions.<QuestionSet>findFirst(_filter, _function);
    String _name = root.getName();
    String _plus = (_name + ".html");
    String _compile = this.compile(root);
    fsa.generateFile(_plus, _compile);
  }
  
  public String compile(final QuestionSet set) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<title>Questions!</title>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<style>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(".question {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("margin-bottom: 10px;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script type=\"text/javascript\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("function validateForm() {");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("var form = document.forms[\"qform\"];");
    _builder.newLine();
    {
      EList<Question> _questions = set.getQuestions();
      for(final Question q : _questions) {
        _builder.append("\t\t\t\t");
        String _genCheckQuestion = this.genCheckQuestion(q);
        _builder.append(_genCheckQuestion, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("}\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>\t\t");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("<form name=\'qform\'>\t");
    _builder.newLine();
    {
      EList<Question> _questions_1 = set.getQuestions();
      for(final Question q_1 : _questions_1) {
        _builder.append("\t\t");
        _builder.append("<div class=\'question\'>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        String _compileQ = this.compileQ(q_1);
        _builder.append(_compileQ, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<div id=\'answer");
        String _name = q_1.getName();
        _builder.append(_name, "\t\t\t");
        _builder.append("\'></div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("  \t\t");
    _builder.append("<input type=\"button\" name=\"submit\" value=\"Submit\" onsubmit=\'return false;\' onclick=\'validateForm();\'> ");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("</form> ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _genCheckQuestion(final SingleChoice q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if ( ! document.getElementById(\'");
    String _name = q.getName();
    _builder.append(_name, "");
    EList<Answer> _answers = q.getAnswers();
    EList<Answer> _answers_1 = q.getAnswers();
    final Function1<Answer, Boolean> _function = new Function1<Answer, Boolean>() {
      public Boolean apply(final Answer it) {
        return Boolean.valueOf(it.isIsCorrect());
      }
    };
    Iterable<Answer> _filter = IterableExtensions.<Answer>filter(_answers_1, _function);
    final Function1<Answer, Boolean> _function_1 = new Function1<Answer, Boolean>() {
      public Boolean apply(final Answer it) {
        return Boolean.valueOf(true);
      }
    };
    Answer _findFirst = IterableExtensions.<Answer>findFirst(_filter, _function_1);
    int _indexOf = _answers.indexOf(_findFirst);
    _builder.append(_indexOf, "");
    _builder.append("\').checked ) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("// alert(\"Incorrect answer for question ");
    String _name_1 = q.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("\" );");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("document.getElementById(\'answer");
    String _name_2 = q.getName();
    _builder.append(_name_2, "\t");
    _builder.append("\').innerHTML=\'Incorrect! :-(\';");
    _builder.newLineIfNotEmpty();
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("document.getElementById(\'answer");
    String _name_3 = q.getName();
    _builder.append(_name_3, "\t");
    _builder.append("\').innerHTML=\'Correct!\';\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _genCheckQuestion(final MultipleChoice q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// TODO");
    _builder.newLine();
    return _builder.toString();
  }
  
  /**
   * var v = form["«q.name»"].value;
   * if ( v != "«q.name»«q.answers.indexOf(q.answers.filter[isIsCorrect].findFirst[true])»" ) {
   * alert("Incorrect answer for question «q.name»" );
   * }
   */
  protected String _genCheckQuestion(final IntValueQuestion q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// TODO");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _compileQ(final SingleChoice q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    String _text = q.getText();
    _builder.append(_text, "");
    _builder.append("</div>");
    _builder.newLineIfNotEmpty();
    _builder.append("<div>");
    _builder.newLine();
    {
      EList<Answer> _answers = q.getAnswers();
      for(final Answer a : _answers) {
        _builder.append("<input type=\"radio\" name=\"");
        String _name = q.getName();
        _builder.append(_name, "");
        _builder.append("\" id=\"");
        String _name_1 = q.getName();
        _builder.append(_name_1, "");
        EList<Answer> _answers_1 = q.getAnswers();
        int _indexOf = _answers_1.indexOf(a);
        _builder.append(_indexOf, "");
        _builder.append("\" value=\"");
        String _name_2 = q.getName();
        _builder.append(_name_2, "");
        EList<Answer> _answers_2 = q.getAnswers();
        int _indexOf_1 = _answers_2.indexOf(a);
        _builder.append(_indexOf_1, "");
        _builder.append("\"> ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _text_1 = a.getText();
        _builder.append(_text_1, "\t");
        _builder.append("<br>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</div>");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _compileQ(final MultipleChoice q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    String _text = q.getText();
    _builder.append(_text, "");
    _builder.append("</div>");
    _builder.newLineIfNotEmpty();
    _builder.append("<div>");
    _builder.newLine();
    {
      EList<Answer> _answers = q.getAnswers();
      for(final Answer a : _answers) {
        _builder.append("<input type=\"checkbox\" name=\"");
        String _name = q.getName();
        _builder.append(_name, "");
        EList<Answer> _answers_1 = q.getAnswers();
        int _indexOf = _answers_1.indexOf(a);
        _builder.append(_indexOf, "");
        _builder.append("\" id=\"");
        String _name_1 = q.getName();
        _builder.append(_name_1, "");
        EList<Answer> _answers_2 = q.getAnswers();
        int _indexOf_1 = _answers_2.indexOf(a);
        _builder.append(_indexOf_1, "");
        _builder.append("\" value=\"");
        String _name_2 = q.getName();
        _builder.append(_name_2, "");
        EList<Answer> _answers_3 = q.getAnswers();
        int _indexOf_2 = _answers_3.indexOf(a);
        _builder.append(_indexOf_2, "");
        _builder.append("\"> ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _text_1 = a.getText();
        _builder.append(_text_1, "\t");
        _builder.append("<br>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</div>\t");
    return _builder.toString();
  }
  
  protected String _compileQ(final IntValueQuestion q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    String _text = q.getText();
    _builder.append(_text, "");
    _builder.append("</div>");
    _builder.newLineIfNotEmpty();
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<input type=\"text\" name=\"");
    String _name = q.getName();
    _builder.append(_name, "\t");
    _builder.append("\" value=\"\"><br>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String genCheckQuestion(final Question q) {
    if (q instanceof IntValueQuestion) {
      return _genCheckQuestion((IntValueQuestion)q);
    } else if (q instanceof MultipleChoice) {
      return _genCheckQuestion((MultipleChoice)q);
    } else if (q instanceof SingleChoice) {
      return _genCheckQuestion((SingleChoice)q);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(q).toString());
    }
  }
  
  public String compileQ(final Question q) {
    if (q instanceof IntValueQuestion) {
      return _compileQ((IntValueQuestion)q);
    } else if (q instanceof MultipleChoice) {
      return _compileQ((MultipleChoice)q);
    } else if (q instanceof SingleChoice) {
      return _compileQ((SingleChoice)q);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(q).toString());
    }
  }
}