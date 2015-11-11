package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Charizard extends Pokemon
{
	int damage=84;
	int maxHealth=78;
	int currentHealth=maxHealth;
	int experience=0;
	TypeBehavior type=new FireType();
	String name="Charizard";
	boolean burn=false;
	boolean freeze=false;
	boolean poisonfalse;
}
