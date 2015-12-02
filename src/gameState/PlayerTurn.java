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
		turnSwitch.setTurn(turnSwitch.getComputerTurn());
		//turnSwitch.setTrainer(turnSwitch.getComputer());
	}
}
