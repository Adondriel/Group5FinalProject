package attacks.GrassAttackAbilities;

import attacks.Attack;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is grass based
 *
 */
public class LeechSeed extends Attack
{

	/**
	 * @param grass type
	 * @param damage amount
	 */
	public LeechSeed(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		return (int)(damage * 0.16);
	}

}
