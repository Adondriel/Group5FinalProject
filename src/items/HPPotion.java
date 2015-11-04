package items;

public class HPPotion implements ItemBehavior
{
	private int recoveryStep;
	
	public HPPotion()
	{
		recoveryStep = 15;
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