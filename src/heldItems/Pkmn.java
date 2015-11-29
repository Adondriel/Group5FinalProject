package heldItems;

/**
 * @author Benjamin Uleau
 *
 */
public interface Pkmn
{
	/**
	 * @return The new damage
	 */
	public abstract int calculateAmplifiedDamage();
	/**
	 * @return the new experience
	 */
	public abstract int calculateAmplifiedExperience();
}
