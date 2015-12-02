package gameState;

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
		try {
			turnSwitch.getTrainer().getSelectedPokemon().attack(turnSwitch.getPlayer().getSelectedPokemon());
		} catch (StatusEffectException e) {
			e.printStackTrace();
		}
		turnSwitch.setTrainer(turnSwitch.getPlayer());
		turnSwitch.setTurn(turnSwitch.getPlayerTurn());
	}
	
}
