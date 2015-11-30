package attacks;

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
		return (int)(damage *0.4);
	}


}
