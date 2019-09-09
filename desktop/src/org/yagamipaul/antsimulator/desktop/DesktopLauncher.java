package org.yagamipaul.antsimulator.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.yagamipaul.antsimulator.AntSimulatorApplication;
import org.yagamipaul.antsimulator.GameApplication;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new AntSimulatorApplication(), config);
	}
}
