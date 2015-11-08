package statusEffects;

import pokemon.Pokemon;

public abstract class StatusEffect 
{
	protected Pokemon p;
	
	public StatusEffect(Pokemon p) 
	{
		this.p = p;
	}
}