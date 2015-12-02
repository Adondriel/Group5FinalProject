package gameState;

import view.Display;

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
		System.out.println("Computer change pokemon");
		turnSwitch.getTrainer().setSelectedPokemon(turnSwitch.getComputer().getPokemon(turnSwitch.getComputer().getNextPokemonIndex()));
		turnSwitch.setTurn(turnSwitch.getPlayerTurn());
		turnSwitch.setTrainer(turnSwitch.getPlayer());
		Display.updateViews();
	}
	
}
