package statusEffects;
import java.util.ArrayList;

import pokemon.Pokemon;

public class burnV2 extends StatusEffect
{
	private double damage;
	private ArrayList<Pokemon> observerList = new ArrayList<Pokemon>();
	
	public burnV2(Pokemon p)
	{
		super(p);
	}
	
	public void statusTick()
	{
		for(Pokemon q: observerList){
			q.takeHit(10);
		}
	}
}
