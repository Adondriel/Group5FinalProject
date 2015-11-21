package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Poliwag extends Pokemon
{
	/**
	 * constructor
	 */
	public Poliwag(){
		super.damage=50;
		super.maxHealth=40;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new WaterType();
		super.name="Poliwag";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
