package command;

import attacks.Attack;
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
	
	Environment e = Environment.getEnvironment();

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
	public void execute(Attack a)
	{
		
		p.getSelectedPokemon().selectAttack(a);
		
		/*try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e)
		{
			
			e.printStackTrace();
		} */

	}

}
