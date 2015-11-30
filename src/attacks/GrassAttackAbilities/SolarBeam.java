package attacks.GrassAttackAbilities;

import attacks.Attack;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is grass based
 *
 */
public class SolarBeam extends Attack
{

	/**
	 * @param grass type
	 * @param damage amount
	 */
	public SolarBeam(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		return (int)(damage * 1.2);
	}

}
