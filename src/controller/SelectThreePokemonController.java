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

public class SelectThreePokemonController implements Controller {
	Model myModel;
	ArrayList<Pokemon> pokemonList;

	public SelectThreePokemonController(Model m, ArrayList<Pokemon> pokemonList) {
		myModel = m;
		this.pokemonList = pokemonList;
		Player p = new Player(pokemonList, pokemonList.get(0));
		myModel.setPlayer(p);
	}

	@Override
	public void execute() {
		for (Pokemon p : pokemonList) {
			System.out.println(p.getClass());
		}
		System.out.println("");
		myModel.getPlayer().setSelectedPokemon(pokemonList.get(0));
		myModel.getPlayer().setPokedex(pokemonList);
		myModel.setTC(new TurnChange(myModel.getPlayer()));
		myModel.getState().start();
		Display.globalDisplay.changeView(new BattleView());
	}
}
