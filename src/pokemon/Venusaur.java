package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Venusaur extends Pokemon
{
	Attack vineWhip=new VineWhip();
	Attack solarBeam=new SolarBeam();
	Attack petalBlizzard=new PetalBlizzard();
	
	/**
	 * constructor
	 */
	public Venusaur(){
		super.damage=82;
		super.maxHealth=800;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new GrassType();
		super.name="Venusaur";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
		moves.add(vineWhip);
		moves.add(solarBeam);
		moves.add(petalBlizzard);
	}
}
