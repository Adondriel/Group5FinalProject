package view;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

import model.Model;

public class TestSelectItemView {

	@Test
	/**
	 * You will have 15 seconds to select 3 pokemon and then confirm that the item view is able to be displayed
	 * @throws InterruptedException
	 */
	public void testSelectItemView() throws InterruptedException {
		Model m = new Model();
		Display d = new Display(m);
		Thread.sleep(15000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the Display start up?"));
	}

}
