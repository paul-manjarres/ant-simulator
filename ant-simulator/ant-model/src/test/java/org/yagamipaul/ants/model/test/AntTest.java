package org.yagamipaul.ants.model.test;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.yagamipaul.ants.model.Ant;
import org.yagamipaul.ants.model.WorkerAnt;

/**
 * @author <a href="paul.manjarres@gmail.com">Jean Paul Manjarres Correal</a>
 *         30/07/2013
 *
 */
public class AntTest {

	/**
	 *
	 */
	@Test
	public void testAnt() {

		final Ant ant = new WorkerAnt();

		ant.setX(10.5d);
		ant.setY(24.2d);

		ant.move(10.0d, 10.0d);

		Assert.assertEquals(10.0d, ant.getX());
		Assert.assertEquals(10.0d, ant.getY());

	}

}
