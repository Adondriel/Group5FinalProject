package statusEffects;

import pokemon.Pokemon;

public class Frozen extends StatusEffect
{
	private double damage;

	public Frozen(Pokemon p) 
	{
		super(p);
	}
	
	public void statusTick()
	{
		damage = 0;
		//return pokemon.getCurrentHealth();
	}
}