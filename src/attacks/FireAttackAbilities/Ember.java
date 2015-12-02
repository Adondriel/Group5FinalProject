package attacks.FireAttackAbilities;

import attacks.Attack;
import exceptions.StatusEffectException;
import gameState.PlayerTurn;
import gameplay.Environment;
import gameplay.Player;
import statusEffects.Burn;

/**
 * @author Bradley Solorzano Design Patterns Group 5 Final project attack that
 *         is fire based
 *
 */
public class Ember extends Attack {
	Environment e = Environment.getEnvironment();

	/**
	 * @param fire
	 * @param damage
	 */
	public Ember(int damage) {
		super(damage);
	}

	/**
	 * get the damage modifier from Ember and applies the Burn
	 */

	@Override
	public int getDamage() {
		if (e.getTc().getCurrentTurn() instanceof PlayerTurn) {
			if (e.getComputer().getSelectedPokemon().getStatus() == null) {
				try {
					// Burn burn = new Burn(e.getCurrentComputerPokemon());
					e.getCurrentComputerPokemon().burnTarget();
				} catch (StatusEffectException e1) {
					e1.printStackTrace();
				}
			}
			// apply statis affect to computer
		} else {
			if (e.getPlayer().getSelectedPokemon().getStatus() == null) {
				try {
					// Burn burn = new Burn(e.getCurrentPlayerPokemon());
					e.getCurrentPlayerPokemon().burnTarget();
				} catch (StatusEffectException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			// apply statis affect to player
		}
		return (int) (damage * 0.4);
	}

}
