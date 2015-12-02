package controller;

import model.Model;

public class SwapPokemonController implements Controller {
	Model myModel;
	public SwapPokemonController(Model m){
		myModel = m;
	}
	@Override
	public void execute() {
		System.out.println("Call Swap Pokemon");
	}

}
