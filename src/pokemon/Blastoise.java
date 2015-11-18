package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Blastoise extends Pokemon
{
	int damage=83;
	int maxHealth=79;
	int currentHealth=maxHealth;
	int experience=0;
	TypeBehavior type=new WaterType();
	String name="Blastoise";
	boolean burn=false;
	boolean freeze=false;
	boolean poison=false;
	
	public int getCurrentHealth(){
		return currentHealth;
	}
	
	public int getMaxHealth(){
		return maxHealth;
	}

	public boolean getPoison() {
		return poison;
	}

	@Override
	public int statusTick() {
		return currentHealth;
	}
}