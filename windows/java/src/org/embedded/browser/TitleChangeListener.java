package org.embedded.browser;

import org.eclipse.swt.internal.SWTEventListener;

public interface TitleChangeListener extends SWTEventListener {
	void TitleChanged(String title, Chromium c);
}
