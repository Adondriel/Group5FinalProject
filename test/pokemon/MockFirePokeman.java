package pokemon;

import java.util.ArrayList;

import attacks.*;
import attacks.FireAttackAbilities.*;

/**
* @author Bradley Solorzano
* group 5 final project
*
*/
public class MockFirePokeman extends Pokemon
{
	Attack ember = new Ember(getDamage());
	Attack fireFang = new FireFang(getDamage());
	Attack fireSpin = new FireSpin(getDamage());
	Attack heatWave = new HeatWave(getDamage());
	Attack inferno = new Inferno(getDamage());
	Attack will_O_wisp = new Will_O_Wisp(getDamage());
	/**
	 * constructor
	 */
	public MockFirePokeman()
	{
		super.setDamage(84);
		super.setMaxHealth(780);
		super.setCurrentHealth(getMaxHealth());
		super.setExperience(0);
		super.setType(new FireType());
		super.setName("FIRE");
		
		ArrayList<Attack> myMoves=new ArrayList<Attack>();
		myMoves=super.getMoves();
		myMoves.add(ember);
		myMoves.add(fireFang);
		myMoves.add(fireSpin);
		myMoves.add(heatWave);
		myMoves.add(inferno);
		myMoves.add(will_O_wisp);
		super.setMoves(myMoves);
	}
}
