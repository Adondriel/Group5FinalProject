package statusEffects;
/**
 * 
 * Author: Jason LoBianco
 */
import java.util.ArrayList;

import pokemon.Pokemon;

public abstract class StatusEffect extends Pokemon 
{
	protected Pokemon pokemon;
	protected ArrayList<Pokemon> burnedPokemon = new ArrayList<Pokemon>();
	protected ArrayList<Pokemon> poisonedPokemon = new ArrayList<Pokemon>();
	
	public StatusEffect(Pokemon pokemon) 
	{
		this.pokemon = pokemon;
	}
	
	public void addBurnList(Pokemon p){
		burnedPokemon.add(p);
	}
	
	public void addPoisonList(Pokemon p){
		poisonedPokemon.add(p);
	}
	
	public void removeBurnList(Pokemon p){
		burnedPokemon.remove(p);
	}
	
	public void removePoisonList(Pokemon p){
		poisonedPokemon.remove(p);
	}
	
	public abstract void statusTick();
	
	/**
	 * @return Pokemon's current health
	 */
	public int getCurrentHealth(){
		return pokemon.getCurrentHealth();
	}
	
	/**
	 * Sets the Pokemon's chanceToAttack for testing purposes since the value is found randomly.
	 * @param i 0 or 1; 0 to allow the Pokemon to attack, and 1 to make the Pokemon not be able to attack
	 */
	public void setChanceToAttack(int i) {
		pokemon.chanceToAttack = i;
	}
}