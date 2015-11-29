package heldItems;

import pokemon.Pokemon;

/**
 * @author Benjamin Uleau
 *
 */
public abstract class HeldItem implements Pkmn
{
	Pokemon p;
	
	/**
	 * @param p
	 */
	public HeldItem(Pokemon p){
		this.p=p;
	}
	
	public abstract int calculateAmplifiedDamage();
	public abstract int calculateAmplifiedExperience();
}
