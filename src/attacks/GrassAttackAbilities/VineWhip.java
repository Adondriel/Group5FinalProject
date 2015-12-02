package attacks.GrassAttackAbilities;

import attacks.Attack;
import exceptions.StatusEffectException;
import gameState.PlayerTurn;
import gameplay.Environment;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is grass based
 *
 */
public class VineWhip extends Attack
{
	Environment e = Environment.getEnvironment();
	/**
	 * @param grass type
	 * @param damage amount
	 */
	public VineWhip(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		if (e.getTc().getCurrentTurn() instanceof PlayerTurn) {
			if (e.getComputer().getSelectedPokemon().getStatus() == null) {
				try {
					// Burn burn = new Burn(e.getCurrentComputerPokemon());
					//e.getCurrentPlayerPokemon().burnTarget();
					e.getComputer().getSelectedPokemon().poisonTarget();
				} catch (StatusEffectException e1) {
					e1.printStackTrace();
				}
			}
			// apply statis affect to computer
		} else {
			if (e.getPlayer().getSelectedPokemon().getStatus() == null) {
				try {
					// Burn burn = new Burn(e.getCurrentPlayerPokemon());
					//e.getCurrentComputerPokemon().burnTarget();
					e.getPlayer().getSelectedPokemon().poisonTarget();
				} catch (StatusEffectException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			// apply statis affect to player
		}
		return (int)(damage * 0.45);
	}

}
