package pokemon;
import java.util.ArrayList;

import attacks.*;
import attacks.WaterAttackAbilities.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Blastoise extends Pokemon
{
	Attack bubble=new Bubble(getDamage());
	Attack waterPulse=new WaterPulse(getDamage());
	Attack hydroPump=new HydroPump(getDamage());
	Attack withdraw=new Withdraw(getDamage());
	
	/**
	 * constructor
	 */
	public Blastoise(){
		super.setDamage(83);
		super.setMaxHealth(790);
		super.setCurrentHealth(super.getMaxHealth());
		super.setExperience(0);
		super.setType(new WaterType());
		super.setName("Blastoise");
		
		ArrayList<Attack> myMoves=new ArrayList<Attack>();
		myMoves=super.getMoves();
		myMoves.add(bubble);
		myMoves.add(waterPulse);
		myMoves.add(hydroPump);
		myMoves.add(withdraw);
		super.setMoves(myMoves);
	}
}
