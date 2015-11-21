package pokemon;

import attacks.*;

/**
 * @author Benjamin Uleau
 *
 */
public class Bulbasaur extends Pokemon
{
	/**
	 * constructor
	 */
	public Bulbasaur(){
		super.damage=49;
		super.maxHealth=45;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new GrassType();
		super.name="Bulbasaur";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
