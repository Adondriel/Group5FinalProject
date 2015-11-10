package pokemon;

/**
 * @author Benjamin Uleau
 *
 */
public abstract class Pokemon 
{
	int damage;
	int maxHealth;
	int currentHealth;
	int experience;
	String name;
	boolean burn;
	boolean freeze;
	boolean poison;
	
	/**
	 * @param target
	 * @return whether or not the pokemon attacked
	 */
	public boolean attack(Pokemon target){
		return false;
	}
	
	/**
	 * Tick status effects
	 */
	public void statusTick(){
		
	}
}