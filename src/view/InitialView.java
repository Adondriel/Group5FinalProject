package view;

import controller.SelectThreePokemonController;
import model.Model;
import model.Observer;

public class InitialView extends View implements Observer {
	
	
	public InitialView(Model m){
		myModel = m;
		myController = new SelectThreePokemonController(m);
	}

	@Override
	public void update() {
		
	}
}
