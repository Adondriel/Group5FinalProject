package statusEffects;
import exceptions.StatusEffectException;
/**
 * 
 * Author: Jason LoBianco
 */
import pokemon.Pokemon;

public class Frozen extends StatusEffect
{

	private int count;
	
	/**
	 * Frozen is a negative status effect that will cause Pokemon to miss attacks
	 * 80% of the time and hit 20% of the time.
	 * @param p The Pokemon that will be frozen.
	 * @throws StatusEffectException
	 */
	public Frozen(Pokemon p) throws StatusEffectException 
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
		double temp = Math.random();
		if (count != 3) {
			if (temp<0.20) {
				pokemon.chanceToAttack = 1;
				count++;
			}
			else {
				pokemon.chanceToAttack = 0;
				count++;
			}
		}
		else {
			pokemon.chanceToAttack = 1;
		}
		return 0;
	}
}