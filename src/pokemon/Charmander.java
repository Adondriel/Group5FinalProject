package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Charmander extends Pokemon
{
	/**
	 * constructor
	 */
	public Charmander(){
		super.damage=52;
		super.maxHealth=39;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new FireType();
		super.name="Charmander";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
