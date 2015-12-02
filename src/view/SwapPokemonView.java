package view;

import controller.SwapPokemonController;
import model.Model;
import model.Observer;

public class SwapPokemonView extends View implements Observer{
	public SwapPokemonView(Model m){
		myModel = m;
		myController = new SwapPokemonController(m);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
