package view;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

import model.Model;

public class TestBattleView {

	@Test
	/**
	 * You will have 15 seconds to select 3 pokemon, then confirm that the program continues to the battlefield and that the batttlefield displays info correctly.
	 * @throws InterruptedException
	 */
	public void test() throws InterruptedException {
		Model m = new Model();
		Display d = new Display(m);
		Thread.sleep(15000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the Display start up?"));
	
	}

}
