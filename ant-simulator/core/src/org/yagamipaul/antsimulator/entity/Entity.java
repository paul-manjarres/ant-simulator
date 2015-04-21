package org.yagamipaul.antsimulator.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 10/04/2015
 *
 */
public abstract class Entity {

	protected Texture texture;

	protected Vector2 position;

	protected float velocity;

	protected Vector2 direction;

	protected float rotation = 0.0f;

	/**
	 * @param texture
	 * @param position
	 * @param direction
	 */
	public Entity(Texture texture, Vector2 position, Vector2 direction) {
		super();
		this.texture = texture;
		this.position = position;
		this.direction = direction;
	}

	/**
	 *
	 */
	public abstract void update();

	/**
	 * @param sb
	 */
	public void render(SpriteBatch sb) {

		float x = this.position.x;
		float y = this.position.y;
		int width = this.texture.getWidth();
		int heigth = this.texture.getHeight();
		float scaleX = 1f;
		float scaleY = 1f;
		float originX = width / 2;
		float originY = heigth / 2;

		sb.draw(this.texture, x, y, originX, originY, width, heigth, scaleX, scaleY, this.rotation, 0, 0, width, heigth, false, false);
	}

}
