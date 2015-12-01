package gameState;

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
		turnSwitch.getTrainer().getSelectedPokemon().attack(target);
	}
	
}
