package command;

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
	private Pokemon Pokemon;
	
	public Swap(Trainer p, Pokemon pokemon)
	{
		this.Pokemon = pokemon;
		this.p = p;
	}
	
	//creates buttons 
	@Override
	public void executeSwap()
	{
		p.setSelectedPokemon(Pokemon);
	}

}
