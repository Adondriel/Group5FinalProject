package pokemon;

import java.util.ArrayList;

import attacks.*;
import attacks.WaterAttackAbilities.*;
/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
public class MockWaterPokeman extends Pokemon
{
	Attack bubble = new Bubble(getDamage());
	Attack bubbleBeam = new BubbleBeam(getDamage());
	Attack hydroPump = new HydroPump(getDamage());
	Attack waterGun = new WaterGun(getDamage());
	Attack waterPulse = new WaterPulse(getDamage());
	Attack withdraw = new Withdraw(getDamage());
	
	/**
	 * constructor
	 */
	public MockWaterPokeman()
	{
		super.setDamage(50);
		super.setMaxHealth(400);
		super.setCurrentHealth(getMaxHealth());
		super.setExperience(0);
		super.setType(new WaterType());
		super.setName("WATER");

		ArrayList<Attack> myMoves=new ArrayList<Attack>();
		myMoves=super.getMoves();
		myMoves.add(bubble);
		myMoves.add(bubbleBeam);
		myMoves.add(hydroPump);
		myMoves.add(waterGun);
		myMoves.add(waterPulse);
		myMoves.add(withdraw);
		super.setMoves(myMoves);
	}
}
