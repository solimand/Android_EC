/**
 */
package org.project.droolsDSL.ddsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.project.droolsDSL.ddsl.InExpr#getInTimeExpr <em>In Time Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.project.droolsDSL.ddsl.DdslPackage#getInExpr()
 * @model
 * @generated
 */
public interface InExpr extends InRule
{
  /**
   * Returns the value of the '<em><b>In Time Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Time Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Time Expr</em>' containment reference.
   * @see #setInTimeExpr(InExpr)
   * @see org.project.droolsDSL.ddsl.DdslPackage#getInExpr_InTimeExpr()
   * @model containment="true"
   * @generated
   */
  InExpr getInTimeExpr();

  /**
   * Sets the value of the '{@link org.project.droolsDSL.ddsl.InExpr#getInTimeExpr <em>In Time Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Time Expr</em>' containment reference.
   * @see #getInTimeExpr()
   * @generated
   */
  void setInTimeExpr(InExpr value);

} // InExpr
