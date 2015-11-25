package statusEffects;
/**
 * 
 * Author: Jason LoBianco
 */

import pokemon.Pokemon;

public abstract class StatusEffect extends Pokemon 
{
	protected Pokemon pokemon;
	
	public StatusEffect(Pokemon pokemon) 
	{
		this.pokemon = pokemon;
	}
	
	/**
	 * @see pokemon.Pokemon#statusTick()
	 */
	public abstract int statusTick();
	
	/**
	 * @see pokemon.Pokemon#getCurrentHealth()
	 */
	public int getCurrentHealth(){
		return pokemon.getCurrentHealth();
	}
	
	/**
	 * Sets the Pokemon's chanceToAttack for testing purposes since the value is found randomly.
	 * @param i 0 or 1; 1 to allow the Pokemon to attack, and 0 to make the Pokemon not be able to attack.
	 */
	public void setChanceToAttack(int i) {
		pokemon.chanceToAttack = i;
	}
	
	/**
	 * @see pokemon.Pokemon#getNumStatusEffects()
	 */
	public int getNumStatusEffects() {
		return pokemon.getNumStatusEffects()+1;
	}
}