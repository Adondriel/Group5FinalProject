package controller;

import attacks.Attack;
import model.Model;
import view.BattleView;
import view.Display;
/**
 * @author Adam Pine
 */
public class AttackController implements Controller {
	Model myModel;
	Attack myAttack;

	public AttackController(Model m, Attack a) {
		myModel = m;
		myAttack = a;
	}

	@Override
	public void execute() {
		System.out.println("Call Attack Command");
		//after executed, go back to battle view, battle view should check for player turn.
		Display.globalDisplay.changeView(new BattleView());
	}

}
