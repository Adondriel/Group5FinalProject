package view;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

import model.Model;
/**
 * 
 * @author Adam Pine
 *
 */
public class TestDisplay {

	@Test
	/**
	 * You will have 10 seconds to determine if the display started... Should not take that long.. ever.
	 */
	public void test() throws InterruptedException {
		Model m = new Model();
		Display d = new Display(m);
		Thread.sleep(10000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the Display start up?"));
	}

}
