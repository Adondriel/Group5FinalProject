package pokemon;
import attacks.*;
import attacks.WaterAttackAbilities.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Wartortle extends Pokemon
{
	Attack waterGun=new WaterGun(damage);
	Attack bubble=new Bubble(damage);
	Attack waterPulse=new WaterPulse(damage);
	Attack withdraw=new Withdraw(damage);
	
	/**
	 * constructor
	 */
	public Wartortle(){
		super.damage=63;
		super.maxHealth=590;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new WaterType();
		super.name="Wartortle";
		moves.add(waterGun);
		moves.add(bubble);
		moves.add(waterPulse);
		moves.add(withdraw);
	}
}
