package attacks;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is fire based
 *
 */
public class HeatWave extends Attack
{

	/**
	 * @param fire
	 * @param damage
	 */
	public HeatWave(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		return (int)(damage * 0.95);
	}

}
