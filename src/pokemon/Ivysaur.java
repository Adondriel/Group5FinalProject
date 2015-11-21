package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Ivysaur extends Pokemon
{
	/**
	 * constructor
	 */
	public Ivysaur(){
		super.damage=62;
		super.maxHealth=60;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new GrassType();
		super.name="Ivysaur";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}

}
