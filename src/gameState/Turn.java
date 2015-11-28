package gameState;

import gameplay.Trainer;

/**
 * @author Benjamin Uleau
 *
 */
public abstract class Turn
{
	TurnChange turnSwitch;
	Trainer trainer;
	
	/**
	 * @return the current trainer
	 */
	public Trainer getTrainer(){
		return trainer;
	}
	/**
	 * Take the turn
	 */
	public abstract void takeTurn();
}
