package statusEffects;
import exceptions.StatusEffectException;
/**
 * 
 * Author: Jason LoBianco
 */
import pokemon.Pokemon;

/**
 * @author Jason LoBianco
 *
 */
public class Poison extends StatusEffect
{
	
	private int count = 0;
	
	/**
	 * Poison is a negative status effect that will cause static damage every round
	 * to a Pokemon until the effect wears off.
	 * @param p The Pokemon that will be poisoned.
	 * @throws StatusEffectException
	 */
	public Poison(Pokemon p) throws StatusEffectException 
	{
		super(p);
		
		if (pokemon.getNumStatusEffects() == 1) 
		{
			throw new StatusEffectException("Only 1 status effect can be applied at a time.");
		}
		
	}
	
	/**
	 * @see pokemon.Pokemon#statusTick()
	 */
	public int statusTick()
	{
		if (count != 3){
			int damage = 25;
			count++;
			return damage; 
		}
		return 0;
	}
}