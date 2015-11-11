package statusEffects;

import pokemon.Pokemon;

public class Poison extends StatusEffect
{
	private double damage;

	public Poison(Pokemon p) 
	{
		super(p);
	}
	
	public double statusTick()
	{
		damage = p.getMaxHealth()*.1;
		return damage;
	}
}