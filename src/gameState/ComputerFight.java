package gameState;

import attacks.Attack;
import view.Display;
import exceptions.StatusEffectException;

/**
 * @author Benjamin Uleau
 *
 */
public class ComputerFight extends Turn{

	/**
	 * @param turnSwitch
	 */
	public ComputerFight(TurnChange turnSwitch) {
		super(turnSwitch);
	}

	@Override
	public void takeTurn() {
		if (turnSwitch.getComputer().getPokedex().size()==0){
			System.out.println("Player has defeated the computer! Player wins!");
			System.exit(0);
		}
		int attack=(int) Math.floor(Math.random()*4);
		turnSwitch.getComputer().getSelectedPokemon().setCurrentAttack(attack);
		System.out.println("ComputerFight");
		try {
			turnSwitch.getComputer().getSelectedPokemon().attack(turnSwitch.getPlayer().getSelectedPokemon());
		} catch (StatusEffectException e) {
			e.printStackTrace();
		}
		//turnSwitch.setTrainer(turnSwitch.getPlayer());
		turnSwitch.setTurn(turnSwitch.getPlayerTurn());
		Display.globalDisplay.update();
	}
	
}