package pokemon;
import attacks.*;
import attacks.WaterAttackAbilities.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Squirtle extends Pokemon
{
	Attack waterGun=new WaterGun(damage);
	Attack withdraw=new Withdraw(damage);
	Attack bubble=new Bubble(damage);
	Attack waterPulse=new WaterPulse(damage);
	
	/**
	 * constructor
	 */
	public Squirtle(){
		super.damage=48;
		super.maxHealth=440;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new WaterType();
		super.name="Squirtle";
		moves.add(waterGun);
		moves.add(withdraw);
		moves.add(bubble);
		moves.add(waterPulse);
	}
}
