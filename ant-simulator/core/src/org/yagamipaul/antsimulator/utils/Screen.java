package org.yagamipaul.antsimulator.utils;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 12/04/2015
 *
 */
public abstract class Screen {

	public abstract void create();

	public abstract void update();

	public abstract void render(SpriteBatch sb);

	public abstract void resize(int width, int height);

	public abstract void dispose();

	public abstract void pause();

	public abstract void resume();

}
