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
public class TestSelectThreePokemonController {

	@Test
	/**
	 * You will have 15 seconds to select three pokemon.
	 * Confirm that those 3 pokemon were actually selected. (Program will print them out, and you can also view them by pressing the swap button.)
	 */
	public void test() throws InterruptedException {
		Model m = new Model();
		Display d = new Display(m);
		Thread.sleep(15000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the test work correctly?"));
	}

}
