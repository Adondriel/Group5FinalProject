package heldItems;

import attacks.*;
import pokemon.Pokemon;

/**
 * @author Benjamin Uleau
 *
 */
public class WaterGem extends HeldItem
{
	TypeBehavior t=new WaterType();
	/**
	 * @param p
	 */
	public WaterGem(Pokemon p){
		super(p);
	}

	@Override
	public int calculateAmplifiedDamage()
	{
		if(this.t.equals(p.getType())){
			return (int)(p.getDamage()*1.3);
		}
		return 0;
	}

	@Override
	public int calculateAmplifiedExperience()
	{
		return p.getExperience();
	}

}
