/*
* generated by Xtext
*/
package questions;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QuestionsDSLStandaloneSetup extends QuestionsDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new QuestionsDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
