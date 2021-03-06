package pokemon;
import attacks.*;
import attacks.FireAttackAbilities.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Charmander extends Pokemon
{
	Attack ember = new Ember(damage);
	Attack fireFang = new FireFang(damage);
	Attack inferno = new Inferno(damage);
	Attack heatWave = new HeatWave(damage);
	
	/**
	 * constructor
	 */
	public Charmander(){
		super.damage=52;
		super.maxHealth=390;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new FireType();
		super.name="Charmander";
		moves.add(ember);
		moves.add(fireFang);
		moves.add(inferno);
		moves.add(heatWave);
	}
}
