/*
* generated by Xtext
*/
package org.project.droolsDSL.ui.outline

import org.project.droolsDSL.ddsl.Fluent
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.project.droolsDSL.ddsl.DroolsModel

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class DdslOutlineTreeProvider extends org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider {

	def _isLeaf(Fluent a) { true }
	
	def void _createChildren(DocumentRootNode outlineNode,DroolsModel model) {
		model.statements.forEach[
			statement |
			createNode(outlineNode, statement);
		]
	}	
}
