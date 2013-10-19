/**
 */
package org.project.droolsDSL.ddsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.project.droolsDSL.ddsl.DdslPackage;
import org.project.droolsDSL.ddsl.Reference;
import org.project.droolsDSL.ddsl.ReferenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.project.droolsDSL.ddsl.impl.ReferenceImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.project.droolsDSL.ddsl.impl.ReferenceImpl#getFluentValueSample <em>Fluent Value Sample</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends ExpressionImpl implements Reference
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected ReferenceType ref;

  /**
   * The default value of the '{@link #getFluentValueSample() <em>Fluent Value Sample</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluentValueSample()
   * @generated
   * @ordered
   */
  protected static final int FLUENT_VALUE_SAMPLE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFluentValueSample() <em>Fluent Value Sample</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluentValueSample()
   * @generated
   * @ordered
   */
  protected int fluentValueSample = FLUENT_VALUE_SAMPLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceImpl()
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
    return DdslPackage.Literals.REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceType getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (ReferenceType)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DdslPackage.REFERENCE__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceType basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(ReferenceType newRef)
  {
    ReferenceType oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdslPackage.REFERENCE__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFluentValueSample()
  {
    return fluentValueSample;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFluentValueSample(int newFluentValueSample)
  {
    int oldFluentValueSample = fluentValueSample;
    fluentValueSample = newFluentValueSample;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DdslPackage.REFERENCE__FLUENT_VALUE_SAMPLE, oldFluentValueSample, fluentValueSample));
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
      case DdslPackage.REFERENCE__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case DdslPackage.REFERENCE__FLUENT_VALUE_SAMPLE:
        return getFluentValueSample();
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
      case DdslPackage.REFERENCE__REF:
        setRef((ReferenceType)newValue);
        return;
      case DdslPackage.REFERENCE__FLUENT_VALUE_SAMPLE:
        setFluentValueSample((Integer)newValue);
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
      case DdslPackage.REFERENCE__REF:
        setRef((ReferenceType)null);
        return;
      case DdslPackage.REFERENCE__FLUENT_VALUE_SAMPLE:
        setFluentValueSample(FLUENT_VALUE_SAMPLE_EDEFAULT);
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
      case DdslPackage.REFERENCE__REF:
        return ref != null;
      case DdslPackage.REFERENCE__FLUENT_VALUE_SAMPLE:
        return fluentValueSample != FLUENT_VALUE_SAMPLE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (fluentValueSample: ");
    result.append(fluentValueSample);
    result.append(')');
    return result.toString();
  }

} //ReferenceImpl
