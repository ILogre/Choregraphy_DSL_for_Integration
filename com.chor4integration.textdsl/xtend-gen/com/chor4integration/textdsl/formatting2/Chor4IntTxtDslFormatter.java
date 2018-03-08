/**
 * generated by Xtext 2.12.0
 */
package com.chor4integration.textdsl.formatting2;

import com.chor4integration.chor4int.Choreography;
import com.chor4integration.chor4int.FlowElement;
import com.chor4integration.servicesmetamodel.Operation;
import com.chor4integration.servicesmetamodel.Service;
import com.chor4integration.textdsl.services.Chor4IntTxtDslGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class Chor4IntTxtDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private Chor4IntTxtDslGrammarAccess _chor4IntTxtDslGrammarAccess;
  
  protected void _format(final Choreography choreography, @Extension final IFormattableDocument document) {
    EList<FlowElement> _flowElements = choreography.getFlowElements();
    for (final FlowElement flowElement : _flowElements) {
      document.<FlowElement>format(flowElement);
    }
  }
  
  protected void _format(final Service service, @Extension final IFormattableDocument document) {
    EList<Operation> _operations = service.getOperations();
    for (final Operation operation : _operations) {
      document.<Operation>format(operation);
    }
  }
  
  public void format(final Object service, final IFormattableDocument document) {
    if (service instanceof XtextResource) {
      _format((XtextResource)service, document);
      return;
    } else if (service instanceof Service) {
      _format((Service)service, document);
      return;
    } else if (service instanceof Choreography) {
      _format((Choreography)service, document);
      return;
    } else if (service instanceof EObject) {
      _format((EObject)service, document);
      return;
    } else if (service == null) {
      _format((Void)null, document);
      return;
    } else if (service != null) {
      _format(service, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(service, document).toString());
    }
  }
}
