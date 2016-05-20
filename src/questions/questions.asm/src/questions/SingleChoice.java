/**
 */
package questions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questions.SingleChoice#getAnswers <em>Answers</em>}</li>
 * </ul>
 * </p>
 *
 * @see questions.QuestionsPackage#getSingleChoice()
 * @model annotation="http://http://www.eclipse.org/emf/2002/Ecore/OCL onlyOneAnswer='self.answers->select(a | a.isCorrect)->size() = 1'"
 * @generated
 */
public interface SingleChoice extends Question {
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
	 * @see questions.QuestionsPackage#getSingleChoice_Answers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Answer> getAnswers();

} // SingleChoice
