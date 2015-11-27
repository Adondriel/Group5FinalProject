package attacks;
/**
 * Interface that calculates the damage to inflict on a Pokemon.
 * Author: Jason LoBianco
 */

public interface TypeBehavior 
{
	public int calcDamage(int damage, TypeBehavior typeBehavior);
}