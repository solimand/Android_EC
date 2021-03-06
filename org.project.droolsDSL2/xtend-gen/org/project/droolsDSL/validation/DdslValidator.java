/**
 * generated by Xtext
 */
package org.project.droolsDSL.validation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.xtext.validation.Check;
import org.project.droolsDSL.ddsl.DdslPackage;
import org.project.droolsDSL.ddsl.Event;
import org.project.droolsDSL.ddsl.EventFeature;
import org.project.droolsDSL.ddsl.Fluent;
import org.project.droolsDSL.validation.AbstractDdslValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class DdslValidator extends AbstractDdslValidator {
  public final static String EVENT_LOWERCASE = "org.project.droolsDSL.ddsl.EventLowercase";
  
  public final static String FLUENT_LOWERCASE = "org.project.droolsDSL.ddsl.FluentLowercase";
  
  public final static String PARAM_UPPERCASE = "org.project.droolsDSL.ddsl.ParamUppercase";
  
  @Check
  public void checkEventNameStartsWithCapital(final Event event) {
    String _eventName = event.getEventName();
    char _charAt = _eventName.charAt(0);
    boolean _isLowerCase = Character.isLowerCase(_charAt);
    if (_isLowerCase) {
      EAttribute _event_EventName = DdslPackage.eINSTANCE.getEvent_EventName();
      String _eventName_1 = event.getEventName();
      this.error("Event name should start with a capital", _event_EventName, 
        DdslValidator.EVENT_LOWERCASE, _eventName_1);
    }
  }
  
  @Check
  public void checkFluentNameStartsWithCapital(final Fluent fluent) {
    String _name = fluent.getName();
    char _charAt = _name.charAt(0);
    boolean _isLowerCase = Character.isLowerCase(_charAt);
    if (_isLowerCase) {
      EAttribute _referenceType_Name = DdslPackage.eINSTANCE.getReferenceType_Name();
      String _name_1 = fluent.getName();
      this.error("Fluent name should start with a capital", _referenceType_Name, 
        DdslValidator.FLUENT_LOWERCASE, _name_1);
    }
  }
  
  @Check
  public void checkParamNameStartsWithLower(final EventFeature param) {
    String _name = param.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    if (_isUpperCase) {
      EAttribute _referenceType_Name = DdslPackage.eINSTANCE.getReferenceType_Name();
      String _name_1 = param.getName();
      this.error("Event Feature name should start with a lowercase", _referenceType_Name, 
        DdslValidator.PARAM_UPPERCASE, _name_1);
    }
  }
}
