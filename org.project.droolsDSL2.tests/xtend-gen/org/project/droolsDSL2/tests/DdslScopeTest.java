package org.project.droolsDSL2.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.droolsDSL.DdslInjectorProvider;
import org.project.droolsDSL.ddsl.DroolsModel;

@RunWith(XtextRunner.class)
@InjectWith(DdslInjectorProvider.class)
@SuppressWarnings("all")
public class DdslScopeTest {
  @Inject
  @Extension
  private ParseHelper<DroolsModel> _parseHelper;
  
  @Inject
  @Extension
  private IScopeProvider _iScopeProvider;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testScopeProvider() {
  }
  
  private void assertScope(final EObject context, final EReference reference, final CharSequence expected) {
    this._validationTestHelper.assertNoErrors(context);
    String _string = expected.toString();
    IScope _scope = this._iScopeProvider.getScope(context, reference);
    Iterable<IEObjectDescription> _allElements = _scope.getAllElements();
    final Function1<IEObjectDescription,QualifiedName> _function = new Function1<IEObjectDescription,QualifiedName>() {
      public QualifiedName apply(final IEObjectDescription it) {
        QualifiedName _name = it.getName();
        return _name;
      }
    };
    Iterable<QualifiedName> _map = IterableExtensions.<IEObjectDescription, QualifiedName>map(_allElements, _function);
    String _join = IterableExtensions.join(_map, ", ");
    Assert.assertEquals(_string, _join);
  }
}
