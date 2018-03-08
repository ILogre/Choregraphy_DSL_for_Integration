/*
 * generated by Xtext 2.12.0
 */
package com.chor4integration.textdsl.ui;

import com.chor4integration.textdsl.ui.internal.TextdslActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Chor4IntTxtDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TextdslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TextdslActivator.getInstance().getInjector(TextdslActivator.COM_CHOR4INTEGRATION_TEXTDSL_CHOR4INTTXTDSL);
	}
	
}