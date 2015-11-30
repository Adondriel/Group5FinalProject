package attacks.WaterAttackAbilities;

import attacks.Attack;
import pokemon.Pokemon;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is water based
 *
 */
public class HydroPump extends Attack
{
	/**
	 * @param water
	 * @param damage
	 */
	public HydroPump(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		return (int)(damage * 1.10);
	}


}
