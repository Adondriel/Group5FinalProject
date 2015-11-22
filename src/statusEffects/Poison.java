package statusEffects;
/**
 * 
 * Author: Jason LoBianco
 */
import pokemon.Pokemon;

public class Poison extends StatusEffect
{
	
	private int count = 0;
	
	public Poison(Pokemon p) 
	{
		super(p);
		
	}
	
	public void statusTick()
	{
		for(Pokemon q: poisonedPokemon){
			if (count != 3){
				q.takeHit(10);
				count++;
			}
			else {
				count=0;
			}
		}
	}
}