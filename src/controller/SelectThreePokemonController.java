package controller;

import java.util.ArrayList;

import exceptions.StatusEffectException;
import gameState.TurnChange;
import gameplay.Environment;
import gameplay.Player;
import model.Model;
import pokemon.Pokemon;
import view.BattleView;
import view.Display;
/**
 * This controller is used by the initialView to select 3 pokemon and
 * initialize some environment variables, like player, and currentTurn(currentState)
 * @author Adam Pine *
 */
public class SelectThreePokemonController implements Controller {
	Model myModel;
	ArrayList<Pokemon> pokemonList;
	/**
	 * Takes in an arraylist of Pokemon.
	 * Requires the model so that it can get environment and world information.
	 * @param m
	 * @param pokemonList
	 */
	public SelectThreePokemonController(Model m, ArrayList<Pokemon> pokemonList) {
		myModel = m;
		this.pokemonList = pokemonList;
		Player p = new Player(pokemonList, pokemonList.get(0));
		myModel.setPlayer(p);
	}

	@Override
	/**
	 * The logic in this is not provided by the PokemonFacade so I had to do it myself.
	 * This will print out all of the selected pokemon names
	 * Then it will set the players selected pokemon to the first pokemon they selected
	 * Then it will set the players Pokedex to the the entire arraylist of pokemon that was passed in with the constructor.
	 * Then it will set the environments current state, and then it will start the game turn state pattern.
	 * After all of this it will change to battleView!
	 */
	public void execute() {
		for (Pokemon p : pokemonList) {
			System.out.println(p.getClass().getSimpleName());
		}
		System.out.println("");
		myModel.getPlayer().setSelectedPokemon(pokemonList.get(0));
		myModel.getPlayer().setPokedex(pokemonList);
		myModel.setTC(new TurnChange(myModel.getPlayer()));
		myModel.getState().start();
		Display.globalDisplay.changeView(new BattleView());
	}
}
