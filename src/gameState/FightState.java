package gameState;

import gameplay.Computer;

/**
 * @author Benjamin Uleau
 *
 */
public class FightState extends PlayerTurn
{
	/**
	 * @param turnSwitch
	 */
	public FightState(TurnChange turnSwitch) {
		super(turnSwitch);
	}
	
	@Override
	public void takeTurn(){
		//trainer.getSelectedPokemon().attack(turnSwitch.computerTurn.getTrainer().getSelectedPokemon());
		
	}
}
