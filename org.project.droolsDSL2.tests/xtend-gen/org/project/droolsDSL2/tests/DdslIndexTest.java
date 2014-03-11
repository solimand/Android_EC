package org.project.droolsDSL2.tests;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.droolsDSL.DdslInjectorProvider;
import org.project.droolsDSL.ddsl.DroolsModel;
import org.project.droolsDSL.scoping.DdslIndex;

@RunWith(XtextRunner.class)
@InjectWith(DdslInjectorProvider.class)
@SuppressWarnings("all")
public class DdslIndexTest {
  @Inject
  @Extension
  private ParseHelper<DroolsModel> _parseHelper;
  
  @Inject
  @Extension
  private DdslIndex _ddslIndex;
  
  @Test
  public void testExportedEObjectDescriptions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("on Ev1(x,y,z) set F1 to 1");
      _builder.newLine();
      DroolsModel _parse = this._parseHelper.parse(_builder);
      this.assertExportedEObjectDescriptions(_parse, "x, y, z, F1");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertExportedEObjectDescriptions(final EObject o, final CharSequence expected) {
    String _string = expected.toString();
    Iterable<IEObjectDescription> _exportedEObjectDescriptions = this._ddslIndex.getExportedEObjectDescriptions(o);
    final Function1<IEObjectDescription,QualifiedName> _function = new Function1<IEObjectDescription,QualifiedName>() {
      public QualifiedName apply(final IEObjectDescription it) {
        QualifiedName _qualifiedName = it.getQualifiedName();
        return _qualifiedName;
      }
    };
    Iterable<QualifiedName> _map = IterableExtensions.<IEObjectDescription, QualifiedName>map(_exportedEObjectDescriptions, _function);
    String _join = IterableExtensions.join(_map, ", ");
    Assert.assertEquals(_string, _join);
  }
}
