package pokemon;

import attacks.*;
import attacks.WaterType;
import attacks.WaterAttackAbilities.*;
/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
public class MockWaterPokeman extends Pokemon
{
	Attack bubble = new Bubble(damage);
	Attack bubbleBeam = new BubbleBeam(damage);
	Attack hydropump = new HydroPump(damage);
	Attack watergun = new WaterGun(damage);
	Attack waterpulse = new WaterPulse(damage);
	Attack withdraw = new Withdraw(damage);
	
	public MockWaterPokeman()
	{
		super.damage=50;
		super.maxHealth=400;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new WaterType();
		super.name="WATER";
		moves.add(bubble);
		moves.add(bubbleBeam);
		moves.add(hydropump);
		moves.add(watergun);
		moves.add(waterpulse);
		moves.add(withdraw);
	}
}
