package pokemon;
import attacks.*;
import attacks.GrassAttackAbilities.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Venusaur extends Pokemon
{
	Attack vineWhip=new VineWhip(damage);
	Attack solarBeam=new SolarBeam(damage);
	Attack petalBlizzard=new PetalBlizzard(damage);
	Attack leechSeed=new LeechSeed(damage);
	
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
		moves.add(vineWhip);
		moves.add(solarBeam);
		moves.add(petalBlizzard);
		moves.add(leechSeed);
	}
}
