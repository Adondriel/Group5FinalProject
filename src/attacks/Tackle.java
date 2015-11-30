package attacks;

/**
 * @author Bradley Solorzano
 * Design Patterns 
 * Group 5 Final project
 * attack that is grass based
 *
 */
public class Tackle extends Attack
{

	/**
	 * @param grass type
	 * @param damage amount
	 */
	public Tackle(int damage)
	{
		super(damage);
	}
	
	@Override
	public int getDamage()
	{
		return (int)(damage * 0.1);
	}

}
