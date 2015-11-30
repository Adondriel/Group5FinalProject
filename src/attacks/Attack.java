package attacks;

import pokemon.Pokemon;

/**
 * 
 * @author Bradley Solorzano
 * Design Patterns 11/10/15
 * abstract class that will calculate damage
 * based on the elemnt type the pokemon is
 *
 */

public abstract class Attack
{
	protected int damage;
	protected TypeBehavior type;
	
	
	/**
	 * @param type
	 * @param damage
	 */
	public Attack(int damage)
	{
		this.damage = damage;
	}

	/**
	 * @return type of the attack
	 */
	public TypeBehavior getAttackType()
	{
		
		return type;
	}

	/**
	 * @return damage of the attack
	 */
	public abstract int getDamage();
}
