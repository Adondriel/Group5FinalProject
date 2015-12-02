package gameState;

import gameplay.Trainer;
import pokemon.Pokemon;

/**
 * @author Benjamin Uleau
 *
 */
public class ComputerTurn extends Turn
{
	/**
	 * @param turnSwitch
	 */
	public ComputerTurn(TurnChange turnSwitch){
		super(turnSwitch);
	}

	@Override
	public void takeTurn(){
		System.out.println("Computer turn");
		TurnChange ts = turnSwitch;
		Trainer t = turnSwitch.getTrainer();
		Pokemon p = turnSwitch.getTrainer().getSelectedPokemon();
		int i = turnSwitch.getComputer().getSelectedPokemon().getCurrentHealth();
		if(turnSwitch.getComputer().getSelectedPokemon().getCurrentHealth()==0){
			turnSwitch.setTurn(turnSwitch.getComputerPokemon());
		}
		else{
			turnSwitch.setTurn(turnSwitch.getComputerFight());
		}
	}
	
}