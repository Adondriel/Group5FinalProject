package gameState;

import gameplay.*;

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
	Environment e = Environment.getEnvironment();
	Trainer player=e.getPlayer();
	Trainer computer=e.getComputer();
	Trainer trainer;
	
	/**
	 * @param trainer
	 */
	public TurnChange(Trainer trainer){
		this.trainer=trainer;
		currentTurn= new PlayerTurn(this);
	}
	
	/**
	 * Changes the current turn
	 */
	public void start(){
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
		System.out.println("setting turn...");
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
	 * @param t
	 */
	public void setTrainer(Trainer t){
		trainer=t;
	}
	/**
	 * @return the trainer
	 */
	public Trainer getTrainer(){
		return trainer;
	}
	
	/**
	 * @return computer trainer
	 */
	public Trainer getComputer(){
		return computer;
	}
	
	/**
	 * @return player trainer
	 */
	public Trainer getPlayer(){
		return player;
	}
}
