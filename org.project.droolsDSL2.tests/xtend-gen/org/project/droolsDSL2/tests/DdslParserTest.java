package org.project.droolsDSL2.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.droolsDSL.DdslInjectorProvider;
import org.project.droolsDSL.ddsl.DroolsModel;
import org.project.droolsDSL.ddsl.Event;
import org.project.droolsDSL.ddsl.EventFeature;
import org.project.droolsDSL.ddsl.Fluent;
import org.project.droolsDSL.ddsl.Statement;

@RunWith(XtextRunner.class)
@InjectWith(DdslInjectorProvider.class)
@SuppressWarnings("all")
public class DdslParserTest {
  @Inject
  @Extension
  private ParseHelper<DroolsModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testCorrectParsingSimple() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("on Ev1 set F1 to 1;");
      _builder.newLine();
      DroolsModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCorrectParsingHard() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("on EventoSample1(foo, bar) set FluentSample1 in 10 to 5 if (foo>bar) AND (bar<10) AND ((FluentSample1 at 5) != 1000);");
      _builder.newLine();
      DroolsModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("on Ev1 set F1 to 1;");
      _builder.newLine();
      _builder.append("on EventoSample1(foo, bar) set FluentSample1 in 10 to 5 if (foo>bar) AND (bar<10) AND ((FluentSample1 at 5) != 1000);");
      _builder.newLine();
      _builder.newLine();
      final DroolsModel droolsModel = this._parseHelper.parse(_builder);
      EList<Statement> _statements = droolsModel.getStatements();
      Statement _get = _statements.get(0);
      Event _event = _get.getEvent();
      String _eventName = _event.getEventName();
      Assert.assertEquals("Ev1", _eventName);
      EList<Statement> _statements_1 = droolsModel.getStatements();
      Statement _get_1 = _statements_1.get(1);
      Event _event_1 = _get_1.getEvent();
      String _eventName_1 = _event_1.getEventName();
      Assert.assertEquals("EventoSample1", _eventName_1);
      EList<Statement> _statements_2 = droolsModel.getStatements();
      Statement _get_2 = _statements_2.get(0);
      EList<Fluent> _fluent = _get_2.getFluent();
      Fluent _get_3 = _fluent.get(0);
      String _name = _get_3.getName();
      Assert.assertEquals("F1", _name);
      EList<Statement> _statements_3 = droolsModel.getStatements();
      Statement _get_4 = _statements_3.get(1);
      EList<Fluent> _fluent_1 = _get_4.getFluent();
      Fluent _get_5 = _fluent_1.get(0);
      String _name_1 = _get_5.getName();
      Assert.assertEquals("FluentSample1", _name_1);
      EList<Statement> _statements_4 = droolsModel.getStatements();
      Statement _get_6 = _statements_4.get(1);
      Event _event_2 = _get_6.getEvent();
      EList<EventFeature> _param = _event_2.getParam();
      EventFeature _get_7 = _param.get(0);
      String _name_2 = _get_7.getName();
      Assert.assertEquals("foo", _name_2);
      EList<Statement> _statements_5 = droolsModel.getStatements();
      Statement _get_8 = _statements_5.get(1);
      Event _event_3 = _get_8.getEvent();
      EList<EventFeature> _param_1 = _event_3.getParam();
      EventFeature _get_9 = _param_1.get(1);
      String _name_3 = _get_9.getName();
      Assert.assertEquals("bar", _name_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
