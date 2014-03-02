package org.yagamipaul.ants.model;

/**
 *
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a>
 *         30/07/2013
 *
 */
public abstract class Ant extends ALifeEntity {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.yagamipaul.ants.model.ALifeEntity#move(double, double)
	 */
	@Override
	public void move(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

}
