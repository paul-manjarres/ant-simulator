package org.yagamipaul.antsimulator.utils;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 12/04/2015
 *
 */
public class ScreenManager {

	private static Screen currentScreen;

	/**
	 * @return
	 */
	public static Screen getCurrentScreen() {
		return currentScreen;
	}

	/**
	 * @param screen
	 */
	public static void setScreen(Screen screen) {
		if (currentScreen != null) {
			currentScreen.dispose();
		}

		currentScreen = screen;
		currentScreen.create();
	}
}