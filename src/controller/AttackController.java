package controller;

import attacks.Attack;
import command.PokemonFacade;
import model.Model;
import view.BattleView;
import view.Display;
/**
 * @author Adam Pine
 */
public class AttackController implements Controller {
	Model myModel;
	Attack myAttack;
	/**
	 * Takes a model, so that it can get info about the game world if needed.
	 * Takes the attack that the player chose.
	 * @param m
	 * @param a
	 */
	public AttackController(Model m, Attack a) {
		myModel = m;
		myAttack = a;
	}

	@Override
	/**
	 * Use the pokemonFacade to call lower level commands
	 */
	public void execute() {
		System.out.println("Call Attack Command");
		//after executed, go back to battle view, battle view should check for player turn.
		PokemonFacade pf = new PokemonFacade();
		pf.attackCommand(myAttack);
		Display.globalDisplay.changeView(new BattleView());
	}

}
