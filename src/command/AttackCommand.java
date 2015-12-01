package command;

import exceptions.StatusEffectException;
import gameplay.Computer;
import gameplay.Environment;
import gameplay.Player;
import gameplay.Trainer;
import pokemon.Pokemon;

/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
public class AttackCommand implements FightCommand
{
	private Computer c;
	private Player p;
	
	Environment e = Environment.getEnvironment(p, c);

	/**
	 * @param t ai player
	 * @param p player
	 */
	public AttackCommand(Computer c, Player p)
	{
		this.c = c;
		this.p = p;
		
	}
	
	@Override
	public void execute()
	{
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e)
		{
			
			e.printStackTrace();
		}

	}

}
