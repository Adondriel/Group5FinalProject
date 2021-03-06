package attacks.FireAttackAbilities;

import attacks.Attack;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is fire based
 *
 */
public class FireFang extends Attack
{

	/**
	 * @param fire
	 * @param damage
	 */
	public FireFang(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		return (int)(damage * 0.65);
	}

}
