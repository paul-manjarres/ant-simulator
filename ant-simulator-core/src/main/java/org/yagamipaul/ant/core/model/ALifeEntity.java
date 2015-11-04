/**
 * Evoki.co - Plume Works Copyright (c) 2013 - 2015 by Jean Paul Manjarres Correal - All Rights
 * Reserved. Propietary and Confidential - This source code is not for redistribution
 * http://evoki.co Date: 4/11/2015
 *
 */
package org.yagamipaul.ant.core.model;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

/**
 * @author <a href="mailto:paul.manjarres@gmail.com">Jean Paul Manjarres Correal. </a> 4/11/2015
 *
 */
public class ALifeEntity {

	protected Vector2D position;

	protected Vector2D velocity;

	/**
	 * @return the position
	 */
	public Vector2D getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Vector2D position) {
		this.position = position;
	}

	/**
	 * @return the velocity
	 */
	public Vector2D getVelocity() {
		return velocity;
	}

	/**
	 * @param velocity the velocity to set
	 */
	public void setVelocity(Vector2D velocity) {
		this.velocity = velocity;
	}

}
