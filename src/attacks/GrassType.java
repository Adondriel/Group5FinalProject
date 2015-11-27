package attacks;
/**
 * Calculates the damage for a GrassType Pokemon.
 * @author Jason LoBianco
 */
public class GrassType implements TypeBehavior
{

	@Override
	public int calcDamage(int damage, TypeBehavior typeBehavior) 
	{
		if (typeBehavior instanceof GrassType) 
		{
			return damage;
		}
		else if (typeBehavior instanceof FireType)
		{
			return (int) Math.floor(damage/2);
		}
		else if (typeBehavior instanceof WaterType)
		{
			return (int) Math.floor(damage*2);
		}
		return 0;
	}
}