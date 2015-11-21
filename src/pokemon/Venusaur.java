package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Venusaur extends Pokemon
{
	/**
	 * constructor
	 */
	public Venusaur(){
		super.damage=82;
		super.maxHealth=80;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new GrassType();
		super.name="Venusaur";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
