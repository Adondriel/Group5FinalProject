package controller;

import attacks.Attack;
import model.Model;

public class AttackController implements Controller {
	Model myModel;
	Attack myAttack;
	public AttackController(Model m, Attack a){
		myModel = m;
	}
	@Override
	public void execute() {
		Environment.getPlayer();
	}

}
