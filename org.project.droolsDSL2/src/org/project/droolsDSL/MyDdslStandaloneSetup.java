/*
* generated by Xtext
*/
package org.project.droolsDSL;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MyDdslStandaloneSetup extends DdslStandaloneSetupGenerated{

	public static void doSetup() {
		new MyDdslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
