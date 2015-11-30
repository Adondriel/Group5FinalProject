package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Squirtle extends Pokemon
{
	public Squirtle(){
		super.damage=48;
		super.maxHealth=440;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new WaterType();
		super.name="Squirtle";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
