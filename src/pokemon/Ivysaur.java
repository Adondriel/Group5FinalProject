package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Ivysaur extends Pokemon
{
	Attack vineWhip=new VineWhip();
	Attack razorLeaf=new RazorLeaf();
	Attack solarBeam=new SolarBeam();
	/**
	 * constructor
	 */
	public Ivysaur(){
		super.damage=62;
		super.maxHealth=600;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new GrassType();
		super.name="Ivysaur";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
		moves.add(vineWhip);
		moves.add(razorLeaf);
		moves.add(solarBeam);
	}
}
