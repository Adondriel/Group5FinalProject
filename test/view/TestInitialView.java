package view;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

import model.Model;

public class TestInitialView {

	@Test
	/**
	 * You will have 15 seconds to select 3 pokemon and ensure that those 3 pokemon are selected.
	 * @throws InterruptedException
	 */
	public void test() throws InterruptedException {
		Model m = new Model();
		Display d = new Display(m);
		Thread.sleep(15000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the Display start up?"));
	
	}

}
