/**
 */
package org.project.droolsDSL.ddsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.project.droolsDSL.ddsl.DdslPackage
 * @generated
 */
public interface DdslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DdslFactory eINSTANCE = org.project.droolsDSL.ddsl.impl.DdslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Drools Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drools Model</em>'.
   * @generated
   */
  DroolsModel createDroolsModel();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Fluent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fluent</em>'.
   * @generated
   */
  Fluent createFluent();

  /**
   * Returns a new object of class '<em>Condition Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Rule</em>'.
   * @generated
   */
  ConditionRule createConditionRule();

  /**
   * Returns a new object of class '<em>To Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>To Rule</em>'.
   * @generated
   */
  ToRule createToRule();

  /**
   * Returns a new object of class '<em>In Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Rule</em>'.
   * @generated
   */
  InRule createInRule();

  /**
   * Returns a new object of class '<em>Event Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Feature</em>'.
   * @generated
   */
  EventFeature createEventFeature();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Reference Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Type</em>'.
   * @generated
   */
  ReferenceType createReferenceType();

  /**
   * Returns a new object of class '<em>At Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Expr</em>'.
   * @generated
   */
  AtExpr createAtExpr();

  /**
   * Returns a new object of class '<em>In Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Expr</em>'.
   * @generated
   */
  InExpr createInExpr();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality</em>'.
   * @generated
   */
  Equality createEquality();

  /**
   * Returns a new object of class '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison</em>'.
   * @generated
   */
  Comparison createComparison();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Mul Or Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul Or Div</em>'.
   * @generated
   */
  MulOrDiv createMulOrDiv();

  /**
   * Returns a new object of class '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not</em>'.
   * @generated
   */
  Not createNot();

  /**
   * Returns a new object of class '<em>Float Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Constant</em>'.
   * @generated
   */
  FloatConstant createFloatConstant();

  /**
   * Returns a new object of class '<em>Int Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Constant</em>'.
   * @generated
   */
  IntConstant createIntConstant();

  /**
   * Returns a new object of class '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Constant</em>'.
   * @generated
   */
  BoolConstant createBoolConstant();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>At Time Plus Or Min</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Time Plus Or Min</em>'.
   * @generated
   */
  AtTimePlusOrMin createAtTimePlusOrMin();

  /**
   * Returns a new object of class '<em>At Time Int Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Time Int Constant</em>'.
   * @generated
   */
  AtTimeIntConstant createAtTimeIntConstant();

  /**
   * Returns a new object of class '<em>At Time Current Time</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>At Time Current Time</em>'.
   * @generated
   */
  AtTimeCurrentTime createAtTimeCurrentTime();

  /**
   * Returns a new object of class '<em>In Time Plus Or Min</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Time Plus Or Min</em>'.
   * @generated
   */
  InTimePlusOrMin createInTimePlusOrMin();

  /**
   * Returns a new object of class '<em>In Time Int Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Time Int Constant</em>'.
   * @generated
   */
  InTimeIntConstant createInTimeIntConstant();

  /**
   * Returns a new object of class '<em>In Time Current Time</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Time Current Time</em>'.
   * @generated
   */
  InTimeCurrentTime createInTimeCurrentTime();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DdslPackage getDdslPackage();

} //DdslFactory
