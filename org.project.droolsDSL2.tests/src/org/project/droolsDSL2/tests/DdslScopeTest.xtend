package org.project.droolsDSL2.tests

//import org.eclipse.xtext.scoping.IScopeProvider
//import org.eclipse.xtext.junit4.util.ParseHelper
//import org.project.droolsDSL.ddsl.DroolsModel
import org.project.droolsDSL.DdslInjectorProvider
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
//import com.google.inject.Inject

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(DdslInjectorProvider))
class DdslScopeTest {
//	@Inject extension ParseHelper<DroolsModel>
//	@Inject extension IScopeProvider
//	
//	val model = '''
//	on Ev1(foo, bar) set F1 to foo;
//	'''.parse 
//	
//	val scope = getScope(model.statements.get(0).fluent.get(0).valuePart..., eINSTANCE...)
//	
//	val actual = scope.allElements.map[].join(", ")
//	
//	assertEquals("...", actual) 
}