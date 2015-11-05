package items;
/**
 * A bottle of fresh water.  It restores the HP of one Pokemon by just 10 points.
 * @author Jason LoBianco
 */
public class BottleWater implements ItemBehavior
{
	private int recoveryStep;
	/**
	 * Creates a BottleWater that will restore 10 life points.
	 */
	public BottleWater()
	{
		recoveryStep = 10;
	}

	/**
	 * Calculates the recovery from a BottleWater.
	 */
	@Override
	public int UseItem(int currentLife, int maxLife) 
	{
		if (currentLife + recoveryStep > maxLife)
		{
			return maxLife;
		}
		else if (currentLife == 0)
		{
			return currentLife;
		}
		else
		{
			currentLife = currentLife + recoveryStep;
			return currentLife;
		}
	}
}