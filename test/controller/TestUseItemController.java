package controller;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

import gameplay.Environment;
import gameplay.Player;
import items.BottleWater;
import items.HPPotion;
import model.Model;
import view.Display;
import view.View;
/**
 * 
 * @author Adam Pine
 * If you need more time for these tests, you can add more time to the sleep threads
 * or you can put the adding of items to the player inside of the InitialView, then just run the display class.
 */
public class TestUseItemController {

	
	@Test
	/**
	 * You will have 30 seconds to select 3 pokemon, then press the items button.
	 * Confirm that the back button shows up.
	 * @throws InterruptedException
	 */
	public void testNoItem() throws InterruptedException {
		Environment e = Environment.getEnvironment();
		Player p = new Player(null, null);
		p.addItem(new HPPotion());
		p.addItem(new BottleWater());
		//e.setPlayer(p);
		Model m = new Model();
		Display d = new Display(m);
		Thread.sleep(30000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the Back button show up?"));
	}
	@Test
	/**
	 * You will have 30 seconds to select 3 pokemon, within 8 seconds, then after 8 seconds press the items button.
	 * Confirm that the item shows up.
	 * @throws InterruptedException
	 */
	public void testOneItem() throws InterruptedException {
		Environment e = Environment.getEnvironment();
		Player p = new Player(null, null);
		p.addItem(new HPPotion());
		p.addItem(new BottleWater());
		//e.setPlayer(p);
		Model m = new Model();
		Display d = new Display(m);
		//Select the pokemon fast! so that the Init view creates the pokemon, then the test can add the items to it.
		Thread.sleep(8000);
		View.myModel.getPlayer().addItem(new BottleWater());
		//Wait until it prints out 1 in the console, then click "Items"
		System.out.println(View.myModel.getPlayer().getItems().size());
		Thread.sleep(30000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the Item show up?"));
	}
	@Test
	/**
	 * You will have 30 seconds to select 3 pokemon, within 8 seconds, then after 8 seconds press the items button.
	 * Confirm that the item shows up.
	 * @throws InterruptedException
	 */
	public void testTwoItems() throws InterruptedException {
		Environment e = Environment.getEnvironment();
		Model m = new Model();
		Display d = new Display(m);
		//Select the pokemon fast! so that the Init view creates the pokemon, then the test can add the items to it.
		Thread.sleep(8000);
		View.myModel.getPlayer().addItem(new BottleWater());
		View.myModel.getPlayer().addItem(new HPPotion());
		//Wait until it prints out 2 in the console, then click "Items"
		System.out.println(View.myModel.getPlayer().getItems().size());
		Thread.sleep(30000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did 2 Items show up?"));
	}

}
