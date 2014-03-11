/**
 */
package org.project.droolsDSL.ddsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.project.droolsDSL.ddsl.And;
import org.project.droolsDSL.ddsl.AtExpr;
import org.project.droolsDSL.ddsl.AtTimeIntConstant;
import org.project.droolsDSL.ddsl.AtTimePlusOrMin;
import org.project.droolsDSL.ddsl.BoolConstant;
import org.project.droolsDSL.ddsl.Comparison;
import org.project.droolsDSL.ddsl.ConditionRule;
import org.project.droolsDSL.ddsl.DdslFactory;
import org.project.droolsDSL.ddsl.DdslPackage;
import org.project.droolsDSL.ddsl.DroolsModel;
import org.project.droolsDSL.ddsl.Equality;
import org.project.droolsDSL.ddsl.Event;
import org.project.droolsDSL.ddsl.EventFeature;
import org.project.droolsDSL.ddsl.Expression;
import org.project.droolsDSL.ddsl.FloatConstant;
import org.project.droolsDSL.ddsl.Fluent;
import org.project.droolsDSL.ddsl.InExpr;
import org.project.droolsDSL.ddsl.InRule;
import org.project.droolsDSL.ddsl.InTimeIntConstant;
import org.project.droolsDSL.ddsl.InTimePlusOrMin;
import org.project.droolsDSL.ddsl.IntConstant;
import org.project.droolsDSL.ddsl.Minus;
import org.project.droolsDSL.ddsl.MulOrDiv;
import org.project.droolsDSL.ddsl.Not;
import org.project.droolsDSL.ddsl.Or;
import org.project.droolsDSL.ddsl.Plus;
import org.project.droolsDSL.ddsl.Reference;
import org.project.droolsDSL.ddsl.ReferenceType;
import org.project.droolsDSL.ddsl.Statement;
import org.project.droolsDSL.ddsl.ToRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DdslPackageImpl extends EPackageImpl implements DdslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass droolsModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fluentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mulOrDivEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atTimePlusOrMinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atTimeIntConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inTimePlusOrMinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inTimeIntConstantEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.project.droolsDSL.ddsl.DdslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DdslPackageImpl()
  {
    super(eNS_URI, DdslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DdslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DdslPackage init()
  {
    if (isInited) return (DdslPackage)EPackage.Registry.INSTANCE.getEPackage(DdslPackage.eNS_URI);

    // Obtain or create and register package
    DdslPackageImpl theDdslPackage = (DdslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DdslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DdslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDdslPackage.createPackageContents();

    // Initialize created meta-data
    theDdslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDdslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DdslPackage.eNS_URI, theDdslPackage);
    return theDdslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDroolsModel()
  {
    return droolsModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDroolsModel_Statements()
  {
    return (EReference)droolsModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Event()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Fluent()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_EventName()
  {
    return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Param()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFluent()
  {
    return fluentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFluent_TimePart()
  {
    return (EReference)fluentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFluent_ValuePart()
  {
    return (EReference)fluentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFluent_CondPart()
  {
    return (EReference)fluentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionRule()
  {
    return conditionRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToRule()
  {
    return toRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInRule()
  {
    return inRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventFeature()
  {
    return eventFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Condition()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Expression()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceType()
  {
    return referenceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceType_Name()
  {
    return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtExpr()
  {
    return atExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInExpr()
  {
    return inExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInExpr_InTimeExpr()
  {
    return (EReference)inExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOr()
  {
    return orEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOr_Left()
  {
    return (EReference)orEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOr_Right()
  {
    return (EReference)orEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnd()
  {
    return andEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnd_Left()
  {
    return (EReference)andEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnd_Right()
  {
    return (EReference)andEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquality()
  {
    return equalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquality_Left()
  {
    return (EReference)equalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquality_Op()
  {
    return (EAttribute)equalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquality_Right()
  {
    return (EReference)equalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparison()
  {
    return comparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparison_Left()
  {
    return (EReference)comparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComparison_Op()
  {
    return (EAttribute)comparisonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparison_Right()
  {
    return (EReference)comparisonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlus()
  {
    return plusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlus_Left()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlus_Right()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinus()
  {
    return minusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinus_Left()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinus_Right()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMulOrDiv()
  {
    return mulOrDivEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulOrDiv_Left()
  {
    return (EReference)mulOrDivEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMulOrDiv_Op()
  {
    return (EAttribute)mulOrDivEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulOrDiv_Right()
  {
    return (EReference)mulOrDivEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNot()
  {
    return notEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatConstant()
  {
    return floatConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloatConstant_Value()
  {
    return (EAttribute)floatConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntConstant()
  {
    return intConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntConstant_Value()
  {
    return (EAttribute)intConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolConstant()
  {
    return boolConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolConstant_Value()
  {
    return (EAttribute)boolConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Ref()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_FluentValueSample()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtTimePlusOrMin()
  {
    return atTimePlusOrMinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtTimePlusOrMin_Left()
  {
    return (EReference)atTimePlusOrMinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtTimePlusOrMin_Op()
  {
    return (EAttribute)atTimePlusOrMinEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtTimePlusOrMin_Right()
  {
    return (EReference)atTimePlusOrMinEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtTimeIntConstant()
  {
    return atTimeIntConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtTimeIntConstant_Value()
  {
    return (EAttribute)atTimeIntConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInTimePlusOrMin()
  {
    return inTimePlusOrMinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInTimePlusOrMin_Left()
  {
    return (EReference)inTimePlusOrMinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInTimePlusOrMin_Op()
  {
    return (EAttribute)inTimePlusOrMinEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInTimePlusOrMin_Right()
  {
    return (EReference)inTimePlusOrMinEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInTimeIntConstant()
  {
    return inTimeIntConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInTimeIntConstant_Value()
  {
    return (EAttribute)inTimeIntConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DdslFactory getDdslFactory()
  {
    return (DdslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    droolsModelEClass = createEClass(DROOLS_MODEL);
    createEReference(droolsModelEClass, DROOLS_MODEL__STATEMENTS);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__EVENT);
    createEReference(statementEClass, STATEMENT__FLUENT);

    eventEClass = createEClass(EVENT);
    createEAttribute(eventEClass, EVENT__EVENT_NAME);
    createEReference(eventEClass, EVENT__PARAM);

    fluentEClass = createEClass(FLUENT);
    createEReference(fluentEClass, FLUENT__TIME_PART);
    createEReference(fluentEClass, FLUENT__VALUE_PART);
    createEReference(fluentEClass, FLUENT__COND_PART);

    conditionRuleEClass = createEClass(CONDITION_RULE);

    toRuleEClass = createEClass(TO_RULE);

    inRuleEClass = createEClass(IN_RULE);

    eventFeatureEClass = createEClass(EVENT_FEATURE);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__CONDITION);
    createEReference(expressionEClass, EXPRESSION__EXPRESSION);

    referenceTypeEClass = createEClass(REFERENCE_TYPE);
    createEAttribute(referenceTypeEClass, REFERENCE_TYPE__NAME);

    atExprEClass = createEClass(AT_EXPR);

    inExprEClass = createEClass(IN_EXPR);
    createEReference(inExprEClass, IN_EXPR__IN_TIME_EXPR);

    orEClass = createEClass(OR);
    createEReference(orEClass, OR__LEFT);
    createEReference(orEClass, OR__RIGHT);

    andEClass = createEClass(AND);
    createEReference(andEClass, AND__LEFT);
    createEReference(andEClass, AND__RIGHT);

    equalityEClass = createEClass(EQUALITY);
    createEReference(equalityEClass, EQUALITY__LEFT);
    createEAttribute(equalityEClass, EQUALITY__OP);
    createEReference(equalityEClass, EQUALITY__RIGHT);

    comparisonEClass = createEClass(COMPARISON);
    createEReference(comparisonEClass, COMPARISON__LEFT);
    createEAttribute(comparisonEClass, COMPARISON__OP);
    createEReference(comparisonEClass, COMPARISON__RIGHT);

    plusEClass = createEClass(PLUS);
    createEReference(plusEClass, PLUS__LEFT);
    createEReference(plusEClass, PLUS__RIGHT);

    minusEClass = createEClass(MINUS);
    createEReference(minusEClass, MINUS__LEFT);
    createEReference(minusEClass, MINUS__RIGHT);

    mulOrDivEClass = createEClass(MUL_OR_DIV);
    createEReference(mulOrDivEClass, MUL_OR_DIV__LEFT);
    createEAttribute(mulOrDivEClass, MUL_OR_DIV__OP);
    createEReference(mulOrDivEClass, MUL_OR_DIV__RIGHT);

    notEClass = createEClass(NOT);

    floatConstantEClass = createEClass(FLOAT_CONSTANT);
    createEAttribute(floatConstantEClass, FLOAT_CONSTANT__VALUE);

    intConstantEClass = createEClass(INT_CONSTANT);
    createEAttribute(intConstantEClass, INT_CONSTANT__VALUE);

    boolConstantEClass = createEClass(BOOL_CONSTANT);
    createEAttribute(boolConstantEClass, BOOL_CONSTANT__VALUE);

    referenceEClass = createEClass(REFERENCE);
    createEReference(referenceEClass, REFERENCE__REF);
    createEReference(referenceEClass, REFERENCE__FLUENT_VALUE_SAMPLE);

    atTimePlusOrMinEClass = createEClass(AT_TIME_PLUS_OR_MIN);
    createEReference(atTimePlusOrMinEClass, AT_TIME_PLUS_OR_MIN__LEFT);
    createEAttribute(atTimePlusOrMinEClass, AT_TIME_PLUS_OR_MIN__OP);
    createEReference(atTimePlusOrMinEClass, AT_TIME_PLUS_OR_MIN__RIGHT);

    atTimeIntConstantEClass = createEClass(AT_TIME_INT_CONSTANT);
    createEAttribute(atTimeIntConstantEClass, AT_TIME_INT_CONSTANT__VALUE);

    inTimePlusOrMinEClass = createEClass(IN_TIME_PLUS_OR_MIN);
    createEReference(inTimePlusOrMinEClass, IN_TIME_PLUS_OR_MIN__LEFT);
    createEAttribute(inTimePlusOrMinEClass, IN_TIME_PLUS_OR_MIN__OP);
    createEReference(inTimePlusOrMinEClass, IN_TIME_PLUS_OR_MIN__RIGHT);

    inTimeIntConstantEClass = createEClass(IN_TIME_INT_CONSTANT);
    createEAttribute(inTimeIntConstantEClass, IN_TIME_INT_CONSTANT__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fluentEClass.getESuperTypes().add(this.getReferenceType());
    eventFeatureEClass.getESuperTypes().add(this.getReferenceType());
    expressionEClass.getESuperTypes().add(this.getConditionRule());
    expressionEClass.getESuperTypes().add(this.getToRule());
    inExprEClass.getESuperTypes().add(this.getInRule());
    orEClass.getESuperTypes().add(this.getExpression());
    andEClass.getESuperTypes().add(this.getExpression());
    equalityEClass.getESuperTypes().add(this.getExpression());
    comparisonEClass.getESuperTypes().add(this.getExpression());
    plusEClass.getESuperTypes().add(this.getExpression());
    minusEClass.getESuperTypes().add(this.getExpression());
    mulOrDivEClass.getESuperTypes().add(this.getExpression());
    notEClass.getESuperTypes().add(this.getExpression());
    floatConstantEClass.getESuperTypes().add(this.getExpression());
    intConstantEClass.getESuperTypes().add(this.getExpression());
    boolConstantEClass.getESuperTypes().add(this.getExpression());
    referenceEClass.getESuperTypes().add(this.getExpression());
    atTimePlusOrMinEClass.getESuperTypes().add(this.getAtExpr());
    atTimeIntConstantEClass.getESuperTypes().add(this.getAtExpr());
    inTimePlusOrMinEClass.getESuperTypes().add(this.getInExpr());
    inTimeIntConstantEClass.getESuperTypes().add(this.getInExpr());

    // Initialize classes and features; add operations and parameters
    initEClass(droolsModelEClass, DroolsModel.class, "DroolsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDroolsModel_Statements(), this.getStatement(), null, "statements", null, 0, -1, DroolsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatement_Event(), this.getEvent(), null, "event", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Fluent(), this.getFluent(), null, "fluent", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvent_EventName(), ecorePackage.getEString(), "eventName", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Param(), this.getEventFeature(), null, "param", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fluentEClass, Fluent.class, "Fluent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFluent_TimePart(), this.getInRule(), null, "timePart", null, 0, 1, Fluent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFluent_ValuePart(), this.getToRule(), null, "valuePart", null, 0, 1, Fluent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFluent_CondPart(), this.getConditionRule(), null, "condPart", null, 0, 1, Fluent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionRuleEClass, ConditionRule.class, "ConditionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(toRuleEClass, ToRule.class, "ToRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inRuleEClass, InRule.class, "InRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventFeatureEClass, EventFeature.class, "EventFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Condition(), this.getExpression(), null, "condition", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceTypeEClass, ReferenceType.class, "ReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReferenceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atExprEClass, AtExpr.class, "AtExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inExprEClass, InExpr.class, "InExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInExpr_InTimeExpr(), this.getInExpr(), null, "inTimeExpr", null, 0, 1, InExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOr_Left(), this.getExpression(), null, "left", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOr_Right(), this.getExpression(), null, "right", null, 0, 1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnd_Left(), this.getExpression(), null, "left", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnd_Right(), this.getExpression(), null, "right", null, 0, 1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalityEClass, Equality.class, "Equality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquality_Left(), this.getExpression(), null, "left", null, 0, 1, Equality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquality_Op(), ecorePackage.getEString(), "op", null, 0, 1, Equality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEquality_Right(), this.getExpression(), null, "right", null, 0, 1, Equality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComparison_Left(), this.getExpression(), null, "left", null, 0, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComparison_Op(), ecorePackage.getEString(), "op", null, 0, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComparison_Right(), this.getExpression(), null, "right", null, 0, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlus_Left(), this.getExpression(), null, "left", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlus_Right(), this.getExpression(), null, "right", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMinus_Left(), this.getExpression(), null, "left", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMinus_Right(), this.getExpression(), null, "right", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mulOrDivEClass, MulOrDiv.class, "MulOrDiv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMulOrDiv_Left(), this.getExpression(), null, "left", null, 0, 1, MulOrDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMulOrDiv_Op(), ecorePackage.getEString(), "op", null, 0, 1, MulOrDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMulOrDiv_Right(), this.getExpression(), null, "right", null, 0, 1, MulOrDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatConstantEClass, FloatConstant.class, "FloatConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFloatConstant_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, FloatConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intConstantEClass, IntConstant.class, "IntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolConstantEClass, BoolConstant.class, "BoolConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BoolConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReference_Ref(), this.getReferenceType(), null, "ref", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReference_FluentValueSample(), this.getAtExpr(), null, "fluentValueSample", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atTimePlusOrMinEClass, AtTimePlusOrMin.class, "AtTimePlusOrMin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtTimePlusOrMin_Left(), this.getAtExpr(), null, "left", null, 0, 1, AtTimePlusOrMin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtTimePlusOrMin_Op(), ecorePackage.getEString(), "op", null, 0, 1, AtTimePlusOrMin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtTimePlusOrMin_Right(), this.getAtExpr(), null, "right", null, 0, 1, AtTimePlusOrMin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atTimeIntConstantEClass, AtTimeIntConstant.class, "AtTimeIntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtTimeIntConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, AtTimeIntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inTimePlusOrMinEClass, InTimePlusOrMin.class, "InTimePlusOrMin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInTimePlusOrMin_Left(), this.getInExpr(), null, "left", null, 0, 1, InTimePlusOrMin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInTimePlusOrMin_Op(), ecorePackage.getEString(), "op", null, 0, 1, InTimePlusOrMin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInTimePlusOrMin_Right(), this.getInExpr(), null, "right", null, 0, 1, InTimePlusOrMin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inTimeIntConstantEClass, InTimeIntConstant.class, "InTimeIntConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInTimeIntConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, InTimeIntConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DdslPackageImpl
