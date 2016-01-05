/**
 * Date: 5/01/2016
 */
package org.yagamipaul.antsimulator.entity;

import org.yagamipaul.antsimulator.utils.TextureManager;

import com.badlogic.gdx.math.Vector2;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a>
 * 5/01/2016
 *
 */
public class Food extends Entity {

	/**
	 * @param texture
	 * @param position
	 * @param direction
	 */
	public Food(Vector2 position) {
		super(TextureManager.FOOD_TEXTURE, position, Vector2.Zero);
	}

	/* (non-Javadoc)
	 * @see org.yagamipaul.antsimulator.entity.Entity#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
