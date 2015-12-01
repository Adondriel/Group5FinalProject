package command;

import gameplay.Trainer;

/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
public class Swap implements SwapCommand
{

	private Trainer p;
	public Swap(Trainer p, )
	{
		this.p = p;
	}
	
	//creates buttons 
	@Override
	public void executeSwap()
	{
		p.setSelectedPokemon();
	}

}
