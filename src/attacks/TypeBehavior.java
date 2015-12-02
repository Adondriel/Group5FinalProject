package attacks;
/**
 * Interface that calculates the damage to inflict on a Pokemon.
 * Author: Jason LoBianco
 */

public interface TypeBehavior 
{
	/**
	 * Calculates the type damage
	 * @param damage
	 * @param typeBehavior
	 * @return type damage
	 */
	public int calcDamage(int damage, TypeBehavior typeBehavior);
}