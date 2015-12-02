package controller;

import command.PokemonFacade;
import model.Model;
import pokemon.Pokemon;
import view.BattleView;
import view.Display;
import view.SelectItemView;

public class SwapPokemonController implements Controller {
	Model myModel;
	Pokemon myPokemon;
	public SwapPokemonController(Model m, Pokemon p){
		myModel = m;
		myPokemon = p;
	}
	@Override
	public void execute() {
		System.out.println("Call Swap Pokemon");
		PokemonFacade pf = new PokemonFacade();
		pf.swapCommand(myPokemon);
		Display.globalDisplay.changeView(new BattleView());

	}

}
