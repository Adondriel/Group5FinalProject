package attacks;
/**
 * Calculates the damage for a WaterType Pokemon.
 * @author Jason LoBianco
 */
public class WaterType implements TypeBehavior
{

	/**
	 * @see TypeBehavior#calcDamage(int, TypeBehavior)
	 */
	@Override
	public int calcDamage(int damage, TypeBehavior typeBehavior) 
	{
		if (typeBehavior instanceof WaterType) 
		{
			return damage;
		}
		else if (typeBehavior instanceof GrassType)
		{
			return (int) Math.floor(damage/2);
		}
		else if (typeBehavior instanceof FireType)
		{
			return (int) Math.floor(damage*2);
		}
		return 0;
	}
}