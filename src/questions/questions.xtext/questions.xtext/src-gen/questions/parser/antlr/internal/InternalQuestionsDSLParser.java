package questions.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import questions.services.QuestionsDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuestionsDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questions'", "'single'", "':'", "'multiple'", "'integer'", "'expecting'", "'['", "'X'", "']'", "'-'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g"; }



     	private QuestionsDSLGrammarAccess grammarAccess;
     	
        public InternalQuestionsDSLParser(TokenStream input, QuestionsDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "QuestionSet";	
       	}
       	
       	@Override
       	protected QuestionsDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQuestionSet"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:67:1: entryRuleQuestionSet returns [EObject current=null] : iv_ruleQuestionSet= ruleQuestionSet EOF ;
    public final EObject entryRuleQuestionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionSet = null;


        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:68:2: (iv_ruleQuestionSet= ruleQuestionSet EOF )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:69:2: iv_ruleQuestionSet= ruleQuestionSet EOF
            {
             newCompositeNode(grammarAccess.getQuestionSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionSet_in_entryRuleQuestionSet75);
            iv_ruleQuestionSet=ruleQuestionSet();

            state._fsp--;

             current =iv_ruleQuestionSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionSet85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestionSet"


    // $ANTLR start "ruleQuestionSet"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:76:1: ruleQuestionSet returns [EObject current=null] : (otherlv_0= 'questions' ( (lv_name_1_0= ruleEString ) ) ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* ) ;
    public final EObject ruleQuestionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_questions_2_0 = null;

        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:79:28: ( (otherlv_0= 'questions' ( (lv_name_1_0= ruleEString ) ) ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:80:1: (otherlv_0= 'questions' ( (lv_name_1_0= ruleEString ) ) ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:80:1: (otherlv_0= 'questions' ( (lv_name_1_0= ruleEString ) ) ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )* )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:80:3: otherlv_0= 'questions' ( (lv_name_1_0= ruleEString ) ) ( (lv_questions_2_0= ruleQuestion ) ) ( (lv_questions_3_0= ruleQuestion ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleQuestionSet122); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionSetAccess().getQuestionsKeyword_0());
                
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:85:1: (lv_name_1_0= ruleEString )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:86:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionSetAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionSet143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionSetRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:102:2: ( (lv_questions_2_0= ruleQuestion ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:103:1: (lv_questions_2_0= ruleQuestion )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:103:1: (lv_questions_2_0= ruleQuestion )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:104:3: lv_questions_2_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getQuestionSetAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQuestionSet164);
            lv_questions_2_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionSetRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_2_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:120:2: ( (lv_questions_3_0= ruleQuestion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:121:1: (lv_questions_3_0= ruleQuestion )
            	    {
            	    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:121:1: (lv_questions_3_0= ruleQuestion )
            	    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:122:3: lv_questions_3_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionSetAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQuestionSet185);
            	    lv_questions_3_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_3_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionSet"


    // $ANTLR start "entryRuleQuestion"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:146:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:147:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:148:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion222);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion232); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:155:1: ruleQuestion returns [EObject current=null] : (this_SingleChoice_0= ruleSingleChoice | this_MultipleChoice_1= ruleMultipleChoice | this_IntValueQuestion_2= ruleIntValueQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_SingleChoice_0 = null;

        EObject this_MultipleChoice_1 = null;

        EObject this_IntValueQuestion_2 = null;


         enterRule(); 
            
        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:158:28: ( (this_SingleChoice_0= ruleSingleChoice | this_MultipleChoice_1= ruleMultipleChoice | this_IntValueQuestion_2= ruleIntValueQuestion ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:159:1: (this_SingleChoice_0= ruleSingleChoice | this_MultipleChoice_1= ruleMultipleChoice | this_IntValueQuestion_2= ruleIntValueQuestion )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:159:1: (this_SingleChoice_0= ruleSingleChoice | this_MultipleChoice_1= ruleMultipleChoice | this_IntValueQuestion_2= ruleIntValueQuestion )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:160:5: this_SingleChoice_0= ruleSingleChoice
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleChoiceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSingleChoice_in_ruleQuestion279);
                    this_SingleChoice_0=ruleSingleChoice();

                    state._fsp--;

                     
                            current = this_SingleChoice_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:170:5: this_MultipleChoice_1= ruleMultipleChoice
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_ruleQuestion306);
                    this_MultipleChoice_1=ruleMultipleChoice();

                    state._fsp--;

                     
                            current = this_MultipleChoice_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:180:5: this_IntValueQuestion_2= ruleIntValueQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getIntValueQuestionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntValueQuestion_in_ruleQuestion333);
                    this_IntValueQuestion_2=ruleIntValueQuestion();

                    state._fsp--;

                     
                            current = this_IntValueQuestion_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleSingleChoice"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:196:1: entryRuleSingleChoice returns [EObject current=null] : iv_ruleSingleChoice= ruleSingleChoice EOF ;
    public final EObject entryRuleSingleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleChoice = null;


        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:197:2: (iv_ruleSingleChoice= ruleSingleChoice EOF )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:198:2: iv_ruleSingleChoice= ruleSingleChoice EOF
            {
             newCompositeNode(grammarAccess.getSingleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleChoice_in_entryRuleSingleChoice368);
            iv_ruleSingleChoice=ruleSingleChoice();

            state._fsp--;

             current =iv_ruleSingleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleChoice378); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleChoice"


    // $ANTLR start "ruleSingleChoice"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:205:1: ruleSingleChoice returns [EObject current=null] : (otherlv_0= 'single' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_answers_4_0= ruleAnswer ) ) ( (lv_answers_5_0= ruleAnswer ) )* ) ;
    public final EObject ruleSingleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;

        EObject lv_answers_4_0 = null;

        EObject lv_answers_5_0 = null;


         enterRule(); 
            
        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:208:28: ( (otherlv_0= 'single' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_answers_4_0= ruleAnswer ) ) ( (lv_answers_5_0= ruleAnswer ) )* ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:209:1: (otherlv_0= 'single' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_answers_4_0= ruleAnswer ) ) ( (lv_answers_5_0= ruleAnswer ) )* )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:209:1: (otherlv_0= 'single' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_answers_4_0= ruleAnswer ) ) ( (lv_answers_5_0= ruleAnswer ) )* )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:209:3: otherlv_0= 'single' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_answers_4_0= ruleAnswer ) ) ( (lv_answers_5_0= ruleAnswer ) )*
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSingleChoice415); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleChoiceAccess().getSingleKeyword_0());
                
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:213:1: ( (lv_name_1_0= RULE_ID ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:214:1: (lv_name_1_0= RULE_ID )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:214:1: (lv_name_1_0= RULE_ID )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:215:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleChoice432); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSingleChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:231:2: ( (lv_text_2_0= ruleEString ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:232:1: (lv_text_2_0= ruleEString )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:232:1: (lv_text_2_0= ruleEString )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:233:3: lv_text_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSingleChoiceAccess().getTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSingleChoice458);
            lv_text_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleChoiceRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSingleChoice470); 

                	newLeafNode(otherlv_3, grammarAccess.getSingleChoiceAccess().getColonKeyword_3());
                
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:253:1: ( (lv_answers_4_0= ruleAnswer ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:254:1: (lv_answers_4_0= ruleAnswer )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:254:1: (lv_answers_4_0= ruleAnswer )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:255:3: lv_answers_4_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getSingleChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleSingleChoice491);
            lv_answers_4_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleChoiceRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_4_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:271:2: ( (lv_answers_5_0= ruleAnswer ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:272:1: (lv_answers_5_0= ruleAnswer )
            	    {
            	    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:272:1: (lv_answers_5_0= ruleAnswer )
            	    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:273:3: lv_answers_5_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleChoiceAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleSingleChoice512);
            	    lv_answers_5_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleChoiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_5_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleChoice"


    // $ANTLR start "entryRuleMultipleChoice"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:297:1: entryRuleMultipleChoice returns [EObject current=null] : iv_ruleMultipleChoice= ruleMultipleChoice EOF ;
    public final EObject entryRuleMultipleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoice = null;


        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:298:2: (iv_ruleMultipleChoice= ruleMultipleChoice EOF )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:299:2: iv_ruleMultipleChoice= ruleMultipleChoice EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice549);
            iv_ruleMultipleChoice=ruleMultipleChoice();

            state._fsp--;

             current =iv_ruleMultipleChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultipleChoice559); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleChoice"


    // $ANTLR start "ruleMultipleChoice"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:306:1: ruleMultipleChoice returns [EObject current=null] : (otherlv_0= 'multiple' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_answers_4_0= ruleAnswer ) ) ( (lv_answers_5_0= ruleAnswer ) )* ) ;
    public final EObject ruleMultipleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;

        EObject lv_answers_4_0 = null;

        EObject lv_answers_5_0 = null;


         enterRule(); 
            
        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:309:28: ( (otherlv_0= 'multiple' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_answers_4_0= ruleAnswer ) ) ( (lv_answers_5_0= ruleAnswer ) )* ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:310:1: (otherlv_0= 'multiple' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_answers_4_0= ruleAnswer ) ) ( (lv_answers_5_0= ruleAnswer ) )* )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:310:1: (otherlv_0= 'multiple' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_answers_4_0= ruleAnswer ) ) ( (lv_answers_5_0= ruleAnswer ) )* )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:310:3: otherlv_0= 'multiple' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_answers_4_0= ruleAnswer ) ) ( (lv_answers_5_0= ruleAnswer ) )*
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultipleChoice596); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleChoiceAccess().getMultipleKeyword_0());
                
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:314:1: ( (lv_name_1_0= RULE_ID ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:315:1: (lv_name_1_0= RULE_ID )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:315:1: (lv_name_1_0= RULE_ID )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:316:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultipleChoice613); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMultipleChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultipleChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:332:2: ( (lv_text_2_0= ruleEString ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:333:1: (lv_text_2_0= ruleEString )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:333:1: (lv_text_2_0= ruleEString )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:334:3: lv_text_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultipleChoice639);
            lv_text_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultipleChoice651); 

                	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceAccess().getColonKeyword_3());
                
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:354:1: ( (lv_answers_4_0= ruleAnswer ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:355:1: (lv_answers_4_0= ruleAnswer )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:355:1: (lv_answers_4_0= ruleAnswer )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:356:3: lv_answers_4_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultipleChoice672);
            lv_answers_4_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_4_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:372:2: ( (lv_answers_5_0= ruleAnswer ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:373:1: (lv_answers_5_0= ruleAnswer )
            	    {
            	    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:373:1: (lv_answers_5_0= ruleAnswer )
            	    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:374:3: lv_answers_5_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleMultipleChoice693);
            	    lv_answers_5_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_5_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleChoice"


    // $ANTLR start "entryRuleIntValueQuestion"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:398:1: entryRuleIntValueQuestion returns [EObject current=null] : iv_ruleIntValueQuestion= ruleIntValueQuestion EOF ;
    public final EObject entryRuleIntValueQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValueQuestion = null;


        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:399:2: (iv_ruleIntValueQuestion= ruleIntValueQuestion EOF )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:400:2: iv_ruleIntValueQuestion= ruleIntValueQuestion EOF
            {
             newCompositeNode(grammarAccess.getIntValueQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntValueQuestion_in_entryRuleIntValueQuestion730);
            iv_ruleIntValueQuestion=ruleIntValueQuestion();

            state._fsp--;

             current =iv_ruleIntValueQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValueQuestion740); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValueQuestion"


    // $ANTLR start "ruleIntValueQuestion"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:407:1: ruleIntValueQuestion returns [EObject current=null] : (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= 'expecting' ( (lv_expectedValue_4_0= ruleEInt ) ) ) ;
    public final EObject ruleIntValueQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;

        AntlrDatatypeRuleToken lv_expectedValue_4_0 = null;


         enterRule(); 
            
        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:410:28: ( (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= 'expecting' ( (lv_expectedValue_4_0= ruleEInt ) ) ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:411:1: (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= 'expecting' ( (lv_expectedValue_4_0= ruleEInt ) ) )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:411:1: (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= 'expecting' ( (lv_expectedValue_4_0= ruleEInt ) ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:411:3: otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= ruleEString ) ) otherlv_3= 'expecting' ( (lv_expectedValue_4_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntValueQuestion777); 

                	newLeafNode(otherlv_0, grammarAccess.getIntValueQuestionAccess().getIntegerKeyword_0());
                
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:415:1: ( (lv_name_1_0= RULE_ID ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:416:1: (lv_name_1_0= RULE_ID )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:416:1: (lv_name_1_0= RULE_ID )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:417:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIntValueQuestion794); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIntValueQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntValueQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:433:2: ( (lv_text_2_0= ruleEString ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:434:1: (lv_text_2_0= ruleEString )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:434:1: (lv_text_2_0= ruleEString )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:435:3: lv_text_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntValueQuestionAccess().getTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntValueQuestion820);
            lv_text_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntValueQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntValueQuestion832); 

                	newLeafNode(otherlv_3, grammarAccess.getIntValueQuestionAccess().getExpectingKeyword_3());
                
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:455:1: ( (lv_expectedValue_4_0= ruleEInt ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:456:1: (lv_expectedValue_4_0= ruleEInt )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:456:1: (lv_expectedValue_4_0= ruleEInt )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:457:3: lv_expectedValue_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntValueQuestionAccess().getExpectedValueEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntValueQuestion853);
            lv_expectedValue_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntValueQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"expectedValue",
                    		lv_expectedValue_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValueQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:481:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:482:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:483:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer889);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer899); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:490:1: ruleAnswer returns [EObject current=null] : (otherlv_0= '[' ( (lv_isCorrect_1_0= 'X' ) )? otherlv_2= ']' ( (lv_text_3_0= ruleEString ) ) ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isCorrect_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;


         enterRule(); 
            
        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:493:28: ( (otherlv_0= '[' ( (lv_isCorrect_1_0= 'X' ) )? otherlv_2= ']' ( (lv_text_3_0= ruleEString ) ) ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:494:1: (otherlv_0= '[' ( (lv_isCorrect_1_0= 'X' ) )? otherlv_2= ']' ( (lv_text_3_0= ruleEString ) ) )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:494:1: (otherlv_0= '[' ( (lv_isCorrect_1_0= 'X' ) )? otherlv_2= ']' ( (lv_text_3_0= ruleEString ) ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:494:3: otherlv_0= '[' ( (lv_isCorrect_1_0= 'X' ) )? otherlv_2= ']' ( (lv_text_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswer936); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getLeftSquareBracketKeyword_0());
                
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:498:1: ( (lv_isCorrect_1_0= 'X' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:499:1: (lv_isCorrect_1_0= 'X' )
                    {
                    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:499:1: (lv_isCorrect_1_0= 'X' )
                    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:500:3: lv_isCorrect_1_0= 'X'
                    {
                    lv_isCorrect_1_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAnswer954); 

                            newLeafNode(lv_isCorrect_1_0, grammarAccess.getAnswerAccess().getIsCorrectXKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "isCorrect", true, "X");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAnswer980); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getRightSquareBracketKeyword_2());
                
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:517:1: ( (lv_text_3_0= ruleEString ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:518:1: (lv_text_3_0= ruleEString )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:518:1: (lv_text_3_0= ruleEString )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:519:3: lv_text_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnswer1001);
            lv_text_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleEInt"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:543:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:544:2: (iv_ruleEInt= ruleEInt EOF )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:545:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1038);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1049); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:552:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:555:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:556:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:556:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:556:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:556:2: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:557:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEInt1088); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1105); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:577:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:578:2: (iv_ruleEString= ruleEString EOF )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:579:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1151);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1162); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:586:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:589:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:590:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:590:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:590:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1202); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../questions.xtext/src-gen/questions/parser/antlr/internal/InternalQuestionsDSL.g:598:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1228); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQuestionSet_in_entryRuleQuestionSet75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionSet85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleQuestionSet122 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionSet143 = new BitSet(new long[]{0x000000000000D000L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionSet164 = new BitSet(new long[]{0x000000000000D002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionSet185 = new BitSet(new long[]{0x000000000000D002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion222 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoice_in_ruleQuestion279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_ruleQuestion306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValueQuestion_in_ruleQuestion333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoice_in_entryRuleSingleChoice368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleChoice378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleSingleChoice415 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleChoice432 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSingleChoice458 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSingleChoice470 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleSingleChoice491 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleSingleChoice512 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleMultipleChoice_in_entryRuleMultipleChoice549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoice559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleMultipleChoice596 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleChoice613 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultipleChoice639 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMultipleChoice651 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultipleChoice672 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleMultipleChoice693 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleIntValueQuestion_in_entryRuleIntValueQuestion730 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValueQuestion740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleIntValueQuestion777 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIntValueQuestion794 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntValueQuestion820 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntValueQuestion832 = new BitSet(new long[]{0x0000000000100020L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntValueQuestion853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer889 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAnswer936 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleAnswer954 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAnswer980 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnswer1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1038 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleEInt1088 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1151 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1228 = new BitSet(new long[]{0x0000000000000002L});
    }


}