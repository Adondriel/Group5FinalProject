package attacks.GrassAttackAbilities;

import attacks.Attack;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is grass based
 *
 */
public class VineWhip extends Attack
{

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
		return (int)(damage * 0.45);
	}

}
