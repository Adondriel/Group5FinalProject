package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Venusaur extends Pokemon
{
	int damage=82;
	int maxHealth=80;
	int currentHealth=maxHealth;
	int experience=0;
	TypeBehavior type=new GrassType();
	String name="Venusaur";
	boolean burn=false;
	boolean freeze=false;
	boolean poisonfalse;
}
