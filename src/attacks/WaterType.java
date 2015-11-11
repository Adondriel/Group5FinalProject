package attacks;

import pokemon.Pokemon;

public class WaterType implements TypeBehavior
{

	@Override
	public int calcDamage(Attack type, Pokemon p) 
	{
		return 0;
	}
}