package pokemon;
import attacks.*;
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
		super.burn=false;
		super.freeze=false;
		super.poison=false;
		moves.add(ember);
		moves.add(fireFang);
		moves.add(inferno);
		moves.add(heatWave);
	}
}
