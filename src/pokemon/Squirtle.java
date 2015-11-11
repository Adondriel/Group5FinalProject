package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Squirtle extends Pokemon
{
	int damage=48;
	int maxHealth=44;
	int currentHealth=maxHealth;
	int experience=0;
	TypeBehavior type=new WaterType();
	String name="Squirtle";
	boolean burn=false;
	boolean freeze=false;
	boolean poisonfalse;
}
