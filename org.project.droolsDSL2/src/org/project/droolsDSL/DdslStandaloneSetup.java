/*
* generated by Xtext
*/
package org.project.droolsDSL;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DdslStandaloneSetup extends DdslStandaloneSetupGenerated{

	public static void doSetup() {
		new DdslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
