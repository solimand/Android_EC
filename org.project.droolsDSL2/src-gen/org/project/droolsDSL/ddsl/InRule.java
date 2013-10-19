/**
 */
package org.project.droolsDSL.ddsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.project.droolsDSL.ddsl.InRule#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.project.droolsDSL.ddsl.DdslPackage#getInRule()
 * @model
 * @generated
 */
public interface InRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(Expression)
   * @see org.project.droolsDSL.ddsl.DdslPackage#getInRule_Time()
   * @model containment="true"
   * @generated
   */
  Expression getTime();

  /**
   * Sets the value of the '{@link org.project.droolsDSL.ddsl.InRule#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(Expression value);

} // InRule
