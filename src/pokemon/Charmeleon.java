package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Charmeleon extends Pokemon
{
	/**
	 * constructor
	 */
	public Charmeleon(){
		super.damage=64;
		super.maxHealth=580;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new FireType();
		super.name="Charmeleon";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
