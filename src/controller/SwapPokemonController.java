package controller;

import model.Model;
import pokemon.Pokemon;
import view.Display;
import view.SelectItemView;

public class SwapPokemonController implements Controller {
	Model myModel;
	public SwapPokemonController(Model m, Pokemon p){
		myModel = m;
	}
	@Override
	public void execute() {
		System.out.println("Call Swap Pokemon");
		
		Display.globalDisplay.changeView(new SelectItemView());

	}

}
