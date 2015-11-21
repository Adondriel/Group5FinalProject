package statusEffects;

import pokemon.Pokemon;

public class Poison extends StatusEffect
{
	private double damage;
	private int currentHealth;

	public Poison(Pokemon p) 
	{
		super(p);
		//p.poison = true;
	}
	
	public int statusTick()
	{
		//damage = Math.ceil(pokemon.getMaxHealth()*.1);
		//currentHealth = (int) (pokemon.getCurrentHealth()-damage);
		return (int) (currentHealth - Math.ceil(pokemon.getMaxHealth()*.1));
	}
}