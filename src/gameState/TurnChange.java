package gameState;

import gameplay.Trainer;

/**
 * @author Benjamin Uleau
 *
 */
public class TurnChange
{
	Turn playerTurn;
	Turn computerTurn;
	Turn currentTurn;
	Turn computerFight;
	Turn computerPokemon;
	Trainer trainer;
	
	/**
	 * @param trainer
	 */
	public TurnChange(Trainer trainer){
		this.trainer=trainer;
	}
	
	/**
	 * Changes the current turn
	 */
	public void switchTurn(){
		takeTurn();
	}
	
	/**
	 * @return playerTurn
	 */
	public Turn getPlayerTurn(){
		return playerTurn;
	}
	
	/**
	 * @return computerTurn
	 */
	public Turn getComputerTurn(){
		return computerTurn;
	}
	
	/**
	 * @return computerFight
	 */
	public Turn getComputerFight(){
		return computerFight;
	}
	
	/**
	 * @return computerPokemon
	 */
	public Turn getComputerPokemon(){
		return computerPokemon;
	}
	/**
	 * @param t the turn
	 */
	public void setTurn(Turn t){
		currentTurn=t;
	}
	
	/**
	 * @return the current turn
	 */
	public Turn getCurrentTurn(){
		return currentTurn;
	}
	
	/**
	 * The current player takes their turn
	 */
	public void takeTurn(){
		currentTurn.takeTurn();
	}
	
	/**
	 * @return the trainer
	 */
	public Trainer getTrainer(){
		return trainer;
	}
}
