package questions.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import questions.services.QuestionsDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuestionsDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questions'", "'single'", "':'", "'multiple'", "'integer'", "'expecting'", "'['", "']'", "'-'", "'X'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalQuestionsDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuestionsDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuestionsDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g"; }


     
     	private QuestionsDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QuestionsDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleQuestionSet"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:60:1: entryRuleQuestionSet : ruleQuestionSet EOF ;
    public final void entryRuleQuestionSet() throws RecognitionException {
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:61:1: ( ruleQuestionSet EOF )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:62:1: ruleQuestionSet EOF
            {
             before(grammarAccess.getQuestionSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionSet_in_entryRuleQuestionSet61);
            ruleQuestionSet();

            state._fsp--;

             after(grammarAccess.getQuestionSetRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionSet68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionSet"


    // $ANTLR start "ruleQuestionSet"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:69:1: ruleQuestionSet : ( ( rule__QuestionSet__Group__0 ) ) ;
    public final void ruleQuestionSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:73:2: ( ( ( rule__QuestionSet__Group__0 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:74:1: ( ( rule__QuestionSet__Group__0 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:74:1: ( ( rule__QuestionSet__Group__0 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:75:1: ( rule__QuestionSet__Group__0 )
            {
             before(grammarAccess.getQuestionSetAccess().getGroup()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:76:1: ( rule__QuestionSet__Group__0 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:76:2: rule__QuestionSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionSet__Group__0_in_ruleQuestionSet94);
            rule__QuestionSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionSet"


    // $ANTLR start "entryRuleQuestion"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:88:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:89:1: ( ruleQuestion EOF )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:90:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion121);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:97:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:101:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:102:1: ( ( rule__Question__Alternatives ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:102:1: ( ( rule__Question__Alternatives ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:103:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:104:1: ( rule__Question__Alternatives )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:104:2: rule__Question__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Alternatives_in_ruleQuestion154);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleSingleChoice"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:116:1: entryRuleSingleChoice : ruleSingleChoice EOF ;
    public final void entryRuleSingleChoice() throws RecognitionException {
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:117:1: ( ruleSingleChoice EOF )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:118:1: ruleSingleChoice EOF
            {
             before(grammarAccess.getSingleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleChoice_in_entryRuleSingleChoice181);
            ruleSingleChoice();

            state._fsp--;

             after(grammarAccess.getSingleChoiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleChoice188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleChoice"


    // $ANTLR start "ruleSingleChoice"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:125:1: ruleSingleChoice : ( ( rule__SingleChoice__Group__0 ) ) ;
    public final void ruleSingleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:129:2: ( ( ( rule__SingleChoice__Group__0 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:130:1: ( ( rule__SingleChoice__Group__0 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:130:1: ( ( rule__SingleChoice__Group__0 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:131:1: ( rule__SingleChoice__Group__0 )
            {
             before(grammarAccess.getSingleChoiceAccess().getGroup()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:132:1: ( rule__SingleChoice__Group__0 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:132:2: rule__SingleChoice__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__0_in_ruleSingleChoice214);
            rule__SingleChoice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleChoice"


    // $ANTLR start "entryRuleMultipleChoice"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:144:1: entryRuleMultipleChoice : ruleMultipleChoice EOF ;
    public final void entryRuleMultipleChoice() throws RecognitionException {
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:145:1: ( ruleMultipleChoice EOF )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:146:1: ruleMultipleChoice EOF
            {
             before(grammarAccess.getMultipleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice241);
            ruleMultipleChoice();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultipleChoice"


    // $ANTLR start "ruleMultipleChoice"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:153:1: ruleMultipleChoice : ( ( rule__MultipleChoice__Group__0 ) ) ;
    public final void ruleMultipleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:157:2: ( ( ( rule__MultipleChoice__Group__0 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:158:1: ( ( rule__MultipleChoice__Group__0 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:158:1: ( ( rule__MultipleChoice__Group__0 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:159:1: ( rule__MultipleChoice__Group__0 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getGroup()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:160:1: ( rule__MultipleChoice__Group__0 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:160:2: rule__MultipleChoice__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__0_in_ruleMultipleChoice274);
            rule__MultipleChoice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultipleChoice"


    // $ANTLR start "entryRuleIntValueQuestion"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:172:1: entryRuleIntValueQuestion : ruleIntValueQuestion EOF ;
    public final void entryRuleIntValueQuestion() throws RecognitionException {
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:173:1: ( ruleIntValueQuestion EOF )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:174:1: ruleIntValueQuestion EOF
            {
             before(grammarAccess.getIntValueQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntValueQuestion_in_entryRuleIntValueQuestion301);
            ruleIntValueQuestion();

            state._fsp--;

             after(grammarAccess.getIntValueQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValueQuestion308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValueQuestion"


    // $ANTLR start "ruleIntValueQuestion"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:181:1: ruleIntValueQuestion : ( ( rule__IntValueQuestion__Group__0 ) ) ;
    public final void ruleIntValueQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:185:2: ( ( ( rule__IntValueQuestion__Group__0 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:186:1: ( ( rule__IntValueQuestion__Group__0 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:186:1: ( ( rule__IntValueQuestion__Group__0 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:187:1: ( rule__IntValueQuestion__Group__0 )
            {
             before(grammarAccess.getIntValueQuestionAccess().getGroup()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:188:1: ( rule__IntValueQuestion__Group__0 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:188:2: rule__IntValueQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__Group__0_in_ruleIntValueQuestion334);
            rule__IntValueQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntValueQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValueQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:200:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:201:1: ( ruleAnswer EOF )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:202:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer361);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:209:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:213:2: ( ( ( rule__Answer__Group__0 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:214:1: ( ( rule__Answer__Group__0 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:214:1: ( ( rule__Answer__Group__0 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:215:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:216:1: ( rule__Answer__Group__0 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:216:2: rule__Answer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0_in_ruleAnswer394);
            rule__Answer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleEInt"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:229:1: ( ruleEInt EOF )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt421);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:242:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:242:1: ( ( rule__EInt__Group__0 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:243:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:244:1: ( rule__EInt__Group__0 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:244:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt454);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:256:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:257:1: ( ruleEString EOF )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:258:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString481);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:265:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:269:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:270:1: ( ( rule__EString__Alternatives ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:270:1: ( ( rule__EString__Alternatives ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:271:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:272:1: ( rule__EString__Alternatives )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:272:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString514);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Question__Alternatives"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:286:1: rule__Question__Alternatives : ( ( ruleSingleChoice ) | ( ruleMultipleChoice ) | ( ruleIntValueQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:290:1: ( ( ruleSingleChoice ) | ( ruleMultipleChoice ) | ( ruleIntValueQuestion ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:291:1: ( ruleSingleChoice )
                    {
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:291:1: ( ruleSingleChoice )
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:292:1: ruleSingleChoice
                    {
                     before(grammarAccess.getQuestionAccess().getSingleChoiceParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSingleChoice_in_rule__Question__Alternatives552);
                    ruleSingleChoice();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getSingleChoiceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:297:6: ( ruleMultipleChoice )
                    {
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:297:6: ( ruleMultipleChoice )
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:298:1: ruleMultipleChoice
                    {
                     before(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_rule__Question__Alternatives569);
                    ruleMultipleChoice();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:303:6: ( ruleIntValueQuestion )
                    {
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:303:6: ( ruleIntValueQuestion )
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:304:1: ruleIntValueQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getIntValueQuestionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntValueQuestion_in_rule__Question__Alternatives586);
                    ruleIntValueQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getIntValueQuestionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:314:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:318:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:319:1: ( RULE_STRING )
                    {
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:319:1: ( RULE_STRING )
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:320:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives618); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:325:6: ( RULE_ID )
                    {
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:325:6: ( RULE_ID )
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:326:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives635); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__QuestionSet__Group__0"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:339:1: rule__QuestionSet__Group__0 : rule__QuestionSet__Group__0__Impl rule__QuestionSet__Group__1 ;
    public final void rule__QuestionSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:343:1: ( rule__QuestionSet__Group__0__Impl rule__QuestionSet__Group__1 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:344:2: rule__QuestionSet__Group__0__Impl rule__QuestionSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionSet__Group__0__Impl_in_rule__QuestionSet__Group__0666);
            rule__QuestionSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionSet__Group__1_in_rule__QuestionSet__Group__0669);
            rule__QuestionSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionSet__Group__0"


    // $ANTLR start "rule__QuestionSet__Group__0__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:351:1: rule__QuestionSet__Group__0__Impl : ( 'questions' ) ;
    public final void rule__QuestionSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:355:1: ( ( 'questions' ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:356:1: ( 'questions' )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:356:1: ( 'questions' )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:357:1: 'questions'
            {
             before(grammarAccess.getQuestionSetAccess().getQuestionsKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__QuestionSet__Group__0__Impl697); 
             after(grammarAccess.getQuestionSetAccess().getQuestionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionSet__Group__0__Impl"


    // $ANTLR start "rule__QuestionSet__Group__1"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:370:1: rule__QuestionSet__Group__1 : rule__QuestionSet__Group__1__Impl rule__QuestionSet__Group__2 ;
    public final void rule__QuestionSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:374:1: ( rule__QuestionSet__Group__1__Impl rule__QuestionSet__Group__2 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:375:2: rule__QuestionSet__Group__1__Impl rule__QuestionSet__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionSet__Group__1__Impl_in_rule__QuestionSet__Group__1728);
            rule__QuestionSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionSet__Group__2_in_rule__QuestionSet__Group__1731);
            rule__QuestionSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionSet__Group__1"


    // $ANTLR start "rule__QuestionSet__Group__1__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:382:1: rule__QuestionSet__Group__1__Impl : ( ( rule__QuestionSet__NameAssignment_1 ) ) ;
    public final void rule__QuestionSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:386:1: ( ( ( rule__QuestionSet__NameAssignment_1 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:387:1: ( ( rule__QuestionSet__NameAssignment_1 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:387:1: ( ( rule__QuestionSet__NameAssignment_1 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:388:1: ( rule__QuestionSet__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionSetAccess().getNameAssignment_1()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:389:1: ( rule__QuestionSet__NameAssignment_1 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:389:2: rule__QuestionSet__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionSet__NameAssignment_1_in_rule__QuestionSet__Group__1__Impl758);
            rule__QuestionSet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionSet__Group__1__Impl"


    // $ANTLR start "rule__QuestionSet__Group__2"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:399:1: rule__QuestionSet__Group__2 : rule__QuestionSet__Group__2__Impl rule__QuestionSet__Group__3 ;
    public final void rule__QuestionSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:403:1: ( rule__QuestionSet__Group__2__Impl rule__QuestionSet__Group__3 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:404:2: rule__QuestionSet__Group__2__Impl rule__QuestionSet__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionSet__Group__2__Impl_in_rule__QuestionSet__Group__2788);
            rule__QuestionSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionSet__Group__3_in_rule__QuestionSet__Group__2791);
            rule__QuestionSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionSet__Group__2"


    // $ANTLR start "rule__QuestionSet__Group__2__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:411:1: rule__QuestionSet__Group__2__Impl : ( ( rule__QuestionSet__QuestionsAssignment_2 ) ) ;
    public final void rule__QuestionSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:415:1: ( ( ( rule__QuestionSet__QuestionsAssignment_2 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:416:1: ( ( rule__QuestionSet__QuestionsAssignment_2 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:416:1: ( ( rule__QuestionSet__QuestionsAssignment_2 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:417:1: ( rule__QuestionSet__QuestionsAssignment_2 )
            {
             before(grammarAccess.getQuestionSetAccess().getQuestionsAssignment_2()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:418:1: ( rule__QuestionSet__QuestionsAssignment_2 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:418:2: rule__QuestionSet__QuestionsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionSet__QuestionsAssignment_2_in_rule__QuestionSet__Group__2__Impl818);
            rule__QuestionSet__QuestionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionSetAccess().getQuestionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionSet__Group__2__Impl"


    // $ANTLR start "rule__QuestionSet__Group__3"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:428:1: rule__QuestionSet__Group__3 : rule__QuestionSet__Group__3__Impl ;
    public final void rule__QuestionSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:432:1: ( rule__QuestionSet__Group__3__Impl )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:433:2: rule__QuestionSet__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionSet__Group__3__Impl_in_rule__QuestionSet__Group__3848);
            rule__QuestionSet__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionSet__Group__3"


    // $ANTLR start "rule__QuestionSet__Group__3__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:439:1: rule__QuestionSet__Group__3__Impl : ( ( rule__QuestionSet__QuestionsAssignment_3 )* ) ;
    public final void rule__QuestionSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:443:1: ( ( ( rule__QuestionSet__QuestionsAssignment_3 )* ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:444:1: ( ( rule__QuestionSet__QuestionsAssignment_3 )* )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:444:1: ( ( rule__QuestionSet__QuestionsAssignment_3 )* )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:445:1: ( rule__QuestionSet__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getQuestionSetAccess().getQuestionsAssignment_3()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:446:1: ( rule__QuestionSet__QuestionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||(LA3_0>=14 && LA3_0<=15)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:446:2: rule__QuestionSet__QuestionsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuestionSet__QuestionsAssignment_3_in_rule__QuestionSet__Group__3__Impl875);
            	    rule__QuestionSet__QuestionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getQuestionSetAccess().getQuestionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionSet__Group__3__Impl"


    // $ANTLR start "rule__SingleChoice__Group__0"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:464:1: rule__SingleChoice__Group__0 : rule__SingleChoice__Group__0__Impl rule__SingleChoice__Group__1 ;
    public final void rule__SingleChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:468:1: ( rule__SingleChoice__Group__0__Impl rule__SingleChoice__Group__1 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:469:2: rule__SingleChoice__Group__0__Impl rule__SingleChoice__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__0__Impl_in_rule__SingleChoice__Group__0914);
            rule__SingleChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__1_in_rule__SingleChoice__Group__0917);
            rule__SingleChoice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__0"


    // $ANTLR start "rule__SingleChoice__Group__0__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:476:1: rule__SingleChoice__Group__0__Impl : ( 'single' ) ;
    public final void rule__SingleChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:480:1: ( ( 'single' ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:481:1: ( 'single' )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:481:1: ( 'single' )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:482:1: 'single'
            {
             before(grammarAccess.getSingleChoiceAccess().getSingleKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__SingleChoice__Group__0__Impl945); 
             after(grammarAccess.getSingleChoiceAccess().getSingleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__0__Impl"


    // $ANTLR start "rule__SingleChoice__Group__1"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:495:1: rule__SingleChoice__Group__1 : rule__SingleChoice__Group__1__Impl rule__SingleChoice__Group__2 ;
    public final void rule__SingleChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:499:1: ( rule__SingleChoice__Group__1__Impl rule__SingleChoice__Group__2 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:500:2: rule__SingleChoice__Group__1__Impl rule__SingleChoice__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__1__Impl_in_rule__SingleChoice__Group__1976);
            rule__SingleChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__2_in_rule__SingleChoice__Group__1979);
            rule__SingleChoice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__1"


    // $ANTLR start "rule__SingleChoice__Group__1__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:507:1: rule__SingleChoice__Group__1__Impl : ( ( rule__SingleChoice__NameAssignment_1 ) ) ;
    public final void rule__SingleChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:511:1: ( ( ( rule__SingleChoice__NameAssignment_1 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:512:1: ( ( rule__SingleChoice__NameAssignment_1 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:512:1: ( ( rule__SingleChoice__NameAssignment_1 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:513:1: ( rule__SingleChoice__NameAssignment_1 )
            {
             before(grammarAccess.getSingleChoiceAccess().getNameAssignment_1()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:514:1: ( rule__SingleChoice__NameAssignment_1 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:514:2: rule__SingleChoice__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__NameAssignment_1_in_rule__SingleChoice__Group__1__Impl1006);
            rule__SingleChoice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__1__Impl"


    // $ANTLR start "rule__SingleChoice__Group__2"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:524:1: rule__SingleChoice__Group__2 : rule__SingleChoice__Group__2__Impl rule__SingleChoice__Group__3 ;
    public final void rule__SingleChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:528:1: ( rule__SingleChoice__Group__2__Impl rule__SingleChoice__Group__3 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:529:2: rule__SingleChoice__Group__2__Impl rule__SingleChoice__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__2__Impl_in_rule__SingleChoice__Group__21036);
            rule__SingleChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__3_in_rule__SingleChoice__Group__21039);
            rule__SingleChoice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__2"


    // $ANTLR start "rule__SingleChoice__Group__2__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:536:1: rule__SingleChoice__Group__2__Impl : ( ( rule__SingleChoice__TextAssignment_2 ) ) ;
    public final void rule__SingleChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:540:1: ( ( ( rule__SingleChoice__TextAssignment_2 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:541:1: ( ( rule__SingleChoice__TextAssignment_2 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:541:1: ( ( rule__SingleChoice__TextAssignment_2 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:542:1: ( rule__SingleChoice__TextAssignment_2 )
            {
             before(grammarAccess.getSingleChoiceAccess().getTextAssignment_2()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:543:1: ( rule__SingleChoice__TextAssignment_2 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:543:2: rule__SingleChoice__TextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__TextAssignment_2_in_rule__SingleChoice__Group__2__Impl1066);
            rule__SingleChoice__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__2__Impl"


    // $ANTLR start "rule__SingleChoice__Group__3"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:553:1: rule__SingleChoice__Group__3 : rule__SingleChoice__Group__3__Impl rule__SingleChoice__Group__4 ;
    public final void rule__SingleChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:557:1: ( rule__SingleChoice__Group__3__Impl rule__SingleChoice__Group__4 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:558:2: rule__SingleChoice__Group__3__Impl rule__SingleChoice__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__3__Impl_in_rule__SingleChoice__Group__31096);
            rule__SingleChoice__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__4_in_rule__SingleChoice__Group__31099);
            rule__SingleChoice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__3"


    // $ANTLR start "rule__SingleChoice__Group__3__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:565:1: rule__SingleChoice__Group__3__Impl : ( ':' ) ;
    public final void rule__SingleChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:569:1: ( ( ':' ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:570:1: ( ':' )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:570:1: ( ':' )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:571:1: ':'
            {
             before(grammarAccess.getSingleChoiceAccess().getColonKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__SingleChoice__Group__3__Impl1127); 
             after(grammarAccess.getSingleChoiceAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__3__Impl"


    // $ANTLR start "rule__SingleChoice__Group__4"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:584:1: rule__SingleChoice__Group__4 : rule__SingleChoice__Group__4__Impl rule__SingleChoice__Group__5 ;
    public final void rule__SingleChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:588:1: ( rule__SingleChoice__Group__4__Impl rule__SingleChoice__Group__5 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:589:2: rule__SingleChoice__Group__4__Impl rule__SingleChoice__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__4__Impl_in_rule__SingleChoice__Group__41158);
            rule__SingleChoice__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__5_in_rule__SingleChoice__Group__41161);
            rule__SingleChoice__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__4"


    // $ANTLR start "rule__SingleChoice__Group__4__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:596:1: rule__SingleChoice__Group__4__Impl : ( ( rule__SingleChoice__AnswersAssignment_4 ) ) ;
    public final void rule__SingleChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:600:1: ( ( ( rule__SingleChoice__AnswersAssignment_4 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:601:1: ( ( rule__SingleChoice__AnswersAssignment_4 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:601:1: ( ( rule__SingleChoice__AnswersAssignment_4 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:602:1: ( rule__SingleChoice__AnswersAssignment_4 )
            {
             before(grammarAccess.getSingleChoiceAccess().getAnswersAssignment_4()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:603:1: ( rule__SingleChoice__AnswersAssignment_4 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:603:2: rule__SingleChoice__AnswersAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__AnswersAssignment_4_in_rule__SingleChoice__Group__4__Impl1188);
            rule__SingleChoice__AnswersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceAccess().getAnswersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__4__Impl"


    // $ANTLR start "rule__SingleChoice__Group__5"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:613:1: rule__SingleChoice__Group__5 : rule__SingleChoice__Group__5__Impl ;
    public final void rule__SingleChoice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:617:1: ( rule__SingleChoice__Group__5__Impl )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:618:2: rule__SingleChoice__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__Group__5__Impl_in_rule__SingleChoice__Group__51218);
            rule__SingleChoice__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__5"


    // $ANTLR start "rule__SingleChoice__Group__5__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:624:1: rule__SingleChoice__Group__5__Impl : ( ( rule__SingleChoice__AnswersAssignment_5 )* ) ;
    public final void rule__SingleChoice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:628:1: ( ( ( rule__SingleChoice__AnswersAssignment_5 )* ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:629:1: ( ( rule__SingleChoice__AnswersAssignment_5 )* )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:629:1: ( ( rule__SingleChoice__AnswersAssignment_5 )* )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:630:1: ( rule__SingleChoice__AnswersAssignment_5 )*
            {
             before(grammarAccess.getSingleChoiceAccess().getAnswersAssignment_5()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:631:1: ( rule__SingleChoice__AnswersAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:631:2: rule__SingleChoice__AnswersAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SingleChoice__AnswersAssignment_5_in_rule__SingleChoice__Group__5__Impl1245);
            	    rule__SingleChoice__AnswersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSingleChoiceAccess().getAnswersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__Group__5__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__0"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:653:1: rule__MultipleChoice__Group__0 : rule__MultipleChoice__Group__0__Impl rule__MultipleChoice__Group__1 ;
    public final void rule__MultipleChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:657:1: ( rule__MultipleChoice__Group__0__Impl rule__MultipleChoice__Group__1 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:658:2: rule__MultipleChoice__Group__0__Impl rule__MultipleChoice__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__0__Impl_in_rule__MultipleChoice__Group__01288);
            rule__MultipleChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__1_in_rule__MultipleChoice__Group__01291);
            rule__MultipleChoice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__0"


    // $ANTLR start "rule__MultipleChoice__Group__0__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:665:1: rule__MultipleChoice__Group__0__Impl : ( 'multiple' ) ;
    public final void rule__MultipleChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:669:1: ( ( 'multiple' ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:670:1: ( 'multiple' )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:670:1: ( 'multiple' )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:671:1: 'multiple'
            {
             before(grammarAccess.getMultipleChoiceAccess().getMultipleKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__MultipleChoice__Group__0__Impl1319); 
             after(grammarAccess.getMultipleChoiceAccess().getMultipleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__0__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__1"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:684:1: rule__MultipleChoice__Group__1 : rule__MultipleChoice__Group__1__Impl rule__MultipleChoice__Group__2 ;
    public final void rule__MultipleChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:688:1: ( rule__MultipleChoice__Group__1__Impl rule__MultipleChoice__Group__2 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:689:2: rule__MultipleChoice__Group__1__Impl rule__MultipleChoice__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__1__Impl_in_rule__MultipleChoice__Group__11350);
            rule__MultipleChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__2_in_rule__MultipleChoice__Group__11353);
            rule__MultipleChoice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__1"


    // $ANTLR start "rule__MultipleChoice__Group__1__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:696:1: rule__MultipleChoice__Group__1__Impl : ( ( rule__MultipleChoice__NameAssignment_1 ) ) ;
    public final void rule__MultipleChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:700:1: ( ( ( rule__MultipleChoice__NameAssignment_1 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:701:1: ( ( rule__MultipleChoice__NameAssignment_1 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:701:1: ( ( rule__MultipleChoice__NameAssignment_1 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:702:1: ( rule__MultipleChoice__NameAssignment_1 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getNameAssignment_1()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:703:1: ( rule__MultipleChoice__NameAssignment_1 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:703:2: rule__MultipleChoice__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__NameAssignment_1_in_rule__MultipleChoice__Group__1__Impl1380);
            rule__MultipleChoice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__1__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__2"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:713:1: rule__MultipleChoice__Group__2 : rule__MultipleChoice__Group__2__Impl rule__MultipleChoice__Group__3 ;
    public final void rule__MultipleChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:717:1: ( rule__MultipleChoice__Group__2__Impl rule__MultipleChoice__Group__3 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:718:2: rule__MultipleChoice__Group__2__Impl rule__MultipleChoice__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__2__Impl_in_rule__MultipleChoice__Group__21410);
            rule__MultipleChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__3_in_rule__MultipleChoice__Group__21413);
            rule__MultipleChoice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__2"


    // $ANTLR start "rule__MultipleChoice__Group__2__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:725:1: rule__MultipleChoice__Group__2__Impl : ( ( rule__MultipleChoice__TextAssignment_2 ) ) ;
    public final void rule__MultipleChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:729:1: ( ( ( rule__MultipleChoice__TextAssignment_2 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:730:1: ( ( rule__MultipleChoice__TextAssignment_2 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:730:1: ( ( rule__MultipleChoice__TextAssignment_2 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:731:1: ( rule__MultipleChoice__TextAssignment_2 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getTextAssignment_2()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:732:1: ( rule__MultipleChoice__TextAssignment_2 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:732:2: rule__MultipleChoice__TextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__TextAssignment_2_in_rule__MultipleChoice__Group__2__Impl1440);
            rule__MultipleChoice__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__2__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__3"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:742:1: rule__MultipleChoice__Group__3 : rule__MultipleChoice__Group__3__Impl rule__MultipleChoice__Group__4 ;
    public final void rule__MultipleChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:746:1: ( rule__MultipleChoice__Group__3__Impl rule__MultipleChoice__Group__4 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:747:2: rule__MultipleChoice__Group__3__Impl rule__MultipleChoice__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__3__Impl_in_rule__MultipleChoice__Group__31470);
            rule__MultipleChoice__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__4_in_rule__MultipleChoice__Group__31473);
            rule__MultipleChoice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__3"


    // $ANTLR start "rule__MultipleChoice__Group__3__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:754:1: rule__MultipleChoice__Group__3__Impl : ( ':' ) ;
    public final void rule__MultipleChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:758:1: ( ( ':' ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:759:1: ( ':' )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:759:1: ( ':' )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:760:1: ':'
            {
             before(grammarAccess.getMultipleChoiceAccess().getColonKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MultipleChoice__Group__3__Impl1501); 
             after(grammarAccess.getMultipleChoiceAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__3__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__4"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:773:1: rule__MultipleChoice__Group__4 : rule__MultipleChoice__Group__4__Impl rule__MultipleChoice__Group__5 ;
    public final void rule__MultipleChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:777:1: ( rule__MultipleChoice__Group__4__Impl rule__MultipleChoice__Group__5 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:778:2: rule__MultipleChoice__Group__4__Impl rule__MultipleChoice__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__4__Impl_in_rule__MultipleChoice__Group__41532);
            rule__MultipleChoice__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__5_in_rule__MultipleChoice__Group__41535);
            rule__MultipleChoice__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__4"


    // $ANTLR start "rule__MultipleChoice__Group__4__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:785:1: rule__MultipleChoice__Group__4__Impl : ( ( rule__MultipleChoice__AnswersAssignment_4 ) ) ;
    public final void rule__MultipleChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:789:1: ( ( ( rule__MultipleChoice__AnswersAssignment_4 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:790:1: ( ( rule__MultipleChoice__AnswersAssignment_4 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:790:1: ( ( rule__MultipleChoice__AnswersAssignment_4 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:791:1: ( rule__MultipleChoice__AnswersAssignment_4 )
            {
             before(grammarAccess.getMultipleChoiceAccess().getAnswersAssignment_4()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:792:1: ( rule__MultipleChoice__AnswersAssignment_4 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:792:2: rule__MultipleChoice__AnswersAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__AnswersAssignment_4_in_rule__MultipleChoice__Group__4__Impl1562);
            rule__MultipleChoice__AnswersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMultipleChoiceAccess().getAnswersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__4__Impl"


    // $ANTLR start "rule__MultipleChoice__Group__5"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:802:1: rule__MultipleChoice__Group__5 : rule__MultipleChoice__Group__5__Impl ;
    public final void rule__MultipleChoice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:806:1: ( rule__MultipleChoice__Group__5__Impl )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:807:2: rule__MultipleChoice__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__Group__5__Impl_in_rule__MultipleChoice__Group__51592);
            rule__MultipleChoice__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__5"


    // $ANTLR start "rule__MultipleChoice__Group__5__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:813:1: rule__MultipleChoice__Group__5__Impl : ( ( rule__MultipleChoice__AnswersAssignment_5 )* ) ;
    public final void rule__MultipleChoice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:817:1: ( ( ( rule__MultipleChoice__AnswersAssignment_5 )* ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:818:1: ( ( rule__MultipleChoice__AnswersAssignment_5 )* )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:818:1: ( ( rule__MultipleChoice__AnswersAssignment_5 )* )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:819:1: ( rule__MultipleChoice__AnswersAssignment_5 )*
            {
             before(grammarAccess.getMultipleChoiceAccess().getAnswersAssignment_5()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:820:1: ( rule__MultipleChoice__AnswersAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:820:2: rule__MultipleChoice__AnswersAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultipleChoice__AnswersAssignment_5_in_rule__MultipleChoice__Group__5__Impl1619);
            	    rule__MultipleChoice__AnswersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMultipleChoiceAccess().getAnswersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__Group__5__Impl"


    // $ANTLR start "rule__IntValueQuestion__Group__0"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:842:1: rule__IntValueQuestion__Group__0 : rule__IntValueQuestion__Group__0__Impl rule__IntValueQuestion__Group__1 ;
    public final void rule__IntValueQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:846:1: ( rule__IntValueQuestion__Group__0__Impl rule__IntValueQuestion__Group__1 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:847:2: rule__IntValueQuestion__Group__0__Impl rule__IntValueQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__Group__0__Impl_in_rule__IntValueQuestion__Group__01662);
            rule__IntValueQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__Group__1_in_rule__IntValueQuestion__Group__01665);
            rule__IntValueQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__Group__0"


    // $ANTLR start "rule__IntValueQuestion__Group__0__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:854:1: rule__IntValueQuestion__Group__0__Impl : ( 'integer' ) ;
    public final void rule__IntValueQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:858:1: ( ( 'integer' ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:859:1: ( 'integer' )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:859:1: ( 'integer' )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:860:1: 'integer'
            {
             before(grammarAccess.getIntValueQuestionAccess().getIntegerKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__IntValueQuestion__Group__0__Impl1693); 
             after(grammarAccess.getIntValueQuestionAccess().getIntegerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__Group__0__Impl"


    // $ANTLR start "rule__IntValueQuestion__Group__1"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:873:1: rule__IntValueQuestion__Group__1 : rule__IntValueQuestion__Group__1__Impl rule__IntValueQuestion__Group__2 ;
    public final void rule__IntValueQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:877:1: ( rule__IntValueQuestion__Group__1__Impl rule__IntValueQuestion__Group__2 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:878:2: rule__IntValueQuestion__Group__1__Impl rule__IntValueQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__Group__1__Impl_in_rule__IntValueQuestion__Group__11724);
            rule__IntValueQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__Group__2_in_rule__IntValueQuestion__Group__11727);
            rule__IntValueQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__Group__1"


    // $ANTLR start "rule__IntValueQuestion__Group__1__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:885:1: rule__IntValueQuestion__Group__1__Impl : ( ( rule__IntValueQuestion__NameAssignment_1 ) ) ;
    public final void rule__IntValueQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:889:1: ( ( ( rule__IntValueQuestion__NameAssignment_1 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:890:1: ( ( rule__IntValueQuestion__NameAssignment_1 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:890:1: ( ( rule__IntValueQuestion__NameAssignment_1 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:891:1: ( rule__IntValueQuestion__NameAssignment_1 )
            {
             before(grammarAccess.getIntValueQuestionAccess().getNameAssignment_1()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:892:1: ( rule__IntValueQuestion__NameAssignment_1 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:892:2: rule__IntValueQuestion__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__NameAssignment_1_in_rule__IntValueQuestion__Group__1__Impl1754);
            rule__IntValueQuestion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntValueQuestionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__Group__1__Impl"


    // $ANTLR start "rule__IntValueQuestion__Group__2"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:902:1: rule__IntValueQuestion__Group__2 : rule__IntValueQuestion__Group__2__Impl rule__IntValueQuestion__Group__3 ;
    public final void rule__IntValueQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:906:1: ( rule__IntValueQuestion__Group__2__Impl rule__IntValueQuestion__Group__3 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:907:2: rule__IntValueQuestion__Group__2__Impl rule__IntValueQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__Group__2__Impl_in_rule__IntValueQuestion__Group__21784);
            rule__IntValueQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__Group__3_in_rule__IntValueQuestion__Group__21787);
            rule__IntValueQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__Group__2"


    // $ANTLR start "rule__IntValueQuestion__Group__2__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:914:1: rule__IntValueQuestion__Group__2__Impl : ( ( rule__IntValueQuestion__TextAssignment_2 ) ) ;
    public final void rule__IntValueQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:918:1: ( ( ( rule__IntValueQuestion__TextAssignment_2 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:919:1: ( ( rule__IntValueQuestion__TextAssignment_2 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:919:1: ( ( rule__IntValueQuestion__TextAssignment_2 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:920:1: ( rule__IntValueQuestion__TextAssignment_2 )
            {
             before(grammarAccess.getIntValueQuestionAccess().getTextAssignment_2()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:921:1: ( rule__IntValueQuestion__TextAssignment_2 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:921:2: rule__IntValueQuestion__TextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__TextAssignment_2_in_rule__IntValueQuestion__Group__2__Impl1814);
            rule__IntValueQuestion__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntValueQuestionAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__Group__2__Impl"


    // $ANTLR start "rule__IntValueQuestion__Group__3"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:931:1: rule__IntValueQuestion__Group__3 : rule__IntValueQuestion__Group__3__Impl rule__IntValueQuestion__Group__4 ;
    public final void rule__IntValueQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:935:1: ( rule__IntValueQuestion__Group__3__Impl rule__IntValueQuestion__Group__4 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:936:2: rule__IntValueQuestion__Group__3__Impl rule__IntValueQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__Group__3__Impl_in_rule__IntValueQuestion__Group__31844);
            rule__IntValueQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__Group__4_in_rule__IntValueQuestion__Group__31847);
            rule__IntValueQuestion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__Group__3"


    // $ANTLR start "rule__IntValueQuestion__Group__3__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:943:1: rule__IntValueQuestion__Group__3__Impl : ( 'expecting' ) ;
    public final void rule__IntValueQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:947:1: ( ( 'expecting' ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:948:1: ( 'expecting' )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:948:1: ( 'expecting' )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:949:1: 'expecting'
            {
             before(grammarAccess.getIntValueQuestionAccess().getExpectingKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__IntValueQuestion__Group__3__Impl1875); 
             after(grammarAccess.getIntValueQuestionAccess().getExpectingKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__Group__3__Impl"


    // $ANTLR start "rule__IntValueQuestion__Group__4"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:962:1: rule__IntValueQuestion__Group__4 : rule__IntValueQuestion__Group__4__Impl ;
    public final void rule__IntValueQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:966:1: ( rule__IntValueQuestion__Group__4__Impl )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:967:2: rule__IntValueQuestion__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__Group__4__Impl_in_rule__IntValueQuestion__Group__41906);
            rule__IntValueQuestion__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__Group__4"


    // $ANTLR start "rule__IntValueQuestion__Group__4__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:973:1: rule__IntValueQuestion__Group__4__Impl : ( ( rule__IntValueQuestion__ExpectedValueAssignment_4 ) ) ;
    public final void rule__IntValueQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:977:1: ( ( ( rule__IntValueQuestion__ExpectedValueAssignment_4 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:978:1: ( ( rule__IntValueQuestion__ExpectedValueAssignment_4 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:978:1: ( ( rule__IntValueQuestion__ExpectedValueAssignment_4 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:979:1: ( rule__IntValueQuestion__ExpectedValueAssignment_4 )
            {
             before(grammarAccess.getIntValueQuestionAccess().getExpectedValueAssignment_4()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:980:1: ( rule__IntValueQuestion__ExpectedValueAssignment_4 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:980:2: rule__IntValueQuestion__ExpectedValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValueQuestion__ExpectedValueAssignment_4_in_rule__IntValueQuestion__Group__4__Impl1933);
            rule__IntValueQuestion__ExpectedValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntValueQuestionAccess().getExpectedValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__Group__4__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1000:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1004:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1005:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01973);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01976);
            rule__Answer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__0"


    // $ANTLR start "rule__Answer__Group__0__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1012:1: rule__Answer__Group__0__Impl : ( '[' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1016:1: ( ( '[' ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1017:1: ( '[' )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1017:1: ( '[' )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1018:1: '['
            {
             before(grammarAccess.getAnswerAccess().getLeftSquareBracketKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Answer__Group__0__Impl2004); 
             after(grammarAccess.getAnswerAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__0__Impl"


    // $ANTLR start "rule__Answer__Group__1"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1031:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1035:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1036:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12035);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12038);
            rule__Answer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__1"


    // $ANTLR start "rule__Answer__Group__1__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1043:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__IsCorrectAssignment_1 )? ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1047:1: ( ( ( rule__Answer__IsCorrectAssignment_1 )? ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1048:1: ( ( rule__Answer__IsCorrectAssignment_1 )? )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1048:1: ( ( rule__Answer__IsCorrectAssignment_1 )? )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1049:1: ( rule__Answer__IsCorrectAssignment_1 )?
            {
             before(grammarAccess.getAnswerAccess().getIsCorrectAssignment_1()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1050:1: ( rule__Answer__IsCorrectAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1050:2: rule__Answer__IsCorrectAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Answer__IsCorrectAssignment_1_in_rule__Answer__Group__1__Impl2065);
                    rule__Answer__IsCorrectAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getIsCorrectAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__1__Impl"


    // $ANTLR start "rule__Answer__Group__2"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1060:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1064:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1065:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22096);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22099);
            rule__Answer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__2"


    // $ANTLR start "rule__Answer__Group__2__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1072:1: rule__Answer__Group__2__Impl : ( ']' ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1076:1: ( ( ']' ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1077:1: ( ']' )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1077:1: ( ']' )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1078:1: ']'
            {
             before(grammarAccess.getAnswerAccess().getRightSquareBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Answer__Group__2__Impl2127); 
             after(grammarAccess.getAnswerAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__2__Impl"


    // $ANTLR start "rule__Answer__Group__3"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1091:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1095:1: ( rule__Answer__Group__3__Impl )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1096:2: rule__Answer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32158);
            rule__Answer__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__3"


    // $ANTLR start "rule__Answer__Group__3__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1102:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__TextAssignment_3 ) ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1106:1: ( ( ( rule__Answer__TextAssignment_3 ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1107:1: ( ( rule__Answer__TextAssignment_3 ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1107:1: ( ( rule__Answer__TextAssignment_3 ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1108:1: ( rule__Answer__TextAssignment_3 )
            {
             before(grammarAccess.getAnswerAccess().getTextAssignment_3()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1109:1: ( rule__Answer__TextAssignment_3 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1109:2: rule__Answer__TextAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__TextAssignment_3_in_rule__Answer__Group__3__Impl2185);
            rule__Answer__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1127:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1131:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1132:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02223);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02226);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1139:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1143:1: ( ( ( '-' )? ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1144:1: ( ( '-' )? )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1144:1: ( ( '-' )? )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1145:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1146:1: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1147:2: '-'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__EInt__Group__0__Impl2255); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1158:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1162:1: ( rule__EInt__Group__1__Impl )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1163:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__12288);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1169:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1173:1: ( ( RULE_INT ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1174:1: ( RULE_INT )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1174:1: ( RULE_INT )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1175:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl2315); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__QuestionSet__NameAssignment_1"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1191:1: rule__QuestionSet__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__QuestionSet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1195:1: ( ( ruleEString ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1196:1: ( ruleEString )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1196:1: ( ruleEString )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1197:1: ruleEString
            {
             before(grammarAccess.getQuestionSetAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionSet__NameAssignment_12353);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionSetAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionSet__NameAssignment_1"


    // $ANTLR start "rule__QuestionSet__QuestionsAssignment_2"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1206:1: rule__QuestionSet__QuestionsAssignment_2 : ( ruleQuestion ) ;
    public final void rule__QuestionSet__QuestionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1210:1: ( ( ruleQuestion ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1211:1: ( ruleQuestion )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1211:1: ( ruleQuestion )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1212:1: ruleQuestion
            {
             before(grammarAccess.getQuestionSetAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QuestionSet__QuestionsAssignment_22384);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionSetAccess().getQuestionsQuestionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionSet__QuestionsAssignment_2"


    // $ANTLR start "rule__QuestionSet__QuestionsAssignment_3"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1221:1: rule__QuestionSet__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__QuestionSet__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1225:1: ( ( ruleQuestion ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1226:1: ( ruleQuestion )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1226:1: ( ruleQuestion )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1227:1: ruleQuestion
            {
             before(grammarAccess.getQuestionSetAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QuestionSet__QuestionsAssignment_32415);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionSetAccess().getQuestionsQuestionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionSet__QuestionsAssignment_3"


    // $ANTLR start "rule__SingleChoice__NameAssignment_1"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1236:1: rule__SingleChoice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SingleChoice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1240:1: ( ( RULE_ID ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1241:1: ( RULE_ID )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1241:1: ( RULE_ID )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1242:1: RULE_ID
            {
             before(grammarAccess.getSingleChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SingleChoice__NameAssignment_12446); 
             after(grammarAccess.getSingleChoiceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__NameAssignment_1"


    // $ANTLR start "rule__SingleChoice__TextAssignment_2"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1251:1: rule__SingleChoice__TextAssignment_2 : ( ruleEString ) ;
    public final void rule__SingleChoice__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1255:1: ( ( ruleEString ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1256:1: ( ruleEString )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1256:1: ( ruleEString )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1257:1: ruleEString
            {
             before(grammarAccess.getSingleChoiceAccess().getTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SingleChoice__TextAssignment_22477);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSingleChoiceAccess().getTextEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__TextAssignment_2"


    // $ANTLR start "rule__SingleChoice__AnswersAssignment_4"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1266:1: rule__SingleChoice__AnswersAssignment_4 : ( ruleAnswer ) ;
    public final void rule__SingleChoice__AnswersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1270:1: ( ( ruleAnswer ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1271:1: ( ruleAnswer )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1271:1: ( ruleAnswer )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1272:1: ruleAnswer
            {
             before(grammarAccess.getSingleChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__SingleChoice__AnswersAssignment_42508);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSingleChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__AnswersAssignment_4"


    // $ANTLR start "rule__SingleChoice__AnswersAssignment_5"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1281:1: rule__SingleChoice__AnswersAssignment_5 : ( ruleAnswer ) ;
    public final void rule__SingleChoice__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1285:1: ( ( ruleAnswer ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1286:1: ( ruleAnswer )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1286:1: ( ruleAnswer )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1287:1: ruleAnswer
            {
             before(grammarAccess.getSingleChoiceAccess().getAnswersAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__SingleChoice__AnswersAssignment_52539);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSingleChoiceAccess().getAnswersAnswerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoice__AnswersAssignment_5"


    // $ANTLR start "rule__MultipleChoice__NameAssignment_1"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1296:1: rule__MultipleChoice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MultipleChoice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1300:1: ( ( RULE_ID ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1301:1: ( RULE_ID )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1301:1: ( RULE_ID )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1302:1: RULE_ID
            {
             before(grammarAccess.getMultipleChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MultipleChoice__NameAssignment_12570); 
             after(grammarAccess.getMultipleChoiceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__NameAssignment_1"


    // $ANTLR start "rule__MultipleChoice__TextAssignment_2"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1311:1: rule__MultipleChoice__TextAssignment_2 : ( ruleEString ) ;
    public final void rule__MultipleChoice__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1315:1: ( ( ruleEString ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1316:1: ( ruleEString )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1316:1: ( ruleEString )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1317:1: ruleEString
            {
             before(grammarAccess.getMultipleChoiceAccess().getTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultipleChoice__TextAssignment_22601);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getTextEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__TextAssignment_2"


    // $ANTLR start "rule__MultipleChoice__AnswersAssignment_4"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1326:1: rule__MultipleChoice__AnswersAssignment_4 : ( ruleAnswer ) ;
    public final void rule__MultipleChoice__AnswersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1330:1: ( ( ruleAnswer ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1331:1: ( ruleAnswer )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1331:1: ( ruleAnswer )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1332:1: ruleAnswer
            {
             before(grammarAccess.getMultipleChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultipleChoice__AnswersAssignment_42632);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__AnswersAssignment_4"


    // $ANTLR start "rule__MultipleChoice__AnswersAssignment_5"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1341:1: rule__MultipleChoice__AnswersAssignment_5 : ( ruleAnswer ) ;
    public final void rule__MultipleChoice__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1345:1: ( ( ruleAnswer ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1346:1: ( ruleAnswer )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1346:1: ( ruleAnswer )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1347:1: ruleAnswer
            {
             before(grammarAccess.getMultipleChoiceAccess().getAnswersAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultipleChoice__AnswersAssignment_52663);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMultipleChoiceAccess().getAnswersAnswerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultipleChoice__AnswersAssignment_5"


    // $ANTLR start "rule__IntValueQuestion__NameAssignment_1"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1356:1: rule__IntValueQuestion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IntValueQuestion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1360:1: ( ( RULE_ID ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1361:1: ( RULE_ID )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1361:1: ( RULE_ID )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1362:1: RULE_ID
            {
             before(grammarAccess.getIntValueQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__IntValueQuestion__NameAssignment_12694); 
             after(grammarAccess.getIntValueQuestionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__NameAssignment_1"


    // $ANTLR start "rule__IntValueQuestion__TextAssignment_2"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1371:1: rule__IntValueQuestion__TextAssignment_2 : ( ruleEString ) ;
    public final void rule__IntValueQuestion__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1375:1: ( ( ruleEString ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1376:1: ( ruleEString )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1376:1: ( ruleEString )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1377:1: ruleEString
            {
             before(grammarAccess.getIntValueQuestionAccess().getTextEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntValueQuestion__TextAssignment_22725);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntValueQuestionAccess().getTextEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__TextAssignment_2"


    // $ANTLR start "rule__IntValueQuestion__ExpectedValueAssignment_4"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1386:1: rule__IntValueQuestion__ExpectedValueAssignment_4 : ( ruleEInt ) ;
    public final void rule__IntValueQuestion__ExpectedValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1390:1: ( ( ruleEInt ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1391:1: ( ruleEInt )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1391:1: ( ruleEInt )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1392:1: ruleEInt
            {
             before(grammarAccess.getIntValueQuestionAccess().getExpectedValueEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntValueQuestion__ExpectedValueAssignment_42756);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntValueQuestionAccess().getExpectedValueEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValueQuestion__ExpectedValueAssignment_4"


    // $ANTLR start "rule__Answer__IsCorrectAssignment_1"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1401:1: rule__Answer__IsCorrectAssignment_1 : ( ( 'X' ) ) ;
    public final void rule__Answer__IsCorrectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1405:1: ( ( ( 'X' ) ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1406:1: ( ( 'X' ) )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1406:1: ( ( 'X' ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1407:1: ( 'X' )
            {
             before(grammarAccess.getAnswerAccess().getIsCorrectXKeyword_1_0()); 
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1408:1: ( 'X' )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1409:1: 'X'
            {
             before(grammarAccess.getAnswerAccess().getIsCorrectXKeyword_1_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Answer__IsCorrectAssignment_12792); 
             after(grammarAccess.getAnswerAccess().getIsCorrectXKeyword_1_0()); 

            }

             after(grammarAccess.getAnswerAccess().getIsCorrectXKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__IsCorrectAssignment_1"


    // $ANTLR start "rule__Answer__TextAssignment_3"
    // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1424:1: rule__Answer__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__Answer__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1428:1: ( ( ruleEString ) )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1429:1: ( ruleEString )
            {
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1429:1: ( ruleEString )
            // ../questions.xtext.ui/src-gen/questions/ui/contentassist/antlr/internal/InternalQuestionsDSL.g:1430:1: ruleEString
            {
             before(grammarAccess.getAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Answer__TextAssignment_32831);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getTextEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__TextAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQuestionSet_in_entryRuleQuestionSet61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionSet68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionSet__Group__0_in_ruleQuestionSet94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoice_in_entryRuleSingleChoice181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleChoice188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__0_in_ruleSingleChoice214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__0_in_ruleMultipleChoice274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValueQuestion_in_entryRuleIntValueQuestion301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValueQuestion308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__Group__0_in_ruleIntValueQuestion334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0_in_ruleAnswer394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoice_in_rule__Question__Alternatives552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_rule__Question__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValueQuestion_in_rule__Question__Alternatives586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionSet__Group__0__Impl_in_rule__QuestionSet__Group__0666 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionSet__Group__1_in_rule__QuestionSet__Group__0669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__QuestionSet__Group__0__Impl697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionSet__Group__1__Impl_in_rule__QuestionSet__Group__1728 = new BitSet(new long[]{0x000000000000D000L});
        public static final BitSet FOLLOW_rule__QuestionSet__Group__2_in_rule__QuestionSet__Group__1731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionSet__NameAssignment_1_in_rule__QuestionSet__Group__1__Impl758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionSet__Group__2__Impl_in_rule__QuestionSet__Group__2788 = new BitSet(new long[]{0x000000000000D000L});
        public static final BitSet FOLLOW_rule__QuestionSet__Group__3_in_rule__QuestionSet__Group__2791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionSet__QuestionsAssignment_2_in_rule__QuestionSet__Group__2__Impl818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionSet__Group__3__Impl_in_rule__QuestionSet__Group__3848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionSet__QuestionsAssignment_3_in_rule__QuestionSet__Group__3__Impl875 = new BitSet(new long[]{0x000000000000D002L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__0__Impl_in_rule__SingleChoice__Group__0914 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__1_in_rule__SingleChoice__Group__0917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__SingleChoice__Group__0__Impl945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__1__Impl_in_rule__SingleChoice__Group__1976 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__2_in_rule__SingleChoice__Group__1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoice__NameAssignment_1_in_rule__SingleChoice__Group__1__Impl1006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__2__Impl_in_rule__SingleChoice__Group__21036 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__3_in_rule__SingleChoice__Group__21039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoice__TextAssignment_2_in_rule__SingleChoice__Group__2__Impl1066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__3__Impl_in_rule__SingleChoice__Group__31096 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__4_in_rule__SingleChoice__Group__31099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__SingleChoice__Group__3__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__4__Impl_in_rule__SingleChoice__Group__41158 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__5_in_rule__SingleChoice__Group__41161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoice__AnswersAssignment_4_in_rule__SingleChoice__Group__4__Impl1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoice__Group__5__Impl_in_rule__SingleChoice__Group__51218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoice__AnswersAssignment_5_in_rule__SingleChoice__Group__5__Impl1245 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__0__Impl_in_rule__MultipleChoice__Group__01288 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__1_in_rule__MultipleChoice__Group__01291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__MultipleChoice__Group__0__Impl1319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__1__Impl_in_rule__MultipleChoice__Group__11350 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__2_in_rule__MultipleChoice__Group__11353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__NameAssignment_1_in_rule__MultipleChoice__Group__1__Impl1380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__2__Impl_in_rule__MultipleChoice__Group__21410 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__3_in_rule__MultipleChoice__Group__21413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__TextAssignment_2_in_rule__MultipleChoice__Group__2__Impl1440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__3__Impl_in_rule__MultipleChoice__Group__31470 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__4_in_rule__MultipleChoice__Group__31473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MultipleChoice__Group__3__Impl1501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__4__Impl_in_rule__MultipleChoice__Group__41532 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__5_in_rule__MultipleChoice__Group__41535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__AnswersAssignment_4_in_rule__MultipleChoice__Group__4__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__Group__5__Impl_in_rule__MultipleChoice__Group__51592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultipleChoice__AnswersAssignment_5_in_rule__MultipleChoice__Group__5__Impl1619 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__Group__0__Impl_in_rule__IntValueQuestion__Group__01662 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__Group__1_in_rule__IntValueQuestion__Group__01665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__IntValueQuestion__Group__0__Impl1693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__Group__1__Impl_in_rule__IntValueQuestion__Group__11724 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__Group__2_in_rule__IntValueQuestion__Group__11727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__NameAssignment_1_in_rule__IntValueQuestion__Group__1__Impl1754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__Group__2__Impl_in_rule__IntValueQuestion__Group__21784 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__Group__3_in_rule__IntValueQuestion__Group__21787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__TextAssignment_2_in_rule__IntValueQuestion__Group__2__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__Group__3__Impl_in_rule__IntValueQuestion__Group__31844 = new BitSet(new long[]{0x0000000000080040L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__Group__4_in_rule__IntValueQuestion__Group__31847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__IntValueQuestion__Group__3__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__Group__4__Impl_in_rule__IntValueQuestion__Group__41906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValueQuestion__ExpectedValueAssignment_4_in_rule__IntValueQuestion__Group__4__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__01973 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__01976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Answer__Group__0__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12035 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__IsCorrectAssignment_1_in_rule__Answer__Group__1__Impl2065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22096 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Answer__Group__2__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__TextAssignment_3_in_rule__Answer__Group__3__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02223 = new BitSet(new long[]{0x0000000000080040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__EInt__Group__0__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__12288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl2315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionSet__NameAssignment_12353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QuestionSet__QuestionsAssignment_22384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QuestionSet__QuestionsAssignment_32415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SingleChoice__NameAssignment_12446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SingleChoice__TextAssignment_22477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__SingleChoice__AnswersAssignment_42508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__SingleChoice__AnswersAssignment_52539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MultipleChoice__NameAssignment_12570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultipleChoice__TextAssignment_22601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultipleChoice__AnswersAssignment_42632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultipleChoice__AnswersAssignment_52663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__IntValueQuestion__NameAssignment_12694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntValueQuestion__TextAssignment_22725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntValueQuestion__ExpectedValueAssignment_42756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Answer__IsCorrectAssignment_12792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Answer__TextAssignment_32831 = new BitSet(new long[]{0x0000000000000002L});
    }


}