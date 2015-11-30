package pokemon;

import attacks.*;

/**
 * @author Benjamin Uleau
 *
 */
public class Bulbasaur extends Pokemon
{
	Attack leechSeed=new LeechSeed();
	Attack vineWhip=new VineWhip();
	Attack razorLeaf=new RazorLeaf();
	
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
	}
}
