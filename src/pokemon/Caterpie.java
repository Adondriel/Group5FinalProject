package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Caterpie extends Pokemon
{
	/**
	 * constructor
	 */
	public Caterpie(){
		super.damage=30;
		super.maxHealth=45;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new GrassType();
		super.name="Caterpie";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
