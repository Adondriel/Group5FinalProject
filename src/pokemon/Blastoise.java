package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Blastoise extends Pokemon
{
	Attack bubble=new Bubble();
	Attack waterPulse=new WaterPulse();
	Attack hydroPump=new HydroPump();
	
	/**
	 * constructor
	 */
	public Blastoise(){
		super.damage=83;
		super.maxHealth=790;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new WaterType();
		super.name="Blastoise";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
		moves.add(bubble);
		moves.add(waterPulse);
		moves.add(hydroPump);
	}
}
