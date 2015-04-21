package org.yagamipaul.antsimulator.entity;

import org.yagamipaul.antsimulator.utils.TextureManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 10/04/2015
 *
 */
public class Ant extends Entity {

	/**
	 * @param texture
	 * @param position
	 * @param direction
	 */
	public Ant(Vector2 position, Vector2 direction) {
		super(TextureManager.ANT_TEXTURE, position, direction);
		this.velocity = 4.0f;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.yagamipaul.antsimulator.entity.AbstractEntity#update()
	 */
	@Override
	public void update() {

		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			this.rotation += 2;
		}

		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			this.rotation -= 2;
		}

		if (Gdx.input.isKeyPressed(Keys.UP)) {
			float x = this.velocity * MathUtils.cos((this.rotation + 90) * MathUtils.PI / 180);
			float y = this.velocity * MathUtils.sin((this.rotation + 90) * MathUtils.PI / 180);
			this.position.add(x, y);
		}

		if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			this.position.add(0.0f, -1f);
		}

	}

}
