/*
 * generated by Xtext
 */
package org.project.droolsDSL.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractDdslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.project.droolsDSL.ddsl.DdslPackage.eINSTANCE);
		return result;
	}
}