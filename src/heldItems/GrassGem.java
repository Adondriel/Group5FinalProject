package heldItems;

import attacks.*;
import pokemon.Pokemon;

/**
 * @author Benjamin Uleau
 *
 */
public class GrassGem extends HeldItem
{
	TypeBehavior t=new GrassType();
	/**
	 * @param p
	 */
	public GrassGem(Pokemon p){
		super(p);
	}

	@Override
	public int calculateAmplifiedDamage()
	{
		if(p.getType() instanceof GrassType){
			return (int)(p.getDamage()*1.3);
		}
		return 0;
	}

	@Override
	public int calculateAmplifiedExperience()
	{
		return 0;
	}	
}
