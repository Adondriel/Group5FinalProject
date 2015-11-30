package pokemon;
import attacks.*;
import attacks.FireAttackAbilities.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Charmeleon extends Pokemon
{
	Attack ember = new Ember(damage);
	Attack heatWave = new HeatWave(damage);
	Attack fireFang = new FireFang(damage);
	Attack inferno = new Inferno(damage);
	
	/**
	 * constructor
	 */
	public Charmeleon(){
		super.damage=64;
		super.maxHealth=580;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new FireType();
		super.name="Charmeleon";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
		moves.add(ember);
		moves.add(heatWave);
		moves.add(fireFang);
		moves.add(inferno);
	}
}
