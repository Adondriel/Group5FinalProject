package statusEffects;

import pokemon.Pokemon;

public class Burn extends StatusEffect
{
	private double damage;
	
	public Burn(Pokemon p)
	{
		super(p);
	}
	
	public double statusTick()
	{
		damage = p.getMaxHealth()*.1;
		return damage;
	}
}