package pokemon;
import attacks.*;
/**
 * @author Benjamin Uleau
 *
 */
public class Ivysaur extends Pokemon
{
	int damage=62;
	int maxHealth=60;
	int currentHealth=maxHealth;
	int experience=0;
	TypeBehavior type=new GrassType();
	String name="Ivysaur";
	boolean burn=false;
	boolean freeze=false;
	boolean poisonfalse;
}
