/*******************************************************************************
 * Copyright (c) 2016 Weasis Team and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Roduit - initial API and implementation
 *******************************************************************************/
package org.weasis.core.api.gui.util;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public interface ComboBoxModelAdapter<T> extends ListDataListener, State {

    void setModel(ComboBoxModel<T> dataModel);
}