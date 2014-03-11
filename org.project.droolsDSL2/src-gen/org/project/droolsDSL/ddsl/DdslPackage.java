/**
 */
package org.project.droolsDSL.ddsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.project.droolsDSL.ddsl.DdslFactory
 * @model kind="package"
 * @generated
 */
public interface DdslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ddsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.project.org/droolsDSL/Ddsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ddsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DdslPackage eINSTANCE = org.project.droolsDSL.ddsl.impl.DdslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.DroolsModelImpl <em>Drools Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.DroolsModelImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getDroolsModel()
   * @generated
   */
  int DROOLS_MODEL = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROOLS_MODEL__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Drools Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROOLS_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.StatementImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EVENT = 0;

  /**
   * The feature id for the '<em><b>Fluent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FLUENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.EventImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 2;

  /**
   * The feature id for the '<em><b>Event Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__EVENT_NAME = 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__PARAM = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.ReferenceTypeImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getReferenceType()
   * @generated
   */
  int REFERENCE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Reference Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.FluentImpl <em>Fluent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.FluentImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getFluent()
   * @generated
   */
  int FLUENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__NAME = REFERENCE_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Time Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__TIME_PART = REFERENCE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__VALUE_PART = REFERENCE_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cond Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__COND_PART = REFERENCE_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Fluent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.ConditionRuleImpl <em>Condition Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.ConditionRuleImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getConditionRule()
   * @generated
   */
  int CONDITION_RULE = 4;

  /**
   * The number of structural features of the '<em>Condition Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.ToRuleImpl <em>To Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.ToRuleImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getToRule()
   * @generated
   */
  int TO_RULE = 5;

  /**
   * The number of structural features of the '<em>To Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.InRuleImpl <em>In Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.InRuleImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getInRule()
   * @generated
   */
  int IN_RULE = 6;

  /**
   * The number of structural features of the '<em>In Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.EventFeatureImpl <em>Event Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.EventFeatureImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getEventFeature()
   * @generated
   */
  int EVENT_FEATURE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE__NAME = REFERENCE_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Event Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.ExpressionImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__CONDITION = CONDITION_RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSION = CONDITION_RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = CONDITION_RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.AtExprImpl <em>At Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.AtExprImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getAtExpr()
   * @generated
   */
  int AT_EXPR = 10;

  /**
   * The number of structural features of the '<em>At Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.InExprImpl <em>In Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.InExprImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getInExpr()
   * @generated
   */
  int IN_EXPR = 11;

  /**
   * The feature id for the '<em><b>In Time Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_EXPR__IN_TIME_EXPR = IN_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_EXPR_FEATURE_COUNT = IN_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.OrImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getOr()
   * @generated
   */
  int OR = 12;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.AndImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getAnd()
   * @generated
   */
  int AND = 13;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.EqualityImpl <em>Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.EqualityImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getEquality()
   * @generated
   */
  int EQUALITY = 14;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.ComparisonImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 15;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.PlusImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 16;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.MinusImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 17;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.MulOrDivImpl <em>Mul Or Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.MulOrDivImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getMulOrDiv()
   * @generated
   */
  int MUL_OR_DIV = 18;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mul Or Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.NotImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getNot()
   * @generated
   */
  int NOT = 19;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.FloatConstantImpl <em>Float Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.FloatConstantImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getFloatConstant()
   * @generated
   */
  int FLOAT_CONSTANT = 20;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.IntConstantImpl <em>Int Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.IntConstantImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getIntConstant()
   * @generated
   */
  int INT_CONSTANT = 21;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.BoolConstantImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getBoolConstant()
   * @generated
   */
  int BOOL_CONSTANT = 22;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.ReferenceImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 23;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__CONDITION = EXPRESSION__CONDITION;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fluent Value Sample</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__FLUENT_VALUE_SAMPLE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.AtTimePlusOrMinImpl <em>At Time Plus Or Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.AtTimePlusOrMinImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getAtTimePlusOrMin()
   * @generated
   */
  int AT_TIME_PLUS_OR_MIN = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_PLUS_OR_MIN__LEFT = AT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_PLUS_OR_MIN__OP = AT_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_PLUS_OR_MIN__RIGHT = AT_EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>At Time Plus Or Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_PLUS_OR_MIN_FEATURE_COUNT = AT_EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.AtTimeIntConstantImpl <em>At Time Int Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.AtTimeIntConstantImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getAtTimeIntConstant()
   * @generated
   */
  int AT_TIME_INT_CONSTANT = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_INT_CONSTANT__VALUE = AT_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>At Time Int Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_INT_CONSTANT_FEATURE_COUNT = AT_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.InTimePlusOrMinImpl <em>In Time Plus Or Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.InTimePlusOrMinImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getInTimePlusOrMin()
   * @generated
   */
  int IN_TIME_PLUS_OR_MIN = 26;

  /**
   * The feature id for the '<em><b>In Time Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_TIME_PLUS_OR_MIN__IN_TIME_EXPR = IN_EXPR__IN_TIME_EXPR;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_TIME_PLUS_OR_MIN__LEFT = IN_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_TIME_PLUS_OR_MIN__OP = IN_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_TIME_PLUS_OR_MIN__RIGHT = IN_EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>In Time Plus Or Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_TIME_PLUS_OR_MIN_FEATURE_COUNT = IN_EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.project.droolsDSL.ddsl.impl.InTimeIntConstantImpl <em>In Time Int Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.project.droolsDSL.ddsl.impl.InTimeIntConstantImpl
   * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getInTimeIntConstant()
   * @generated
   */
  int IN_TIME_INT_CONSTANT = 27;

  /**
   * The feature id for the '<em><b>In Time Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_TIME_INT_CONSTANT__IN_TIME_EXPR = IN_EXPR__IN_TIME_EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_TIME_INT_CONSTANT__VALUE = IN_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>In Time Int Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_TIME_INT_CONSTANT_FEATURE_COUNT = IN_EXPR_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.DroolsModel <em>Drools Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drools Model</em>'.
   * @see org.project.droolsDSL.ddsl.DroolsModel
   * @generated
   */
  EClass getDroolsModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.project.droolsDSL.ddsl.DroolsModel#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.project.droolsDSL.ddsl.DroolsModel#getStatements()
   * @see #getDroolsModel()
   * @generated
   */
  EReference getDroolsModel_Statements();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.project.droolsDSL.ddsl.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Statement#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.project.droolsDSL.ddsl.Statement#getEvent()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Event();

  /**
   * Returns the meta object for the containment reference list '{@link org.project.droolsDSL.ddsl.Statement#getFluent <em>Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fluent</em>'.
   * @see org.project.droolsDSL.ddsl.Statement#getFluent()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Fluent();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.project.droolsDSL.ddsl.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.Event#getEventName <em>Event Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event Name</em>'.
   * @see org.project.droolsDSL.ddsl.Event#getEventName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_EventName();

  /**
   * Returns the meta object for the containment reference list '{@link org.project.droolsDSL.ddsl.Event#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param</em>'.
   * @see org.project.droolsDSL.ddsl.Event#getParam()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Param();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.Fluent <em>Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fluent</em>'.
   * @see org.project.droolsDSL.ddsl.Fluent
   * @generated
   */
  EClass getFluent();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Fluent#getTimePart <em>Time Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time Part</em>'.
   * @see org.project.droolsDSL.ddsl.Fluent#getTimePart()
   * @see #getFluent()
   * @generated
   */
  EReference getFluent_TimePart();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Fluent#getValuePart <em>Value Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Part</em>'.
   * @see org.project.droolsDSL.ddsl.Fluent#getValuePart()
   * @see #getFluent()
   * @generated
   */
  EReference getFluent_ValuePart();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Fluent#getCondPart <em>Cond Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond Part</em>'.
   * @see org.project.droolsDSL.ddsl.Fluent#getCondPart()
   * @see #getFluent()
   * @generated
   */
  EReference getFluent_CondPart();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.ConditionRule <em>Condition Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Rule</em>'.
   * @see org.project.droolsDSL.ddsl.ConditionRule
   * @generated
   */
  EClass getConditionRule();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.ToRule <em>To Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>To Rule</em>'.
   * @see org.project.droolsDSL.ddsl.ToRule
   * @generated
   */
  EClass getToRule();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.InRule <em>In Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Rule</em>'.
   * @see org.project.droolsDSL.ddsl.InRule
   * @generated
   */
  EClass getInRule();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.EventFeature <em>Event Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Feature</em>'.
   * @see org.project.droolsDSL.ddsl.EventFeature
   * @generated
   */
  EClass getEventFeature();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.project.droolsDSL.ddsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Expression#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.project.droolsDSL.ddsl.Expression#getCondition()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.project.droolsDSL.ddsl.Expression#getExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.ReferenceType <em>Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Type</em>'.
   * @see org.project.droolsDSL.ddsl.ReferenceType
   * @generated
   */
  EClass getReferenceType();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.ReferenceType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.project.droolsDSL.ddsl.ReferenceType#getName()
   * @see #getReferenceType()
   * @generated
   */
  EAttribute getReferenceType_Name();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.AtExpr <em>At Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Expr</em>'.
   * @see org.project.droolsDSL.ddsl.AtExpr
   * @generated
   */
  EClass getAtExpr();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.InExpr <em>In Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Expr</em>'.
   * @see org.project.droolsDSL.ddsl.InExpr
   * @generated
   */
  EClass getInExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.InExpr#getInTimeExpr <em>In Time Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In Time Expr</em>'.
   * @see org.project.droolsDSL.ddsl.InExpr#getInTimeExpr()
   * @see #getInExpr()
   * @generated
   */
  EReference getInExpr_InTimeExpr();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see org.project.droolsDSL.ddsl.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.project.droolsDSL.ddsl.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.project.droolsDSL.ddsl.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see org.project.droolsDSL.ddsl.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.project.droolsDSL.ddsl.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.project.droolsDSL.ddsl.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality</em>'.
   * @see org.project.droolsDSL.ddsl.Equality
   * @generated
   */
  EClass getEquality();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Equality#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.project.droolsDSL.ddsl.Equality#getLeft()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Left();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.Equality#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.project.droolsDSL.ddsl.Equality#getOp()
   * @see #getEquality()
   * @generated
   */
  EAttribute getEquality_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Equality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.project.droolsDSL.ddsl.Equality#getRight()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Right();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see org.project.droolsDSL.ddsl.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Comparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.project.droolsDSL.ddsl.Comparison#getLeft()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Left();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.Comparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.project.droolsDSL.ddsl.Comparison#getOp()
   * @see #getComparison()
   * @generated
   */
  EAttribute getComparison_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Comparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.project.droolsDSL.ddsl.Comparison#getRight()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Right();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see org.project.droolsDSL.ddsl.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.project.droolsDSL.ddsl.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.project.droolsDSL.ddsl.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.project.droolsDSL.ddsl.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.project.droolsDSL.ddsl.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.project.droolsDSL.ddsl.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.MulOrDiv <em>Mul Or Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mul Or Div</em>'.
   * @see org.project.droolsDSL.ddsl.MulOrDiv
   * @generated
   */
  EClass getMulOrDiv();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.MulOrDiv#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.project.droolsDSL.ddsl.MulOrDiv#getLeft()
   * @see #getMulOrDiv()
   * @generated
   */
  EReference getMulOrDiv_Left();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.MulOrDiv#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.project.droolsDSL.ddsl.MulOrDiv#getOp()
   * @see #getMulOrDiv()
   * @generated
   */
  EAttribute getMulOrDiv_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.MulOrDiv#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.project.droolsDSL.ddsl.MulOrDiv#getRight()
   * @see #getMulOrDiv()
   * @generated
   */
  EReference getMulOrDiv_Right();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see org.project.droolsDSL.ddsl.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.FloatConstant <em>Float Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Constant</em>'.
   * @see org.project.droolsDSL.ddsl.FloatConstant
   * @generated
   */
  EClass getFloatConstant();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.FloatConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.project.droolsDSL.ddsl.FloatConstant#getValue()
   * @see #getFloatConstant()
   * @generated
   */
  EAttribute getFloatConstant_Value();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Constant</em>'.
   * @see org.project.droolsDSL.ddsl.IntConstant
   * @generated
   */
  EClass getIntConstant();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.IntConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.project.droolsDSL.ddsl.IntConstant#getValue()
   * @see #getIntConstant()
   * @generated
   */
  EAttribute getIntConstant_Value();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Constant</em>'.
   * @see org.project.droolsDSL.ddsl.BoolConstant
   * @generated
   */
  EClass getBoolConstant();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.BoolConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.project.droolsDSL.ddsl.BoolConstant#getValue()
   * @see #getBoolConstant()
   * @generated
   */
  EAttribute getBoolConstant_Value();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.project.droolsDSL.ddsl.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link org.project.droolsDSL.ddsl.Reference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.project.droolsDSL.ddsl.Reference#getRef()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.Reference#getFluentValueSample <em>Fluent Value Sample</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fluent Value Sample</em>'.
   * @see org.project.droolsDSL.ddsl.Reference#getFluentValueSample()
   * @see #getReference()
   * @generated
   */
  EReference getReference_FluentValueSample();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.AtTimePlusOrMin <em>At Time Plus Or Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Time Plus Or Min</em>'.
   * @see org.project.droolsDSL.ddsl.AtTimePlusOrMin
   * @generated
   */
  EClass getAtTimePlusOrMin();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.AtTimePlusOrMin#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.project.droolsDSL.ddsl.AtTimePlusOrMin#getLeft()
   * @see #getAtTimePlusOrMin()
   * @generated
   */
  EReference getAtTimePlusOrMin_Left();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.AtTimePlusOrMin#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.project.droolsDSL.ddsl.AtTimePlusOrMin#getOp()
   * @see #getAtTimePlusOrMin()
   * @generated
   */
  EAttribute getAtTimePlusOrMin_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.AtTimePlusOrMin#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.project.droolsDSL.ddsl.AtTimePlusOrMin#getRight()
   * @see #getAtTimePlusOrMin()
   * @generated
   */
  EReference getAtTimePlusOrMin_Right();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.AtTimeIntConstant <em>At Time Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Time Int Constant</em>'.
   * @see org.project.droolsDSL.ddsl.AtTimeIntConstant
   * @generated
   */
  EClass getAtTimeIntConstant();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.AtTimeIntConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.project.droolsDSL.ddsl.AtTimeIntConstant#getValue()
   * @see #getAtTimeIntConstant()
   * @generated
   */
  EAttribute getAtTimeIntConstant_Value();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.InTimePlusOrMin <em>In Time Plus Or Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Time Plus Or Min</em>'.
   * @see org.project.droolsDSL.ddsl.InTimePlusOrMin
   * @generated
   */
  EClass getInTimePlusOrMin();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.InTimePlusOrMin#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.project.droolsDSL.ddsl.InTimePlusOrMin#getLeft()
   * @see #getInTimePlusOrMin()
   * @generated
   */
  EReference getInTimePlusOrMin_Left();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.InTimePlusOrMin#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.project.droolsDSL.ddsl.InTimePlusOrMin#getOp()
   * @see #getInTimePlusOrMin()
   * @generated
   */
  EAttribute getInTimePlusOrMin_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.project.droolsDSL.ddsl.InTimePlusOrMin#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.project.droolsDSL.ddsl.InTimePlusOrMin#getRight()
   * @see #getInTimePlusOrMin()
   * @generated
   */
  EReference getInTimePlusOrMin_Right();

  /**
   * Returns the meta object for class '{@link org.project.droolsDSL.ddsl.InTimeIntConstant <em>In Time Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Time Int Constant</em>'.
   * @see org.project.droolsDSL.ddsl.InTimeIntConstant
   * @generated
   */
  EClass getInTimeIntConstant();

  /**
   * Returns the meta object for the attribute '{@link org.project.droolsDSL.ddsl.InTimeIntConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.project.droolsDSL.ddsl.InTimeIntConstant#getValue()
   * @see #getInTimeIntConstant()
   * @generated
   */
  EAttribute getInTimeIntConstant_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DdslFactory getDdslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.DroolsModelImpl <em>Drools Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.DroolsModelImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getDroolsModel()
     * @generated
     */
    EClass DROOLS_MODEL = eINSTANCE.getDroolsModel();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DROOLS_MODEL__STATEMENTS = eINSTANCE.getDroolsModel_Statements();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.StatementImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EVENT = eINSTANCE.getStatement_Event();

    /**
     * The meta object literal for the '<em><b>Fluent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__FLUENT = eINSTANCE.getStatement_Fluent();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.EventImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__EVENT_NAME = eINSTANCE.getEvent_EventName();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__PARAM = eINSTANCE.getEvent_Param();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.FluentImpl <em>Fluent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.FluentImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getFluent()
     * @generated
     */
    EClass FLUENT = eINSTANCE.getFluent();

    /**
     * The meta object literal for the '<em><b>Time Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLUENT__TIME_PART = eINSTANCE.getFluent_TimePart();

    /**
     * The meta object literal for the '<em><b>Value Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLUENT__VALUE_PART = eINSTANCE.getFluent_ValuePart();

    /**
     * The meta object literal for the '<em><b>Cond Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLUENT__COND_PART = eINSTANCE.getFluent_CondPart();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.ConditionRuleImpl <em>Condition Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.ConditionRuleImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getConditionRule()
     * @generated
     */
    EClass CONDITION_RULE = eINSTANCE.getConditionRule();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.ToRuleImpl <em>To Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.ToRuleImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getToRule()
     * @generated
     */
    EClass TO_RULE = eINSTANCE.getToRule();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.InRuleImpl <em>In Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.InRuleImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getInRule()
     * @generated
     */
    EClass IN_RULE = eINSTANCE.getInRule();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.EventFeatureImpl <em>Event Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.EventFeatureImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getEventFeature()
     * @generated
     */
    EClass EVENT_FEATURE = eINSTANCE.getEventFeature();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.ExpressionImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__CONDITION = eINSTANCE.getExpression_Condition();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.ReferenceTypeImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getReferenceType()
     * @generated
     */
    EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_TYPE__NAME = eINSTANCE.getReferenceType_Name();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.AtExprImpl <em>At Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.AtExprImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getAtExpr()
     * @generated
     */
    EClass AT_EXPR = eINSTANCE.getAtExpr();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.InExprImpl <em>In Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.InExprImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getInExpr()
     * @generated
     */
    EClass IN_EXPR = eINSTANCE.getInExpr();

    /**
     * The meta object literal for the '<em><b>In Time Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_EXPR__IN_TIME_EXPR = eINSTANCE.getInExpr_InTimeExpr();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.OrImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.AndImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.EqualityImpl <em>Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.EqualityImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getEquality()
     * @generated
     */
    EClass EQUALITY = eINSTANCE.getEquality();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__LEFT = eINSTANCE.getEquality_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALITY__OP = eINSTANCE.getEquality_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__RIGHT = eINSTANCE.getEquality_Right();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.ComparisonImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.PlusImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.MinusImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.MulOrDivImpl <em>Mul Or Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.MulOrDivImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getMulOrDiv()
     * @generated
     */
    EClass MUL_OR_DIV = eINSTANCE.getMulOrDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_OR_DIV__LEFT = eINSTANCE.getMulOrDiv_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUL_OR_DIV__OP = eINSTANCE.getMulOrDiv_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_OR_DIV__RIGHT = eINSTANCE.getMulOrDiv_Right();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.NotImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.FloatConstantImpl <em>Float Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.FloatConstantImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getFloatConstant()
     * @generated
     */
    EClass FLOAT_CONSTANT = eINSTANCE.getFloatConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_CONSTANT__VALUE = eINSTANCE.getFloatConstant_Value();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.IntConstantImpl <em>Int Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.IntConstantImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getIntConstant()
     * @generated
     */
    EClass INT_CONSTANT = eINSTANCE.getIntConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.BoolConstantImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getBoolConstant()
     * @generated
     */
    EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.ReferenceImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__REF = eINSTANCE.getReference_Ref();

    /**
     * The meta object literal for the '<em><b>Fluent Value Sample</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__FLUENT_VALUE_SAMPLE = eINSTANCE.getReference_FluentValueSample();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.AtTimePlusOrMinImpl <em>At Time Plus Or Min</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.AtTimePlusOrMinImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getAtTimePlusOrMin()
     * @generated
     */
    EClass AT_TIME_PLUS_OR_MIN = eINSTANCE.getAtTimePlusOrMin();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AT_TIME_PLUS_OR_MIN__LEFT = eINSTANCE.getAtTimePlusOrMin_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_TIME_PLUS_OR_MIN__OP = eINSTANCE.getAtTimePlusOrMin_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AT_TIME_PLUS_OR_MIN__RIGHT = eINSTANCE.getAtTimePlusOrMin_Right();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.AtTimeIntConstantImpl <em>At Time Int Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.AtTimeIntConstantImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getAtTimeIntConstant()
     * @generated
     */
    EClass AT_TIME_INT_CONSTANT = eINSTANCE.getAtTimeIntConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_TIME_INT_CONSTANT__VALUE = eINSTANCE.getAtTimeIntConstant_Value();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.InTimePlusOrMinImpl <em>In Time Plus Or Min</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.InTimePlusOrMinImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getInTimePlusOrMin()
     * @generated
     */
    EClass IN_TIME_PLUS_OR_MIN = eINSTANCE.getInTimePlusOrMin();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_TIME_PLUS_OR_MIN__LEFT = eINSTANCE.getInTimePlusOrMin_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_TIME_PLUS_OR_MIN__OP = eINSTANCE.getInTimePlusOrMin_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_TIME_PLUS_OR_MIN__RIGHT = eINSTANCE.getInTimePlusOrMin_Right();

    /**
     * The meta object literal for the '{@link org.project.droolsDSL.ddsl.impl.InTimeIntConstantImpl <em>In Time Int Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.project.droolsDSL.ddsl.impl.InTimeIntConstantImpl
     * @see org.project.droolsDSL.ddsl.impl.DdslPackageImpl#getInTimeIntConstant()
     * @generated
     */
    EClass IN_TIME_INT_CONSTANT = eINSTANCE.getInTimeIntConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_TIME_INT_CONSTANT__VALUE = eINSTANCE.getInTimeIntConstant_Value();

  }

} //DdslPackage
