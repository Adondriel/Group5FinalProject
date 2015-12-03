package view;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

import model.Model;

public class TestDisplay {

	@Test
	public void test() {
		Model m = new Model();
		Display d = new Display(m);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the Display start up?"));
	}

}
