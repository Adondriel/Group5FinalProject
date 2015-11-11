package attacks;
/**
 * Interface that calculates the damage to inflict on a Pokemon.
 * Author: Jason LoBianco
 */
import pokemon.Pokemon;

public interface TypeBehavior 
{
	public int calcDamage(Attack type, Pokemon p);
}