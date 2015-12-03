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
public class TestAttackController {

	@Test
	/**
	 * You will have 30 seconds to select your pokemon, then press the Attack button, then press a specific attack.
	 * Confirm that the attack is being cast and sent to the enemy pokemon
	 */
	public void test() throws InterruptedException {
		Model m = new Model();
		Display d = new Display(m);
		Thread.sleep(30000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the test work correctly?"));	}

}
