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
		if (turnSwitch.getComputer().getPokedex().size()==0){
			System.out.println("Player has defeated the computer! Player wins!");
			System.exit(0);
		}
		System.out.println("Computer change pokemon");
		turnSwitch.getComputer().setSelectedPokemon(turnSwitch.getComputer().getPokemon(0));
		turnSwitch.setTurn(turnSwitch.getPlayerTurn());
		//turnSwitch.setTrainer(turnSwitch.getPlayer());
		Display.updateViews();
	}
	
}
