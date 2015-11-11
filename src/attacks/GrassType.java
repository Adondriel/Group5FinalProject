package attacks;

import pokemon.Pokemon;

public class GrassType implements TypeBehavior
{

	@Override
	public int calcDamage(Attack type, Pokemon p) 
	{
		return 0;
	}
}