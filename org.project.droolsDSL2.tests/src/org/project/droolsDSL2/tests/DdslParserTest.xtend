package org.project.droolsDSL2.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.project.droolsDSL.DdslInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.project.droolsDSL.ddsl.DroolsModel
import org.junit.Test
import org.junit.Assert
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(DdslInjectorProvider))
class DdslParserTest {
	
	@Inject extension ParseHelper<DroolsModel>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testCorrectParsingSimple() {
		'''
		on Ev1 set F1 to 1;
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testCorrectParsingHard() {
		'''
		on EventoSample1(foo, bar) set FluentSample1 in 10 to 5 if (foo>bar) AND (bar<10) AND ((FluentSample1 at 5) != 1000);
		'''.parse.assertNoErrors
	}


	@Test
	def void testParsing() {
		
		val droolsModel =
		'''
		on Ev1 set F1 to 1;
		on EventoSample1(foo, bar) set FluentSample1 in 10 to 5 if (foo>bar) AND (bar<10) AND ((FluentSample1 at 5) != 1000);
		
		'''.parse
		
		Assert::assertEquals("Ev1", droolsModel.statements.get(0).event.eventName)
		Assert::assertEquals("EventoSample1", droolsModel.statements.get(1).event.eventName)

		Assert::assertEquals("F1", droolsModel.statements.get(0).fluent.get(0).name)
		Assert::assertEquals("FluentSample1", droolsModel.statements.get(1).fluent.get(0).name)
		
		
		Assert::assertEquals("foo", droolsModel.statements.get(1).event.param.get(0).name)
		Assert::assertEquals("bar", droolsModel.statements.get(1).event.param.get(1).name)
		
		/*
		 * TODO:
		 * 		---> param/fluent reference
		 * 		---> expr evaluate 
		 * 		---> cond evaluate 
		 */
	}
	
}