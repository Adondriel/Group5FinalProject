package view;

import controller.SwapPokemonController;
import model.Model;

public class SwapPokemonView extends View {
	public SwapPokemonView(Model m){
		myModel = m;
		myController = new SwapPokemonController(m);
	}
}
