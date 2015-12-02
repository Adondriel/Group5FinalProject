package pokemon;
import attacks.*;
import attacks.GrassAttackAbilities.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Caterpie extends Pokemon
{
	Attack stringShot=new StringShot(damage);
	Attack tackle=new Tackle(damage);
	Attack bugBite=new BugBite(damage);
	Attack leechSeed=new LeechSeed(damage);
	/**
	 * constructor
	 */
	public Caterpie(){
		super.damage=30;
		super.maxHealth=450;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new GrassType();
		super.name="Caterpie";
		moves.add(stringShot);
		moves.add(tackle);
		moves.add(bugBite);
		moves.add(leechSeed);
	}
}
