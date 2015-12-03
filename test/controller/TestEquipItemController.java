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
public class TestEquipItemController {

	@Test
	/**
	 * You will have 30 seconds to select 3 pokemon, click the Equip button, then click the different equipable items.
	 * Confirm that it changes to the item you clicked, and that you only have one Equiped item. (you can't have more than one or it will throw an error)
	 */
	public void test() throws InterruptedException {
		Model m = new Model();
		Display d = new Display(m);
		Thread.sleep(30000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the test work correctly?"));	}

}
