package gameState;

import view.Display;

/**
 * @author Benjamin Uleau
 *
 */
public abstract class PlayerTurn extends Turn
{
	/**
	 * @param turnSwitch
	 */
	public PlayerTurn(TurnChange turnSwitch){
		super(turnSwitch);
	}

	public void takeTurn(){
		turnSwitch.setTurn(turnSwitch.getComputerTurn());
		turnSwitch.setTrainer(turnSwitch.getComputer());
		Display.updateViews();
	}
}
