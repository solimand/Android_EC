/*
 * generated by Xtext
 */
package org.project.droolsDSL.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.project.droolsDSL.ui.internal.DdslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DdslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DdslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DdslActivator.getInstance().getInjector(DdslActivator.ORG_PROJECT_DROOLSDSL_DDSL);
	}
	
}
