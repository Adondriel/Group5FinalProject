package controller;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

import model.Model;
import view.Display;
/**
 * 
 * @author Adam Pine
 *
 */
public class TestSwapPokemonController {

	@Test
	/**
	 * You will have 30 seconds to select 3 pokemon then click the Swap button then click one of the pokemon that you want to swap to.
	 * Confirm that your players pokemon has successfully swapped to the pokemon you chose.
	 */
	public void test() throws InterruptedException {
		Model m = new Model();
		Display d = new Display(m);
		Thread.sleep(30000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the test run correctly?"));	}

}
