package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Vulpix extends Pokemon
{
	int damage=41;
	int maxHealth=38;
	int currentHealth=maxHealth;
	int experience=0;
	TypeBehavior type=new FireType();
	String name="Vulpix";
	boolean burn=false;
	boolean freeze=false;
	boolean poisonfalse;
}
