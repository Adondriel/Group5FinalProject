package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Charmeleon extends Pokemon
{
	int damage=64;
	int maxHealth=58;
	int currentHealth=maxHealth;
	int experience=0;
	TypeBehavior type=new FireType();
	String name="Charmeleon";
	boolean burn=false;
	boolean freeze=false;
	boolean poisonfalse;
}
