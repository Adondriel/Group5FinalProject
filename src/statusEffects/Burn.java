package statusEffects;

import pokemon.Pokemon;

public class Burn extends StatusEffect
{
	private double damage;
	
	public Burn(Pokemon p)
	{
		super(p);
	}
	
	public void statusTick()
	{
		damage = pokemon.getMaxHealth()*.1;
		//return pokemon.getCurrentHealth();
	}
}