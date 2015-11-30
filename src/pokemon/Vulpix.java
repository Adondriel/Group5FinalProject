package pokemon;
import attacks.*;
import attacks.FireAttackAbilities.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Vulpix extends Pokemon
{
	Attack ember = new Ember(damage);
	Attack fireSpin = new FireSpin(damage);
	Attack willOWisp = new Will_O_Wisp(damage);
	Attack inferno = new Inferno(damage);
	/**
	 * constructor
	 */
	public Vulpix(){
		super.damage=41;
		super.maxHealth=380;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new FireType();
		super.name="Vulpix";
		super.burn=false;
		super.freeze=false;
		super.poison=false;
		moves.add(ember);
		moves.add(fireSpin);
		moves.add(willOWisp);
		moves.add(inferno);
	}
}
