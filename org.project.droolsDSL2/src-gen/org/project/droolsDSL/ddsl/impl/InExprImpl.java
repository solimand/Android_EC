/**
 */
package org.project.droolsDSL.ddsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.project.droolsDSL.ddsl.DdslPackage;
import org.project.droolsDSL.ddsl.InExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.project.droolsDSL.ddsl.impl.InExprImpl#getInTimeExpr <em>In Time Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InExprImpl extends InRuleImpl implements InExpr
{
  /**
   * The cached value of the '{@link #getInTimeExpr() <em>In Time Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInTimeExpr()
   * @generated
   * @ordered
   */
  protected InExpr inTimeExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DdslPackage.Literals.IN_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InExpr getInTimeExpr()
  {
    return inTimeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInTimeExpr(InExpr newInTimeExpr, NotificationChain msgs)
  {
    InExpr oldInTimeExpr = inTimeExpr;
    inTimeExpr = newInTimeExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DdslPackage.IN_EXPR__IN_TIME_EXPR, oldInTimeExpr, newInTimeExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInTimeExpr(InExpr newInTimeExpr)
  {
    if (newInTimeExpr != inTimeExpr)
    {
      NotificationChain msgs = null;
      if (inTimeExpr != null)
        msgs = ((InternalEObject)inTimeExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DdslPackage.IN_EXPR__IN_TIME_EXPR, null, msgs);
      if (newInTimeExpr != null)
        msgs = ((InternalEObject)newInTimeExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DdslPackage.IN_EXPR__IN_TIME_EXPR, null, msgs);
      msgs = basicSetInTimeExpr(newInTimeExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdslPackage.IN_EXPR__IN_TIME_EXPR, newInTimeExpr, newInTimeExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DdslPackage.IN_EXPR__IN_TIME_EXPR:
        return basicSetInTimeExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DdslPackage.IN_EXPR__IN_TIME_EXPR:
        return getInTimeExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DdslPackage.IN_EXPR__IN_TIME_EXPR:
        setInTimeExpr((InExpr)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DdslPackage.IN_EXPR__IN_TIME_EXPR:
        setInTimeExpr((InExpr)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DdslPackage.IN_EXPR__IN_TIME_EXPR:
        return inTimeExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //InExprImpl
