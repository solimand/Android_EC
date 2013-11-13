/*
 * generated by Xtext
 */
package org.project.droolsDSL;

import org.eclipse.xtext.generator.IOutputConfigurationProvider;

import com.google.inject.Binder;
import com.google.inject.Singleton;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DdslRuntimeModule extends org.project.droolsDSL.AbstractDdslRuntimeModule {
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		
		binder.bind(IOutputConfigurationProvider.class).to(MyOutputConfigurationProvider.class).in(Singleton.class);
	}
}
