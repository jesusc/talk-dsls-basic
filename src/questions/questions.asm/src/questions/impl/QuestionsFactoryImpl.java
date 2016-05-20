/**
 */
package questions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import questions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionsFactoryImpl extends EFactoryImpl implements QuestionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionsFactory init() {
		try {
			QuestionsFactory theQuestionsFactory = (QuestionsFactory)EPackage.Registry.INSTANCE.getEFactory(QuestionsPackage.eNS_URI);
			if (theQuestionsFactory != null) {
				return theQuestionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuestionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QuestionsPackage.QUESTION_SET: return createQuestionSet();
			case QuestionsPackage.SINGLE_CHOICE: return createSingleChoice();
			case QuestionsPackage.MULTIPLE_CHOICE: return createMultipleChoice();
			case QuestionsPackage.INT_VALUE_QUESTION: return createIntValueQuestion();
			case QuestionsPackage.ANSWER: return createAnswer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionSet createQuestionSet() {
		QuestionSetImpl questionSet = new QuestionSetImpl();
		return questionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleChoice createSingleChoice() {
		SingleChoiceImpl singleChoice = new SingleChoiceImpl();
		return singleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice createMultipleChoice() {
		MultipleChoiceImpl multipleChoice = new MultipleChoiceImpl();
		return multipleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntValueQuestion createIntValueQuestion() {
		IntValueQuestionImpl intValueQuestion = new IntValueQuestionImpl();
		return intValueQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionsPackage getQuestionsPackage() {
		return (QuestionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuestionsPackage getPackage() {
		return QuestionsPackage.eINSTANCE;
	}

} //QuestionsFactoryImpl
