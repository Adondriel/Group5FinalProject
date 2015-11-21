package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Blastoise extends Pokemon
{
	public Blastoise(){
		super.damage=83;
		super.maxHealth=79;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new WaterType();
		super.name="Blastoise";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
