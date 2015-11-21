package pokemon;

import attacks.*;


/**
 * @author Benjamin Uleau
 *
 */
public abstract class Pokemon 
{
	int damage;
	public int maxHealth;
	public int currentHealth;
	int experience;
	TypeBehavior type;
	String name;
	boolean burn;
	boolean freeze;
	public boolean poison;
	
	/**
	 * @param target
	 * @return whether or not the pokemon attacked
	 */
	public boolean attack(Pokemon target){
		if(target.getCurrentHealth()<=0){
			return false;
		}

		target.takeHit(this.damage);
		return false;
	}
	
	/**
	 * Tick status effects
	 */
	public int statusTick() {
		return currentHealth;
	}
	
	/**
	 * @return Pokemon's damage
	 */
	public int getDamage(){
		return damage;
	}
	
	/**
	 * @return Pokemon's max health
	 */
	public int getMaxHealth(){
		return maxHealth;
	}
	
	/**
	 * @return Pokemon's current health
	 */
	public int getCurrentHealth(){
		return currentHealth;
	}
	
	/**
	 * @return Pokemon's experience
	 */
	public int getExperience(){
		return experience;
	}
	
	/**
	 * @return Pokemon's name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * @return Pokemon's type
	 */
	public TypeBehavior getType(){
		return type;
	}
	
	/**
	 * @param damageTaken
	 * Damage a Pokemon
	 */
	public void takeHit(int damageTaken){
		this.currentHealth-=damageTaken;
	}
}