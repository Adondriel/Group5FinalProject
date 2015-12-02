package pokemon;

import attacks.*;
import attacks.GrassType;
import attacks.GrassAttackAbilities.*;
/**
* @author Bradley Solorzano
* group 5 final project
*
*/
public class MockGrassPokeman extends Pokemon
{
	Attack leechSeed=new LeechSeed(damage);
	Attack vineWhip=new VineWhip(damage);
	Attack razorLeaf=new RazorLeaf(damage);
	Attack tackle=new Tackle(damage);
	Attack bugbite=new BugBite(damage);
	Attack petalblizzard = new PetalBlizzard(damage);
	Attack solarBeam = new SolarBeam(damage);
	Attack stringshot = new StringShot(damage);
	
	
	/**
	 * constructor
	 */
	public MockGrassPokeman()
	{
		super.damage=49;
		super.maxHealth=450;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new GrassType();
		super.name="GRASS";
		moves.add(leechSeed);
		moves.add(vineWhip);
		moves.add(razorLeaf);
		moves.add(tackle);
		moves.add(bugbite);
		moves.add(petalblizzard);
		moves.add(solarBeam);
		moves.add(stringshot);
	}
}
