/**
 */
package org.project.droolsDSL.ddsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.project.droolsDSL.ddsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.project.droolsDSL.ddsl.DdslPackage
 * @generated
 */
public class DdslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DdslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DdslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DdslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DdslSwitch<Adapter> modelSwitch =
    new DdslSwitch<Adapter>()
    {
      @Override
      public Adapter caseDroolsModel(DroolsModel object)
      {
        return createDroolsModelAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseFluent(Fluent object)
      {
        return createFluentAdapter();
      }
      @Override
      public Adapter caseConditionRule(ConditionRule object)
      {
        return createConditionRuleAdapter();
      }
      @Override
      public Adapter caseToRule(ToRule object)
      {
        return createToRuleAdapter();
      }
      @Override
      public Adapter caseInRule(InRule object)
      {
        return createInRuleAdapter();
      }
      @Override
      public Adapter caseEventFeature(EventFeature object)
      {
        return createEventFeatureAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseReferenceType(ReferenceType object)
      {
        return createReferenceTypeAdapter();
      }
      @Override
      public Adapter caseAtExpr(AtExpr object)
      {
        return createAtExprAdapter();
      }
      @Override
      public Adapter caseInExpr(InExpr object)
      {
        return createInExprAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseEquality(Equality object)
      {
        return createEqualityAdapter();
      }
      @Override
      public Adapter caseComparison(Comparison object)
      {
        return createComparisonAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMulOrDiv(MulOrDiv object)
      {
        return createMulOrDivAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
      }
      @Override
      public Adapter caseFloatConstant(FloatConstant object)
      {
        return createFloatConstantAdapter();
      }
      @Override
      public Adapter caseIntConstant(IntConstant object)
      {
        return createIntConstantAdapter();
      }
      @Override
      public Adapter caseBoolConstant(BoolConstant object)
      {
        return createBoolConstantAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseAtTimePlusOrMin(AtTimePlusOrMin object)
      {
        return createAtTimePlusOrMinAdapter();
      }
      @Override
      public Adapter caseAtTimeIntConstant(AtTimeIntConstant object)
      {
        return createAtTimeIntConstantAdapter();
      }
      @Override
      public Adapter caseAtTimeCurrentTime(AtTimeCurrentTime object)
      {
        return createAtTimeCurrentTimeAdapter();
      }
      @Override
      public Adapter caseInTimePlusOrMin(InTimePlusOrMin object)
      {
        return createInTimePlusOrMinAdapter();
      }
      @Override
      public Adapter caseInTimeIntConstant(InTimeIntConstant object)
      {
        return createInTimeIntConstantAdapter();
      }
      @Override
      public Adapter caseInTimeCurrentTime(InTimeCurrentTime object)
      {
        return createInTimeCurrentTimeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.DroolsModel <em>Drools Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.DroolsModel
   * @generated
   */
  public Adapter createDroolsModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.Fluent <em>Fluent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.Fluent
   * @generated
   */
  public Adapter createFluentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.ConditionRule <em>Condition Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.ConditionRule
   * @generated
   */
  public Adapter createConditionRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.ToRule <em>To Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.ToRule
   * @generated
   */
  public Adapter createToRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.InRule <em>In Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.InRule
   * @generated
   */
  public Adapter createInRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.EventFeature <em>Event Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.EventFeature
   * @generated
   */
  public Adapter createEventFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.ReferenceType <em>Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.ReferenceType
   * @generated
   */
  public Adapter createReferenceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.AtExpr <em>At Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.AtExpr
   * @generated
   */
  public Adapter createAtExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.InExpr <em>In Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.InExpr
   * @generated
   */
  public Adapter createInExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.Equality
   * @generated
   */
  public Adapter createEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.Comparison
   * @generated
   */
  public Adapter createComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.MulOrDiv <em>Mul Or Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.MulOrDiv
   * @generated
   */
  public Adapter createMulOrDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.Not
   * @generated
   */
  public Adapter createNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.FloatConstant <em>Float Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.FloatConstant
   * @generated
   */
  public Adapter createFloatConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.IntConstant
   * @generated
   */
  public Adapter createIntConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.BoolConstant
   * @generated
   */
  public Adapter createBoolConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.AtTimePlusOrMin <em>At Time Plus Or Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.AtTimePlusOrMin
   * @generated
   */
  public Adapter createAtTimePlusOrMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.AtTimeIntConstant <em>At Time Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.AtTimeIntConstant
   * @generated
   */
  public Adapter createAtTimeIntConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.AtTimeCurrentTime <em>At Time Current Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.AtTimeCurrentTime
   * @generated
   */
  public Adapter createAtTimeCurrentTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.InTimePlusOrMin <em>In Time Plus Or Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.InTimePlusOrMin
   * @generated
   */
  public Adapter createInTimePlusOrMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.InTimeIntConstant <em>In Time Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.InTimeIntConstant
   * @generated
   */
  public Adapter createInTimeIntConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.project.droolsDSL.ddsl.InTimeCurrentTime <em>In Time Current Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.project.droolsDSL.ddsl.InTimeCurrentTime
   * @generated
   */
  public Adapter createInTimeCurrentTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DdslAdapterFactory
