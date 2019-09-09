/**
 *
 */
package org.yagamipaul.antsimulator.entities;

import com.badlogic.gdx.utils.Array;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a> 11/04/2015
 *
 */
public class EntityManager {

	private Array<BaseEntity> entities;

	/**
	 *
	 */
	public EntityManager() {
		this.entities = new Array<BaseEntity>();
	}

	/**
	 * @return
	 */
	public Array<BaseEntity> getEntities() {
		return entities;
	}

	/**
	 * @param entity
	 */
	public void addEntity(BaseEntity entity) {
		this.entities.add(entity);
	}

}
