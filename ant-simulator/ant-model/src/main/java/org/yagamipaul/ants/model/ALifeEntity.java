package org.yagamipaul.ants.model;

import org.yagamipaul.ants.model.organs.Brain;

/**
 *
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a>
 *         30/07/2013
 *
 */
public abstract class ALifeEntity {

	// Inherent properties of a living being

	private double x;

	private double y;

	private double velocityX;

	private double velocityY;

	// Organs

	private Brain brain;

	// Senses
	//
	// private Smell smell;
	//
	// private Taste taste;
	//
	// private Hearing hearing;
	//
	// private Touch touch;
	//
	// private Sight sight;

	public abstract void move(double x, double y);

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the velocityX
	 */
	public double getVelocityX() {
		return velocityX;
	}

	/**
	 * @param velocityX
	 *            the velocityX to set
	 */
	public void setVelocityX(double velocityX) {
		this.velocityX = velocityX;
	}

	/**
	 * @return the velocityY
	 */
	public double getVelocityY() {
		return velocityY;
	}

	/**
	 * @param velocityY
	 *            the velocityY to set
	 */
	public void setVelocityY(double velocityY) {
		this.velocityY = velocityY;
	}

}
