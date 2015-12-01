package command;

import gameplay.Player;
import gameplay.Trainer;
import pokemon.Pokemon;

/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
public class Attack implements FightCommand
{
	private Trainer t;
	private Trainer p;

	/**
	 * @param t ai player
	 * @param p player
	 */
	public Attack(Trainer t, Trainer p)
	{
		this.t = t; //A.I
		this.p = p; //PLAYER
	}
	
	@Override
	public void execute()
	{
		p.getSelectedPokemon().attack(t.getSelectedPokemon());
	}

}
