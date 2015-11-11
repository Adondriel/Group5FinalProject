package statusEffects;

import pokemon.Pokemon;

public abstract class StatusEffect  
{
	protected Pokemon p;
	private double damage;
	
	public StatusEffect(Pokemon p) 
	{
		this.p = p;
	}
	
	public double statusTick()
	{
		return damage;
	}
}