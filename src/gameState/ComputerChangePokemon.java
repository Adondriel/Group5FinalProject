package gameState;

/**
 * @author Benjamin Uleau
 *
 */
public class ComputerChangePokemon extends Turn{

	/**
	 * @param turnSwitch
	 */
	public ComputerChangePokemon(TurnChange turnSwitch) {
		super(turnSwitch);
	}

	@Override
	public void takeTurn() {
		turnSwitch.getTrainer().setSelectedPokemon(turnSwitch.getTrainer().getPokemon(turnSwitch.getTrainer().getNextPokemonIndex()));
		turnSwitch.setTurn(turnSwitch.getPlayerTurn());
		turnSwitch.setTrainer(turnSwitch.getPlayer());
	}
	
}
