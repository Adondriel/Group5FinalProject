package pokemon;

import attacks.*;

/**
 * @author Benjamin Uleau
 *
 */
public class Bulbasaur extends Pokemon
{
	int damage=49;
	int maxHealth=45;
	int currentHealth=maxHealth;
	int experience=0;
	TypeBehavior type=new GrassType();
	String name="Bulbasaur";
	boolean burn=false;
	boolean freeze=false;
	boolean poison=false;
}
