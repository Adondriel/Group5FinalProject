package heldItems;

import attacks.TypeBehavior;
import pokemon.Pokemon;

/**
 * @author Benjamin Uleau
 *
 */
public interface Pkmn
{
	/**
	 * @param target
	 * @return Whether or not the pokemon attacked its target
	 */
	public boolean attack(Pokemon target);
	/**
	 * Tick the statuses on the pokemon
	 */
	public void statusTick();
	/**
	 * @return The pokemon's damage
	 */
	public int getDamage();
	/**
	 * @return the pokemon's max health
	 */
	public int getMaxHealth();
	/**
	 * @return the pokemon's current health
	 */
	public int getCurrentHealth();
	/**
	 * @return the pokemon's experience points
	 */
	public int getExperience();
	/**
	 * @return the pokemon's type
	 */
	public TypeBehavior getType();
	/**
	 * @param damageTaken
	 * A pokemon will take a certain amount of damage
	 */
	public void takeHit(int damageTaken);
	/**
	 * @return the item the pokemon is currently holding
	 */
	public HeldItem getHeldItem();
}
