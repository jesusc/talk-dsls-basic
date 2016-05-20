/**
 */
package questions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questions.MultipleChoice#getAnswers <em>Answers</em>}</li>
 * </ul>
 * </p>
 *
 * @see questions.QuestionsPackage#getMultipleChoice()
 * @model annotation="http://http://www.eclipse.org/emf/2002/Ecore/OCL atLeastOneAnswer='self.answers->any(a | a.isCorrect)'"
 * @generated
 */
public interface MultipleChoice extends Question {
	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link questions.Answer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see questions.QuestionsPackage#getMultipleChoice_Answers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Answer> getAnswers();

} // MultipleChoice
