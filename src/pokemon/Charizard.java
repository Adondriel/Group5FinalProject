package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Charizard extends Pokemon
{
	/**
	 * constructor
	 */
	public Charizard(){
		super.damage=84;
		super.maxHealth=78;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new FireType();
		super.name="Charizard";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
