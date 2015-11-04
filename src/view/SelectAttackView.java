package view;

import controller.AttackController;
import model.Model;

public class SelectAttackView extends View {
	public SelectAttackView(Model m){
		myModel = m;
		myController = new AttackController(m);
	}
}
