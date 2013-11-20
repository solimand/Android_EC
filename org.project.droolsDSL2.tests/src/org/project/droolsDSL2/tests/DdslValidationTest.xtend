package org.project.droolsDSL2.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.junit4.util.ParseHelper
import org.project.droolsDSL.ddsl.DroolsModel
import org.junit.Test
import org.project.droolsDSL.ddsl.DdslPackage
import org.project.droolsDSL.validation.DdslValidator
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.project.droolsDSL.DdslInjectorProvider
import org.eclipse.xtext.junit4.InjectWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(DdslInjectorProvider))
class DdslValidationTest {
	
	@Inject extension ParseHelper<DroolsModel>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testValidationEventName() {
		'''
		on ev1 set F1 to 1;
		'''.parse.assertError(DdslPackage::eINSTANCE.event, DdslValidator::EVENT_LOWERCASE)
	}
	
	@Test
	def void testValidationFluentName() {
		'''
		on Ev1 set f1 to 1;
		'''.parse.assertError(DdslPackage::eINSTANCE.fluent, DdslValidator::FLUENT_LOWERCASE)
	}
	
	@Test
	def void testValidationParametersName() {
		'''
		on Ev1(Param) set F1 to 1;
		'''.parse.assertError(DdslPackage::eINSTANCE.eventFeature, DdslValidator::PARAM_UPPERCASE)
	}	
	
}