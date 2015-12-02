package pokemon;
import attacks.*;
import attacks.FireAttackAbilities.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Charizard extends Pokemon
{
	Attack ember = new Ember(damage);
	Attack heatWave = new HeatWave(damage);
	Attack fireFang = new FireFang(damage);
	Attack inferno = new Inferno(damage);
	
	/**
	 * constructor
	 */
	public Charizard(){
		super.damage=84;
		super.maxHealth=780;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new FireType();
		super.name="Charizard";
		moves.add(ember);
		moves.add(heatWave);
		moves.add(fireFang);
		moves.add(inferno);
	}
}
