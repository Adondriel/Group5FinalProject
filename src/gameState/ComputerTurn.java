package gameState;

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
		if(turnSwitch.getTrainer().getSelectedPokemon().getCurrentHealth()==0){
			turnSwitch.setTurn(turnSwitch.getComputerPokemon());
		}
		else{
			turnSwitch.setTurn(turnSwitch.getComputerFight());
		}
	}
	
}