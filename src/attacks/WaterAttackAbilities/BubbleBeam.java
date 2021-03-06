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
public class BubbleBeam extends Attack
{
	/**
	 * @param water
	 * @param damage
	 */
	public BubbleBeam(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		return (int)(damage*0.65);
	}


}
