package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Vulpix extends Pokemon
{
	/**
	 * constructor
	 */
	public Vulpix(){
		super.damage=41;
		super.maxHealth=380;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new FireType();
		super.name="Vulpix";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
