package questions.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import questions.Answer;
import questions.IntValueQuestion;
import questions.MultipleChoice;
import questions.QuestionSet;
import questions.QuestionsPackage;
import questions.SingleChoice;
import questions.services.QuestionsDSLGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractQuestionsDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QuestionsDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == QuestionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QuestionsPackage.ANSWER:
				if(context == grammarAccess.getAnswerRule()) {
					sequence_Answer(context, (Answer) semanticObject); 
					return; 
				}
				else break;
			case QuestionsPackage.INT_VALUE_QUESTION:
				if(context == grammarAccess.getIntValueQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_IntValueQuestion(context, (IntValueQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionsPackage.MULTIPLE_CHOICE:
				if(context == grammarAccess.getMultipleChoiceRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_MultipleChoice(context, (MultipleChoice) semanticObject); 
					return; 
				}
				else break;
			case QuestionsPackage.QUESTION_SET:
				if(context == grammarAccess.getQuestionSetRule()) {
					sequence_QuestionSet(context, (QuestionSet) semanticObject); 
					return; 
				}
				else break;
			case QuestionsPackage.SINGLE_CHOICE:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getSingleChoiceRule()) {
					sequence_SingleChoice(context, (SingleChoice) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (isCorrect?='X'? text=EString)
	 */
	protected void sequence_Answer(EObject context, Answer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=EString expectedValue=EInt)
	 */
	protected void sequence_IntValueQuestion(EObject context, IntValueQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuestionsPackage.Literals.QUESTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionsPackage.Literals.QUESTION__NAME));
			if(transientValues.isValueTransient(semanticObject, QuestionsPackage.Literals.QUESTION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionsPackage.Literals.QUESTION__TEXT));
			if(transientValues.isValueTransient(semanticObject, QuestionsPackage.Literals.INT_VALUE_QUESTION__EXPECTED_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionsPackage.Literals.INT_VALUE_QUESTION__EXPECTED_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntValueQuestionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIntValueQuestionAccess().getTextEStringParserRuleCall_2_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getIntValueQuestionAccess().getExpectedValueEIntParserRuleCall_4_0(), semanticObject.getExpectedValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=EString answers+=Answer answers+=Answer*)
	 */
	protected void sequence_MultipleChoice(EObject context, MultipleChoice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString questions+=Question questions+=Question*)
	 */
	protected void sequence_QuestionSet(EObject context, QuestionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=EString answers+=Answer answers+=Answer*)
	 */
	protected void sequence_SingleChoice(EObject context, SingleChoice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
