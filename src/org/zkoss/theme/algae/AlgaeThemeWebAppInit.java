package org.zkoss.theme.algae;

import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.WebApps;
import org.zkoss.zk.ui.util.WebAppInit;
import org.zkoss.zkmax.theme.ResponsiveThemeRegistry;
import org.zkoss.zul.theme.Themes;

public class AlgaeThemeWebAppInit implements WebAppInit {

	private final static String ATLANTIC_NAME = "algae";
	private final static String ATLANTIC_DISPLAY = "Algae";
	private final static int ATLANTIC_PRIORITY = 1000;

	public void init(WebApp wapp) throws Exception {
		//ZK-2931 custom theme provider and library property for turning on/off the usage of google font
		wapp.getConfiguration().setThemeProvider(new AtlanticCEThemeProvider());
		Themes.register(ATLANTIC_NAME, ATLANTIC_DISPLAY, ATLANTIC_PRIORITY);
		String edition = WebApps.getEdition();
		if ("PE".equals(edition)) {
			wapp.getConfiguration().setThemeProvider(new AtlanticPEThemeProvider());
		}
		if ("EE".equals(edition)) {
			wapp.getConfiguration().setThemeProvider(new AtlanticEEThemeProvider());
			Themes.register(ResponsiveThemeRegistry.TABLET_PREFIX + ATLANTIC_NAME, ATLANTIC_DISPLAY, ATLANTIC_PRIORITY);
		}
	}
}
