package org.project.droolsDSL.scoping

import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject

class DdslIndex {
	@Inject ResourceDescriptionsProvider rdp
	
	def getResourceDescription(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource)
		index.getResourceDescription(o.eResource.URI)
	}
	
	def getExportedEObjectDescriptions(EObject o) {o.getResourceDescription.getExportedObjects}
}