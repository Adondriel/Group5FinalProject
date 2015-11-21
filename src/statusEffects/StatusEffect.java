package statusEffects;

import pokemon.Pokemon;

public abstract class StatusEffect extends Pokemon 
{
	protected Pokemon pokemon;
	private double damage;
	
	public StatusEffect(Pokemon pokemon) 
	{
		this.pokemon = pokemon;
	}
	
	public void statusTick() {
		
	}
	
	/**
	 * @return Pokemon's current health
	 */
	public int getCurrentHealth(){
		return pokemon.currentHealth;
	}
	
	public int getMaxHealth(){
		return pokemon.maxHealth;
	}
	
	public boolean getPoison(){
		return pokemon.poison;
	}
}