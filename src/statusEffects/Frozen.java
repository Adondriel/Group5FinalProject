package statusEffects;
/**
 * 
 * Author: Jason LoBianco
 */
import pokemon.Pokemon;

public class Frozen extends StatusEffect
{

	private int count;
	
	public Frozen(Pokemon p) 
	{
		super(p);
	}
	
	public void statusTick()
	{
		if (count != 3){
			double temp = Math.random();
			if (temp<=0.2) {
				pokemon.chanceToAttack = 0;
			}
			else {
				pokemon.chanceToAttack = 1;
			}
			count++;
		}
		else{
			pokemon.chanceToAttack = 0;
		}
	}
}