package heldItems;

import pokemon.Pokemon;

/**
 * @author Benjamin Uleau
 *
 */
public class MachoBrace extends HeldItem
{

	/**
	 * @param p
	 */
	public MachoBrace(Pokemon p){
		super(p);
	}

	@Override
	public int calculateAmplifiedDamage()
	{
		return p.getDamage();
	}

	@Override
	public int calculateAmplifiedExperience()
	{
		return (int) (p.getExperience()*1.3);
	}

}
