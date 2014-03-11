package org.project.droolsDSL2.tests

import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.junit4.util.ParseHelper
import org.project.droolsDSL.ddsl.DroolsModel
import org.project.droolsDSL.DdslInjectorProvider
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

import static extension org.junit.Assert.*
import org.junit.Test
import org.project.droolsDSL.ddsl.DdslPackage
import org.project.droolsDSL.ddsl.Fluent

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(DdslInjectorProvider))
class DdslScopeTest {
	@Inject extension ParseHelper<DroolsModel>
	@Inject extension IScopeProvider
	@Inject extension ValidationTestHelper
	
	@Test def void testScopeProvider() {
//		'''
//			on Ev1 set F1 to 1;
//			on EventoSample1(foo, bar) set FluentSample1 in 10 to 5 if (foo>bar) AND (bar<10) AND ((F1 at 5) != 1000);
//		'''.parse.statements.head.fluent.=> [
//			assertScope(DdslPackage::eINSTANCE.Reference_Ref,"p, v, m.p, m.v, C.m.p, C.m.v")
//		]
	}
	
	
	def private assertScope(EObject context, EReference reference, CharSequence expected) {
		context.assertNoErrors
		expected.toString.assertEquals(
			context.getScope(reference).allElements.map[name].join(", ")
		)
	}
}