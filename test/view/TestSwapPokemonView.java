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
public class TestSwapPokemonView {

	@Test
	/**
	 * You will have 15 seconds to select 3 pokemon.
	 * Confirm that the swapPokemon view displays the user's pokemon.
	 * 
	 * @throws InterruptedException
	 */
	public void test() throws InterruptedException {
		Model m = new Model();
		Display d = new Display(m);
		Thread.sleep(15000);
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null, "Did the SwapPokemonView display correctly?"));
	}

}
