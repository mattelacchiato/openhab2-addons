/**
 * Copyright (c) 2010-2014, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.hms;

import org.openhab.binding.hms.internal.HMSGenericBindingProvider.HMSBindingConfig;
import org.openhab.core.binding.BindingProvider;

/**
 * @author Thomas Urmann
 * @since 1.6.0
 */
public interface HMSBindingProvider extends BindingProvider {
	public HMSBindingConfig getBindingConfigForAddressAndDatapoint(String address, HMSBindingConfig.Datapoint datapoint);
}
