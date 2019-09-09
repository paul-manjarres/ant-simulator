package org.yagamipaul.antsimulator;

import org.yagamipaul.antsimulator.utils.ScreenManager;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 */
public class AntSimulatorApplication extends ApplicationAdapter {

	private SpriteBatch batch;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.badlogic.gdx.ApplicationAdapter#create()
	 */
	@Override
	public void create() {
		batch = new SpriteBatch();

		ScreenManager.setScreen(new GameScreen());

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.badlogic.gdx.ApplicationAdapter#render()
	 */
	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if (ScreenManager.getCurrentScreen() != null) {
			ScreenManager.getCurrentScreen().update();
			ScreenManager.getCurrentScreen().render(batch);

		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.badlogic.gdx.ApplicationAdapter#resize(int, int)
	 */
	@Override
	public void resize(int width, int height) {

		if (ScreenManager.getCurrentScreen() != null) {
			ScreenManager.getCurrentScreen().resize(width, height);
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.badlogic.gdx.ApplicationAdapter#pause()
	 */
	@Override
	public void pause() {
		if (ScreenManager.getCurrentScreen() != null) {
			ScreenManager.getCurrentScreen().pause();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.badlogic.gdx.ApplicationAdapter#resume()
	 */
	@Override
	public void resume() {
		if (ScreenManager.getCurrentScreen() != null) {
			ScreenManager.getCurrentScreen().resume();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.badlogic.gdx.ApplicationAdapter#dispose()
	 */
	@Override
	public void dispose() {
		if (ScreenManager.getCurrentScreen() != null) {
			ScreenManager.getCurrentScreen().dispose();
		}
		batch.dispose();
	}

}
