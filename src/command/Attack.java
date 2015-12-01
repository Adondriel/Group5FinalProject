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
