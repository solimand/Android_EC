package org.project.droolsDSL;

import static com.google.common.collect.Sets.newHashSet;
import java.util.Set;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class MyOutputConfigurationProvider implements IOutputConfigurationProvider {

	  public static final String APP_GEN_OUTPUT = "app-gen";
	  public static final String APPLICATION_NAME = "MedicalEC";


	  public Set<OutputConfiguration> getOutputConfigurations() {
			OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
			defaultOutput.setDescription("Output Folder");
			defaultOutput.setOutputDirectory("./src-gen");
			defaultOutput.setOverrideExistingResources(true);
			defaultOutput.setCreateOutputDirectory(true);
			defaultOutput.setCleanUpDerivedResources(true);
			defaultOutput.setSetDerivedProperty(true);
			
			OutputConfiguration appOutput = new OutputConfiguration(APP_GEN_OUTPUT);
		    appOutput.setDescription("Application Output Folder");
		    appOutput.setOutputDirectory("./"+APPLICATION_NAME);
		    appOutput.setOverrideExistingResources(true);
		    appOutput.setCreateOutputDirectory(true);
		    appOutput.setCleanUpDerivedResources(false);
		    appOutput.setSetDerivedProperty(false);

			return newHashSet(defaultOutput, appOutput);
		}

	}