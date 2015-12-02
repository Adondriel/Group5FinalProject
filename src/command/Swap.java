package command;

import gameState.PlayerTurn;
import gameplay.Environment;
import gameplay.Trainer;
import pokemon.Pokemon;

/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
public class Swap implements SwapCommand
{

	private Trainer p;
	
	
	Environment e = Environment.getEnvironment();
	
	/**
	 * @param p
	 */
	public Swap(Trainer p)
	{
		this.p = p;
	}
	
	//creates buttons 
	@Override
	public void executeSwap(Pokemon selectedPokemon)
	{
		e.setPlayerPokemon(selectedPokemon);
		if (e.getTc().getCurrentTurn() instanceof PlayerTurn){
			PlayerTurn pt = (PlayerTurn) e.getTc().getCurrentTurn();
			pt.actuallyTakeTurn();

		}
	}

}
