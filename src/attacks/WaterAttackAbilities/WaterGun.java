package attacks.WaterAttackAbilities;

import attacks.Attack;
import exceptions.StatusEffectException;
import gameState.PlayerTurn;
import gameplay.Environment;
import pokemon.Pokemon;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is water based
 *
 */
public class WaterGun extends Attack
{
	/**
	 * @param water
	 * @param damage
	 */
	public WaterGun(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		Environment e = Environment.getEnvironment();

		if (e.getTc().getCurrentTurn() instanceof PlayerTurn) {
			if (e.getComputer().getSelectedPokemon().getStatus() == null) {
				try {
					// Burn burn = new Burn(e.getCurrentComputerPokemon());
					//e.getCurrentPlayerPokemon().burnTarget();
					e.getComputer().getSelectedPokemon().freezeTarget();
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
					e.getPlayer().getSelectedPokemon().freezeTarget();
				} catch (StatusEffectException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			// apply statis affect to player
		}
		return (int)(damage *0.4);
	}


}
