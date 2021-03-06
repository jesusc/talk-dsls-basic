/**
 * generated by Xtext
 */
package questions.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import questions.Answer;
import questions.MultipleChoice;
import questions.QuestionsPackage;
import questions.SingleChoice;
import questions.validation.AbstractQuestionsDSLValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class QuestionsDSLValidator extends AbstractQuestionsDSLValidator {
  @Check
  public void checkOnlyOne(final SingleChoice q) {
    EList<Answer> _answers = q.getAnswers();
    final Function1<Answer, Boolean> _function = new Function1<Answer, Boolean>() {
      public Boolean apply(final Answer it) {
        return Boolean.valueOf(it.isIsCorrect());
      }
    };
    Iterable<Answer> _filter = IterableExtensions.<Answer>filter(_answers, _function);
    int _size = IterableExtensions.size(_filter);
    boolean _notEquals = (_size != 1);
    if (_notEquals) {
      this.error("One and only one answer must be correct", QuestionsPackage.Literals.SINGLE_CHOICE__ANSWERS);
    }
  }
  
  @Check
  public void checkAtLeastOne(final MultipleChoice q) {
    EList<Answer> _answers = q.getAnswers();
    final Function1<Answer, Boolean> _function = new Function1<Answer, Boolean>() {
      public Boolean apply(final Answer it) {
        return Boolean.valueOf(it.isIsCorrect());
      }
    };
    Iterable<Answer> _filter = IterableExtensions.<Answer>filter(_answers, _function);
    int _size = IterableExtensions.size(_filter);
    boolean _equals = (_size == 0);
    if (_equals) {
      this.error("At least one answer must be correct", QuestionsPackage.Literals.MULTIPLE_CHOICE__ANSWERS);
    }
  }
}
