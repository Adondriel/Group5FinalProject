package command;

import attacks.Attack;
import items.ItemBehavior;
import pokemon.Pokemon;

/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
public class PokemonFacade
{
	FightCommand fc;
	ItemCommand ic;
	RunCommand rc;
	SwapCommand sc;
	
	/**
	 * @param fc
	 * @param ic
	 * @param rc
	 * @param sc
	 */
	public PokemonFacade(FightCommand fc, ItemCommand ic, RunCommand rc, SwapCommand sc)
	{
		this.fc = fc;
		this.ic = ic;
		this.rc = rc;
		this.sc = sc;
	}
	/**
	 * @param a
	 */
	public void attackCommand(Attack a)
	{
		fc.execute(a);
	}
	
	/**
	 * @param i
	 */
	public void itemCommand(ItemBehavior i)
	{
		ic.executeItem(i);
	}
	
	/**
	 * @param selectedPokemon
	 */
	public void swapCommand(Pokemon selectedPokemon)
	{
		sc.executeSwap(selectedPokemon);
	}

}
