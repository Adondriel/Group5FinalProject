package pokemon;

import attacks.*;
import attacks.FireType;
import attacks.FireAttackAbilities.*;

/**
* @author Bradley Solorzano
* group 5 final project
*
*/
public class MockFirePokeman extends Pokemon
{
	Attack ember = new Ember(damage);
	Attack firefang = new FireFang(damage);
	Attack firespin = new FireSpin(damage);
	Attack heatWave = new HeatWave(damage);
	Attack inferno = new Inferno(damage);
	Attack will_O_wisp = new Will_O_Wisp(damage);
	/**
	 * constructor
	 */
	public MockFirePokeman()
	{
		super.damage=84;
		super.maxHealth=780;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.type=new FireType();
		super.name="FIRE";
		moves.add(ember);
		moves.add(heatWave);
		moves.add(firefang);
		moves.add(inferno);
		moves.add(will_O_wisp);
		moves.add(firespin);
	}
}
