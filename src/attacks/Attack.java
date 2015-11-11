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
	public Attack(TypeBehavior type, int damage)
	{
		this.damage = damage;
		this.type = type;
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
	public int getDamage()
	{
		return damage;
	}
}
