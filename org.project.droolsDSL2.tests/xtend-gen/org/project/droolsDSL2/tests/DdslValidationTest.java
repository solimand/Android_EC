package org.project.droolsDSL2.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.droolsDSL.DdslInjectorProvider;
import org.project.droolsDSL.ddsl.DdslPackage;
import org.project.droolsDSL.ddsl.DroolsModel;
import org.project.droolsDSL.validation.DdslValidator;

@RunWith(XtextRunner.class)
@InjectWith(DdslInjectorProvider.class)
@SuppressWarnings("all")
public class DdslValidationTest {
  @Inject
  @Extension
  private ParseHelper<DroolsModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testValidationEventName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("on ev1 set F1 to 1;");
      _builder.newLine();
      DroolsModel _parse = this._parseHelper.parse(_builder);
      EClass _event = DdslPackage.eINSTANCE.getEvent();
      this._validationTestHelper.assertError(_parse, _event, DdslValidator.EVENT_LOWERCASE);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testValidationFluentName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("on Ev1 set f1 to 1;");
      _builder.newLine();
      DroolsModel _parse = this._parseHelper.parse(_builder);
      EClass _fluent = DdslPackage.eINSTANCE.getFluent();
      this._validationTestHelper.assertError(_parse, _fluent, DdslValidator.FLUENT_LOWERCASE);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testValidationParametersName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("on Ev1(Param) set F1 to 1;");
      _builder.newLine();
      DroolsModel _parse = this._parseHelper.parse(_builder);
      EClass _eventFeature = DdslPackage.eINSTANCE.getEventFeature();
      this._validationTestHelper.assertError(_parse, _eventFeature, DdslValidator.PARAM_UPPERCASE);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
