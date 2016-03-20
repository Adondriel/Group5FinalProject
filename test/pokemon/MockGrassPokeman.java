package pokemon;

import java.util.ArrayList;

import attacks.*;
import attacks.GrassAttackAbilities.*;
/**
* @author Bradley Solorzano
* group 5 final project
*
*/
public class MockGrassPokeman extends Pokemon
{
	Attack leechSeed=new LeechSeed(getDamage());
	Attack vineWhip=new VineWhip(getDamage());
	Attack razorLeaf=new RazorLeaf(getDamage());
	Attack tackle=new Tackle(getDamage());
	Attack bugbite=new BugBite(getDamage());
	Attack petalBlizzard = new PetalBlizzard(getDamage());
	Attack solarBeam = new SolarBeam(getDamage());
	Attack stringShot = new StringShot(getDamage());
	
	
	/**
	 * constructor
	 */
	public MockGrassPokeman()
	{
		super.setDamage(49);
		super.setMaxHealth(450);
		super.setCurrentHealth(getMaxHealth());
		super.setExperience(0);
		super.setType(new GrassType());
		super.setName("GRASS");
		
		ArrayList<Attack> myMoves=new ArrayList<Attack>();
		myMoves=super.getMoves();
		myMoves.add(leechSeed);
		myMoves.add(vineWhip);
		myMoves.add(razorLeaf);
		myMoves.add(tackle);
		myMoves.add(bugbite);
		myMoves.add(petalBlizzard);
		myMoves.add(solarBeam);
		myMoves.add(stringShot);
		super.setMoves(myMoves);
	}
}
