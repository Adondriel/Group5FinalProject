package pokemon;

import attacks.*;
import attacks.GrassAttackAbilities.*;

/**
 * @author Benjamin Uleau
 *
 */
public class Bulbasaur extends Pokemon
{
	Attack leechSeed=new LeechSeed(damage);
	Attack vineWhip=new VineWhip(damage);
	Attack razorLeaf=new RazorLeaf(damage);
	Attack tackle=new Tackle(damage);
	
	/**
	 * constructor
	 */
	public Bulbasaur(){
		super.damage=49;
		super.maxHealth=450;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new GrassType();
		super.name="Bulbasaur";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
		moves.add(leechSeed);
		moves.add(vineWhip);
		moves.add(razorLeaf);
		moves.add(tackle);
	}
}
