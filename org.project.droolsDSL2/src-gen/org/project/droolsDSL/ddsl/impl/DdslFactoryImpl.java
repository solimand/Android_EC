/**
 */
package org.project.droolsDSL.ddsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.project.droolsDSL.ddsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DdslFactoryImpl extends EFactoryImpl implements DdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DdslFactory init()
  {
    try
    {
      DdslFactory theDdslFactory = (DdslFactory)EPackage.Registry.INSTANCE.getEFactory(DdslPackage.eNS_URI);
      if (theDdslFactory != null)
      {
        return theDdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DdslPackage.DROOLS_MODEL: return createDroolsModel();
      case DdslPackage.STATEMENT: return createStatement();
      case DdslPackage.EVENT: return createEvent();
      case DdslPackage.FLUENT: return createFluent();
      case DdslPackage.CONDITION_RULE: return createConditionRule();
      case DdslPackage.TO_RULE: return createToRule();
      case DdslPackage.IN_RULE: return createInRule();
      case DdslPackage.EVENT_FEATURE: return createEventFeature();
      case DdslPackage.EXPRESSION: return createExpression();
      case DdslPackage.REFERENCE_TYPE: return createReferenceType();
      case DdslPackage.OR: return createOr();
      case DdslPackage.AND: return createAnd();
      case DdslPackage.EQUALITY: return createEquality();
      case DdslPackage.COMPARISON: return createComparison();
      case DdslPackage.PLUS: return createPlus();
      case DdslPackage.MINUS: return createMinus();
      case DdslPackage.MUL_OR_DIV: return createMulOrDiv();
      case DdslPackage.NOT: return createNot();
      case DdslPackage.FLOAT_CONSTANT: return createFloatConstant();
      case DdslPackage.INT_CONSTANT: return createIntConstant();
      case DdslPackage.BOOL_CONSTANT: return createBoolConstant();
      case DdslPackage.REFERENCE: return createReference();
      case DdslPackage.CURRENT_TIME: return createCurrentTime();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroolsModel createDroolsModel()
  {
    DroolsModelImpl droolsModel = new DroolsModelImpl();
    return droolsModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fluent createFluent()
  {
    FluentImpl fluent = new FluentImpl();
    return fluent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionRule createConditionRule()
  {
    ConditionRuleImpl conditionRule = new ConditionRuleImpl();
    return conditionRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToRule createToRule()
  {
    ToRuleImpl toRule = new ToRuleImpl();
    return toRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InRule createInRule()
  {
    InRuleImpl inRule = new InRuleImpl();
    return inRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventFeature createEventFeature()
  {
    EventFeatureImpl eventFeature = new EventFeatureImpl();
    return eventFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceType createReferenceType()
  {
    ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
    return referenceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulOrDiv createMulOrDiv()
  {
    MulOrDivImpl mulOrDiv = new MulOrDivImpl();
    return mulOrDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatConstant createFloatConstant()
  {
    FloatConstantImpl floatConstant = new FloatConstantImpl();
    return floatConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentTime createCurrentTime()
  {
    CurrentTimeImpl currentTime = new CurrentTimeImpl();
    return currentTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DdslPackage getDdslPackage()
  {
    return (DdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DdslPackage getPackage()
  {
    return DdslPackage.eINSTANCE;
  }

} //DdslFactoryImpl
