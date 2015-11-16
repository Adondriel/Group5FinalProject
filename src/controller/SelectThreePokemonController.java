package controller;

import java.util.ArrayList;

import model.Model;
import pokemon.Pokemon;

public class SelectThreePokemonController implements Controller {
	Model myModel;
	ArrayList<Pokemon> pokemonList;
	public SelectThreePokemonController(Model m, ArrayList<Pokemon> pokemonList){
		myModel = m;
		this.pokemonList = pokemonList;
	}
	
	@Override
	public void execute() {
		for (Pokemon p : pokemonList){
			System.out.println(p.getClass());
		}		
		System.out.println("");
		myModel.getPlayer().setSelectedPokemon(pokemonList.get(0));
		//myModel.getPlayer().setPokedex());
	}
}
