/**
 */
package org.project.droolsDSL.ddsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.project.droolsDSL.ddsl.Statement#getEvent <em>Event</em>}</li>
 *   <li>{@link org.project.droolsDSL.ddsl.Statement#getFluent <em>Fluent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.project.droolsDSL.ddsl.DdslPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(Event)
   * @see org.project.droolsDSL.ddsl.DdslPackage#getStatement_Event()
   * @model containment="true"
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.project.droolsDSL.ddsl.Statement#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Fluent</b></em>' containment reference list.
   * The list contents are of type {@link org.project.droolsDSL.ddsl.Fluent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fluent</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fluent</em>' containment reference list.
   * @see org.project.droolsDSL.ddsl.DdslPackage#getStatement_Fluent()
   * @model containment="true"
   * @generated
   */
  EList<Fluent> getFluent();

} // Statement
