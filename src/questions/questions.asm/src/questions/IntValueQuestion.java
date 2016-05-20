/**
 */
package questions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Value Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questions.IntValueQuestion#getExpectedValue <em>Expected Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see questions.QuestionsPackage#getIntValueQuestion()
 * @model
 * @generated
 */
public interface IntValueQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Expected Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Value</em>' attribute.
	 * @see #setExpectedValue(int)
	 * @see questions.QuestionsPackage#getIntValueQuestion_ExpectedValue()
	 * @model required="true"
	 * @generated
	 */
	int getExpectedValue();

	/**
	 * Sets the value of the '{@link questions.IntValueQuestion#getExpectedValue <em>Expected Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Value</em>' attribute.
	 * @see #getExpectedValue()
	 * @generated
	 */
	void setExpectedValue(int value);

} // IntValueQuestion
