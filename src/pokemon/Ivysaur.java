package pokemon;
import attacks.*;
import attacks.GrassAttackAbilities.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Ivysaur extends Pokemon
{
	Attack vineWhip=new VineWhip(damage);
	Attack razorLeaf=new RazorLeaf(damage);
	Attack solarBeam=new SolarBeam(damage);
	Attack leechSeed=new LeechSeed(damage);
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
		moves.add(leechSeed);
	}
}
