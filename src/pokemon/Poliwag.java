package pokemon;
import attacks.*;
import attacks.WaterAttackAbilities.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Poliwag extends Pokemon
{
	Attack waterPulse=new WaterPulse(damage);
	Attack hydroPump=new HydroPump(damage);
	Attack bubbleBeam=new BubbleBeam(damage);
	Attack withdraw=new Withdraw(damage);
	
	/**
	 * constructor
	 */
	public Poliwag(){
		super.damage=50;
		super.maxHealth=400;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new WaterType();
		super.name="Poliwag";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
		moves.add(waterPulse);
		moves.add(hydroPump);
		moves.add(bubbleBeam);
		moves.add(withdraw);
	}
}
