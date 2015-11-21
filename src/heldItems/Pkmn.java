package heldItems;

import attacks.TypeBehavior;
import pokemon.Pokemon;

/**
 * @author Benjamin Uleau
 *
 */
public interface Pkmn
{
	public boolean attack(Pokemon target);
	public void statusTick();
	public int getDamage();
	public int getMaxHealth();
	public int getCurrentHealth();
	public int getExperience();
	public TypeBehavior getType();
	public void takeHit(int damageTaken);
	public HeldItem getHeldItem();
}
