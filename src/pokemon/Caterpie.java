package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Caterpie extends Pokemon
{
	int damage=30;
	int maxHealth=45;
	int currentHealth=maxHealth;
	int experience=0;
	TypeBehavior type=new GrassType();
	String name="Caterpie";
	boolean burn=false;
	boolean freeze=false;
	boolean poisonfalse;
}
