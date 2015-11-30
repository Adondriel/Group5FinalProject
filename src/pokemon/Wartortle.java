package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Wartortle extends Pokemon
{
	/**
	 * constructor
	 */
	public Wartortle(){
		super.damage=63;
		super.maxHealth=590;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new WaterType();
		super.name="Wartortle";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
