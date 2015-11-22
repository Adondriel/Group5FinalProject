package statusEffects;
/**
 * 
 * Author: Jason LoBianco
 */
import pokemon.Pokemon;

public class Burn extends StatusEffect
{
	private int count=0;
	
	public Burn(Pokemon p)
	{
		super(p);
	}
	
	public void statusTick()
	{
		for(Pokemon q: burnedPokemon){
			if (count != 3){
				q.takeHit(10);
				count++;
			}
			else {
				//removeBurnList(q);
				count=0;
				//burnedPokemon.remove(pokemon);   //removeBurnList(q);
			}
		}
	}
}