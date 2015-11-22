package pokemon;

import attacks.*;


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
	public int chanceToAttack;
	TypeBehavior type;
	String name;
	boolean burn;
	boolean freeze;
	boolean poison;
	
	/**
	 * @param target
	 * @return whether or not the pokemon attacked
	 */
	public boolean attack(Pokemon target){
		if(freezeTarget()==false){
			if(target.getCurrentHealth()<=0){
				return false;
			}		
			target.takeHit(this.damage);
			return true;
			}
		return false;
	}
	
	public void statusTick(){
		burnTick();
		poisonTick();
		freezeTick();
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
		if (this.currentHealth<=damageTaken){
			this.currentHealth=0;
		}
		else {
			this.currentHealth-=damageTaken;
		}
	}
	
	/**
	 * @return true if the target got burned, false otherwise
	 */
	public boolean burnTarget(){
		return false;
	}
	
	/**
	 * @return true if the target got poisoned, false otherwise
	 */
	public boolean poisonTarget(){
		return false;
	}
	
	/**
	 * @return true if the target gets froze, false otherwise
	 */
	public boolean freezeTarget(){
		if(chanceToAttack==1){
			System.out.println("You're frozen...");
			return true;
		}
		return false;
	}
	
	public void burnTick(){
		
	}
	
	public void poisonTick(){
		
	}
	
	public void freezeTick(){
		
	}
	
	
	
	
	
	
	
	
	
}