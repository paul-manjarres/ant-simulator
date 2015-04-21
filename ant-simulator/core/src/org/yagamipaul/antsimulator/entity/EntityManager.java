/**
 *
 */
package org.yagamipaul.antsimulator.entity;

import com.badlogic.gdx.utils.Array;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 11/04/2015
 *
 */
public class EntityManager {

	private Array<Entity> entities;

	/**
	 *
	 */
	public EntityManager() {
		this.entities = new Array<Entity>();
	}

	/**
	 * @return
	 */
	public Array<Entity> getEntities() {
		return entities;
	}

	/**
	 * @param entity
	 */
	public void addEntity(Entity entity) {
		this.entities.add(entity);
	}

}
