package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Poliwag extends Pokemon
{
	int damage=50;
	int maxHealth=40;
	int currentHealth=maxHealth;
	int experience=0;
	TypeBehavior type=new WaterType();
	String name="Poliwag";
	boolean burn=false;
	boolean freeze=false;
	boolean poisonfalse;
}
