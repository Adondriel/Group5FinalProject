package attacks;
/**
 * Calculates the damage for a FireType Pokemon.
 * @author Jason LoBianco
 */
public class FireType implements TypeBehavior
{

	@Override
	public int calcDamage(int damage, TypeBehavior typeBehavior) 
	{
		if (typeBehavior instanceof FireType) 
		{
			return damage;
		}
		else if (typeBehavior instanceof WaterType)
		{
			return (int) Math.floor(damage/2);
		}
		else if (typeBehavior instanceof GrassType)
		{
			return (int) Math.floor(damage*2);
		}
		return 0;
	}
}