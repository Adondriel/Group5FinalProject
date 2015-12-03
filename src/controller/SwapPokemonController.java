package controller;

import command.PokemonFacade;
import model.Model;
import pokemon.Pokemon;
import view.BattleView;
import view.Display;
import view.SelectItemView;
/**
 * This controls the swapping of the player pokemon.
 * @author Adam Pine
 *
 */
public class SwapPokemonController implements Controller {
	Model myModel;
	Pokemon myPokemon;
	/**
	 * Takes in a model, incase it needs to access model information.
	 * Takes in the Pokemon that the player wants to swap to.
	 * @param m
	 * @param p
	 */
	public SwapPokemonController(Model m, Pokemon p){
		myModel = m;
		myPokemon = p;
	}
	@Override
	/**
	 * Uses a PokemonFacade to call lower level functions.
	 */
	public void execute() {
		System.out.println("Call Swap Pokemon");
		PokemonFacade pf = new PokemonFacade();
		pf.swapCommand(myPokemon);
		Display.globalDisplay.changeView(new BattleView());

	}

}
