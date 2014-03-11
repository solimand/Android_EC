package org.project.droolsDSL2.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.project.droolsDSL.DdslInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.project.droolsDSL.scoping.DdslIndex
import org.junit.Test
import org.project.droolsDSL.ddsl.DroolsModel
import org.eclipse.emf.ecore.EObject

import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(DdslInjectorProvider))
class DdslIndexTest {
	@Inject extension ParseHelper<DroolsModel>
	@Inject extension DdslIndex
	
	@Test
	def void testExportedEObjectDescriptions() {
		'''
			on Ev1(x,y,z) set F1 to 1
		'''.parse. assertExportedEObjectDescriptions("x, y, z, F1")
	}
	
	def private assertExportedEObjectDescriptions(EObject o,CharSequence expected) {
		expected.toString.assertEquals(
			o.getExportedEObjectDescriptions.map[qualifiedName].join(", ")
		)
	}
}