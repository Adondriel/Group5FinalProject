package attacks;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is fire based
 *
 */
public class Will_O_Wisp extends Attack
{

	/**
	 * @param fire
	 * @param damage
	 */
	public Will_O_Wisp(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		return (int)(damage * 0.1);
	}

}
