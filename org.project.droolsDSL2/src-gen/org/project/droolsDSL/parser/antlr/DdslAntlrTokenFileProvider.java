/*
* generated by Xtext
*/
package org.project.droolsDSL.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DdslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/project/droolsDSL/parser/antlr/internal/InternalDdsl.tokens");
	}
}
