package heldItems;

import pokemon.Pokemon;
import attacks.TypeBehavior;

/**
 * @author Benjamin Uleau
 *
 */
public class HeldItem implements Pkmn
{

	@Override
	public boolean attack(Pokemon target)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void statusTick()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDamage()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxHealth()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCurrentHealth()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getExperience()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TypeBehavior getType()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void takeHit(int damageTaken)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public HeldItem getHeldItem()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
