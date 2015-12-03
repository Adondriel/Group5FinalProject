package model;

import static org.junit.Assert.*;

import org.junit.Test;

import gameplay.Environment;
/**
 * Test model class.
 * @author Adam Pine
 *
 */
public class TestModel {

	@Test
	/**
	 * The model uses the environment, test to make sure that the model and environment use the same exact data.
	 */
	public void test() {
		Model m = new Model();
		Environment e = Environment.getEnvironment();
		assertEquals(m.getPlayer(), e.getPlayer());
		assertEquals(m.getComputer(), e.getComputer());
		assertEquals(m.getState(), e.getTc());
	}

}
