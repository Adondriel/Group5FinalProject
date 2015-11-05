package items;
/**
 * A spray-type medicine for wounds. It restores the HP of one Pokemon by just 15 points.
 * @author Jason LoBianco
 */
public class HPPotion implements ItemBehavior
{
	private int recoveryStep;
	
	/**
	 * Creates an HP Potion that will restore 15 life points.
	 */
	public HPPotion()
	{
		recoveryStep = 15;
	}

	/**
	 * Calculates the recovery from an HPPotion.
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
			currentLife+= recoveryStep;
			return currentLife;
		}
	}
}