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
		if (turnSwitch.getComputer().getPokedex().size()==0){
			System.out.println("Player has defeated the computer! Player wins!");
			System.exit(0);
		}
		System.out.println("Computer turn");
		//Trainer t = turnSwitch.getTrainer();
		//Pokemon p = turnSwitch.getTrainer().getSelectedPokemon();
		int i = turnSwitch.getComputer().getSelectedPokemon().getCurrentHealth();
		if(turnSwitch.getComputer().getSelectedPokemon().getCurrentHealth()<=0){
			turnSwitch.getComputer().getPokedex().remove(turnSwitch.getComputer().getSelectedPokemon());
			turnSwitch.setTurn(turnSwitch.getComputerPokemon());
		}
		else{
			turnSwitch.setTurn(turnSwitch.getComputerFight());
		}
	}
	
}