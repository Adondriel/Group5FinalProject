package gameState;

import attacks.Attack;
import view.Display;
import exceptions.StatusEffectException;

/**
 * @author Benjamin Uleau
 *
 */
public class ComputerFight extends Turn {

	/**
	 * @param turnSwitch
	 */
	public ComputerFight(TurnChange turnSwitch) {
		super(turnSwitch);
	}

	@Override
	public void takeTurn() {
		int attack = (int) Math.floor(Math.random() * 4);
		turnSwitch.getComputer().getSelectedPokemon().setCurrentAttack(attack);
		System.out.println("ComputerFight");
		System.out.println("Computer attacking with " + turnSwitch.getComputer().getSelectedPokemon().getDamage() + " damage");
		try {
			turnSwitch.getComputer().getSelectedPokemon().attack(turnSwitch.getPlayer().getSelectedPokemon());
		} catch (StatusEffectException e) {
			e.printStackTrace();
		}
		// turnSwitch.setTrainer(turnSwitch.getPlayer());
		turnSwitch.setTurn(turnSwitch.getPlayerTurn());
		Display.globalDisplay.update();
	}

}