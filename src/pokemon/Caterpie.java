package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Caterpie extends Pokemon
{
	Attack stringShot=new StringShot();
	Attack tackle=new Tackle();
	Attack bugBite=new BugBite();
	
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
		super.burn=false;
		super.freeze=false;
		super.poison=false;
	}
}
