package attacks.GrassAttackAbilities;

import attacks.Attack;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is grass based
 *
 */
public class RazorLeaf extends Attack
{

	/**
	 * @param grass type
	 * @param damage amount
	 */
	public RazorLeaf(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		return (int)(damage * 0.55);
	}

}
