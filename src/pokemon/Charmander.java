package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Charmander extends Pokemon
{
	int damage=52;
	int maxHealth=39;
	int currentHealth=maxHealth;
	int experience=0;
	TypeBehavior type=new FireType();
	String name="Charmander";
	boolean burn=false;
	boolean freeze=false;
	boolean poisonfalse;
}
