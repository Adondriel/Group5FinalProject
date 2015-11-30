package attacks;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is fire based
 *
 */
public class Inferno extends Attack
{

	/**
	 * @param fire
	 * @param damage
	 */
	public Inferno(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		return (int)(damage * 1);
	}

}
