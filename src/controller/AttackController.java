package controller;

import attacks.Attack;
import gameplay.Environment;
import model.Model;

public class AttackController implements Controller {
	Model myModel;
	Attack myAttack;
	public AttackController(Model m, Attack a){
		myModel = m;
		myAttack = a;
	}
	@Override
	public void execute() {
		
	}

}
