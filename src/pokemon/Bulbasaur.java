package pokemon;

import java.util.ArrayList;

import attacks.*;
import attacks.GrassAttackAbilities.*;

/**
 * @author Benjamin Uleau
 *
 */
public class Bulbasaur extends Pokemon
{
	Attack leechSeed=new LeechSeed(getDamage());
	Attack vineWhip=new VineWhip(getDamage());
	Attack razorLeaf=new RazorLeaf(getDamage());
	Attack tackle=new Tackle(getDamage());
	
	/**
	 * constructor
	 */
	public Bulbasaur(){
		super.setDamage(49);
		super.setMaxHealth(450);
		super.setCurrentHealth(getMaxHealth());
		super.setExperience(0);
		super.setType(new GrassType());
		super.setName("Bulbasaur");

		ArrayList<Attack> myMoves=new ArrayList<Attack>();
		myMoves=super.getMoves();
		myMoves.add(leechSeed);
		myMoves.add(vineWhip);
		myMoves.add(razorLeaf);
		myMoves.add(tackle);
		super.setMoves(myMoves);
	}
}
