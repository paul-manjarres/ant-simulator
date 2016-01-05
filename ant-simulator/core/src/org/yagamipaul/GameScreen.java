/**
 *
 */
package org.yagamipaul;

import org.yagamipaul.antsimulator.entity.Ant;
import org.yagamipaul.antsimulator.entity.Entity;
import org.yagamipaul.antsimulator.entity.EntityManager;
import org.yagamipaul.antsimulator.entity.Food;
import org.yagamipaul.antsimulator.utils.Screen;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 12/04/2015
 *
 */
public class GameScreen extends Screen {

	private EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.yagamipaul.antsimulator.utils.Screen#create()
	 */
	@Override
	public void create() {
		entityManager = new EntityManager();



		Food newFood = new Food(new Vector2(500, 500));
		entityManager.addEntity(newFood);

		for (int i = 0; i <5; i++) {
			Ant newAnt = new Ant(new Vector2(100+i*20, 20+i*20), Vector2.Zero);
			entityManager.addEntity(newAnt);
		}






	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.yagamipaul.antsimulator.utils.Screen#update()
	 */
	@Override
	public void update() {

		for (Entity entity : entityManager.getEntities()) {
			entity.update();

		}

		// entityManager.upda

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.yagamipaul.antsimulator.utils.Screen#render(com.badlogic.gdx.graphics.g2d.SpriteBatch)
	 */
	@Override
	public void render(SpriteBatch sb) {

		// sb.setProjectionMatrix(projection);

		sb.begin();
		for (Entity entity : entityManager.getEntities()) {
			entity.render(sb);
		}
		sb.end();

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.yagamipaul.antsimulator.utils.Screen#resize(int, int)
	 */
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.yagamipaul.antsimulator.utils.Screen#dispose()
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.yagamipaul.antsimulator.utils.Screen#pause()
	 */
	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.yagamipaul.antsimulator.utils.Screen#resume()
	 */
	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
