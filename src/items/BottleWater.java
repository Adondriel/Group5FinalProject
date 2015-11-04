package items;

public class BottleWater implements ItemBehavior
{
	private int recoveryStep;
	
	public BottleWater()
	{
		recoveryStep = 10;
	}

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
			currentLife+= recoveryStep;
			return currentLife;
		}
	}
}