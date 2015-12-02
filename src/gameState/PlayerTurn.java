package gameState;

import view.Display;

/**
 * @author Benjamin Uleau
 *
 */
public class PlayerTurn extends Turn
{
	/**
	 * @param turnSwitch
	 */
	public PlayerTurn(TurnChange turnSwitch){
		super(turnSwitch);
	}

	public void takeTurn(){
		System.out.println("Player turn");
		//turnSwitch.setTurn(turnSwitch.getComputerTurn());
		//turnSwitch.setTrainer(turnSwitch.getComputer());
		Display.globalDisplay.update();
	}
	/**
	 * This method should be called by the commands that want to change turn.
	 */
	public void actuallyTakeTurn(){
		turnSwitch.setTurn(turnSwitch.getComputerTurn());
	}
}
