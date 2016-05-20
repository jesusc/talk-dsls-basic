/*
* generated by Xtext
*/
grammar InternalQuestionsDSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package questions.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleQuestionSet
entryRuleQuestionSet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionSetRule()); }
	 iv_ruleQuestionSet=ruleQuestionSet 
	 { $current=$iv_ruleQuestionSet.current; } 
	 EOF 
;

// Rule QuestionSet
ruleQuestionSet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='questions' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQuestionSetAccess().getQuestionsKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionSetAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionSetRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionSetAccess().getQuestionsQuestionParserRuleCall_2_0()); 
	    }
		lv_questions_2_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionSetRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_2_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionSetAccess().getQuestionsQuestionParserRuleCall_3_0()); 
	    }
		lv_questions_3_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionSetRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_3_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getSingleChoiceParserRuleCall_0()); 
    }
    this_SingleChoice_0=ruleSingleChoice
    { 
        $current = $this_SingleChoice_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoiceParserRuleCall_1()); 
    }
    this_MultipleChoice_1=ruleMultipleChoice
    { 
        $current = $this_MultipleChoice_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getIntValueQuestionParserRuleCall_2()); 
    }
    this_IntValueQuestion_2=ruleIntValueQuestion
    { 
        $current = $this_IntValueQuestion_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleSingleChoice
entryRuleSingleChoice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSingleChoiceRule()); }
	 iv_ruleSingleChoice=ruleSingleChoice 
	 { $current=$iv_ruleSingleChoice.current; } 
	 EOF 
;

// Rule SingleChoice
ruleSingleChoice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='single' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSingleChoiceAccess().getSingleKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSingleChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSingleChoiceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSingleChoiceAccess().getTextEStringParserRuleCall_2_0()); 
	    }
		lv_text_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleChoiceRule());
	        }
       		set(
       			$current, 
       			"text",
        		lv_text_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSingleChoiceAccess().getColonKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSingleChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 
	    }
		lv_answers_4_0=ruleAnswer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleChoiceRule());
	        }
       		add(
       			$current, 
       			"answers",
        		lv_answers_4_0, 
        		"Answer");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSingleChoiceAccess().getAnswersAnswerParserRuleCall_5_0()); 
	    }
		lv_answers_5_0=ruleAnswer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleChoiceRule());
	        }
       		add(
       			$current, 
       			"answers",
        		lv_answers_5_0, 
        		"Answer");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleMultipleChoice
entryRuleMultipleChoice returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultipleChoiceRule()); }
	 iv_ruleMultipleChoice=ruleMultipleChoice 
	 { $current=$iv_ruleMultipleChoice.current; } 
	 EOF 
;

// Rule MultipleChoice
ruleMultipleChoice returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='multiple' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMultipleChoiceAccess().getMultipleKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMultipleChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultipleChoiceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getTextEStringParserRuleCall_2_0()); 
	    }
		lv_text_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
	        }
       		set(
       			$current, 
       			"text",
        		lv_text_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceAccess().getColonKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getAnswersAnswerParserRuleCall_4_0()); 
	    }
		lv_answers_4_0=ruleAnswer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
	        }
       		add(
       			$current, 
       			"answers",
        		lv_answers_4_0, 
        		"Answer");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMultipleChoiceAccess().getAnswersAnswerParserRuleCall_5_0()); 
	    }
		lv_answers_5_0=ruleAnswer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultipleChoiceRule());
	        }
       		add(
       			$current, 
       			"answers",
        		lv_answers_5_0, 
        		"Answer");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleIntValueQuestion
entryRuleIntValueQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntValueQuestionRule()); }
	 iv_ruleIntValueQuestion=ruleIntValueQuestion 
	 { $current=$iv_ruleIntValueQuestion.current; } 
	 EOF 
;

// Rule IntValueQuestion
ruleIntValueQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='integer' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIntValueQuestionAccess().getIntegerKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getIntValueQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntValueQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getIntValueQuestionAccess().getTextEStringParserRuleCall_2_0()); 
	    }
		lv_text_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntValueQuestionRule());
	        }
       		set(
       			$current, 
       			"text",
        		lv_text_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='expecting' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIntValueQuestionAccess().getExpectingKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIntValueQuestionAccess().getExpectedValueEIntParserRuleCall_4_0()); 
	    }
		lv_expectedValue_4_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntValueQuestionRule());
	        }
       		set(
       			$current, 
       			"expectedValue",
        		lv_expectedValue_4_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleAnswer
entryRuleAnswer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnswerRule()); }
	 iv_ruleAnswer=ruleAnswer 
	 { $current=$iv_ruleAnswer.current; } 
	 EOF 
;

// Rule Answer
ruleAnswer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='[' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getLeftSquareBracketKeyword_0());
    }
(
(
		lv_isCorrect_1_0=	'X' 
    {
        newLeafNode(lv_isCorrect_1_0, grammarAccess.getAnswerAccess().getIsCorrectXKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAnswerRule());
	        }
       		setWithLastConsumed($current, "isCorrect", true, "X");
	    }

)
)?	otherlv_2=']' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getRightSquareBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnswerAccess().getTextEStringParserRuleCall_3_0()); 
	    }
		lv_text_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnswerRule());
	        }
       		set(
       			$current, 
       			"text",
        		lv_text_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;







RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

