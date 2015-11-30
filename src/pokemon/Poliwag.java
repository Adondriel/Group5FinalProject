package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Poliwag extends Pokemon
{
	Attack waterPulse=new WaterPulse();
	Attack hydroPump=new HydroPump();
	Attack bubbleBeam=new BubbleBeam();
	
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
	}
}
