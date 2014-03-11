package org.project.droolsDSL.scoping;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;

@SuppressWarnings("all")
public class DdslIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  public IResourceDescription getResourceDescription(final EObject o) {
    IResourceDescription _xblockexpression = null;
    {
      Resource _eResource = o.eResource();
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(_eResource);
      Resource _eResource_1 = o.eResource();
      URI _uRI = _eResource_1.getURI();
      IResourceDescription _resourceDescription = index.getResourceDescription(_uRI);
      _xblockexpression = (_resourceDescription);
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getExportedEObjectDescriptions(final EObject o) {
    IResourceDescription _resourceDescription = this.getResourceDescription(o);
    Iterable<IEObjectDescription> _exportedObjects = _resourceDescription.getExportedObjects();
    return _exportedObjects;
  }
}
