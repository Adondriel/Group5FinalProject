package command;

import attacks.Attack;
import gameplay.Computer;
import gameplay.Environment;
import gameplay.Player;
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
	
	private Computer c;
	private Player p;
	Environment e = Environment.getEnvironment();
	
	
	/**
	 * @param a
	 */
	public void attackCommand(Attack a)
	{
		fc = new AttackCommand((Computer)(e.getComputer()), (Player)(e.getPlayer()));
		fc.execute(a);
	}
	
	/**
	 * @param i
	 */
	public void itemCommand(ItemBehavior i)
	{
		ic = new ItemUse((Player)(e.getPlayer()));
		ic.executeItem(i);
	}
	
	/**
	 * @param selectedPokemon
	 */
	public void swapCommand(Pokemon selectedPokemon)
	{
		sc = new Swap((Player)e.getPlayer());
		sc.executeSwap(selectedPokemon);
	}

}
