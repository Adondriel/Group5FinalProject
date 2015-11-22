package statusEffects;
import java.util.ArrayList;

import pokemon.Pokemon;

public class burnV2 extends StatusEffect
{	
	public burnV2(Pokemon p)
	{
		super(p);
	}
	
	public void statusTick()
	{
		for(Pokemon q: burnedPokemon){
			q.takeHit(10);
		}
	}
}
