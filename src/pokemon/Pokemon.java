package pokemon;

import java.util.ArrayList;

import exceptions.StatusEffectException;
import statusEffects.*;
import heldItems.*;
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
	/**
	 * The pokemon's chance to attack
	 */
	public int chanceToAttack;
	TypeBehavior type;
	String name;
	boolean burn;
	boolean freeze;
	boolean poison;
	
	Pkmn pkmn=null;
	ArrayList<Attack> moves=new ArrayList<Attack>();
	Attack currentAttack=null;
	
	StatusEffect status=null;
	
	/**
	 * @param target
	 * @return whether or not the pokemon attacked
	 * @throws StatusEffectException 
	 */
	public boolean attack(Pokemon target) throws StatusEffectException{
		if(freezeTarget()==false){
			if(target.getCurrentHealth()<=0){
				return false;
			}		
			int attackDamage=currentAttack.getDamage();
			int typeDamage=type.calcDamage(damage, target.getType());
			if(pkmn!=null){
				int heldDamage=pkmn.calculateAmplifiedDamage();
				target.takeHit(typeDamage+heldDamage+attackDamage);
				return true;
			}
			target.takeHit(typeDamage+attackDamage);
			return true;
			}
		return false;
	}
	
	/**
	 * @return the damage that will be inflicted by a status effect.
	 */
	public int statusTick(){
		return 0;
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
	 * @throws StatusEffectException 
	 */
	public boolean burnTarget() throws StatusEffectException{
		if(status==null){
			status=new Burn(this);
			return true;
		}
		return false;
	}
	
	/**
	 * @return true if the target got poisoned, false otherwise
	 * @throws StatusEffectException 
	 */
	public boolean poisonTarget() throws StatusEffectException{
		if(status==null){
			status=new Poison(this);
			return true;
		}
		return false;
	}
	
	/**
	 * @return true if the target gets frozen, false otherwise
	 * @throws StatusEffectException 
	 */
	public boolean freezeTarget() throws StatusEffectException{
		if(status==null){
			status=new Frozen(this);
			return true;
		}
		/*if(chanceToAttack==0){
			System.out.println("You're frozen...");
			return true;
		}*/
		return false;
	}
	
	/**
	 * Tick burn status effect
	 */
	public void burnTick(){
		
	}
	
	/**
	 * Tick poison status effect
	 */
	public void poisonTick(){
		
	}
	
	/**
	 * Tick freeaze status effect
	 */
	public void freezeTick(){
		
	}

	/**
	 * @return the number of status effects on a Pokemon.
	 */
	public int getNumStatusEffects() {
		return 0;
	}	
	
	/**
	 * @param pkmn
	 * @return true if an item was picked up, false otherwise
	 */
	public boolean equipItem(Pkmn pkmn){
		if(this.pkmn==null){
			this.pkmn=pkmn;
			return true;
		}
		return false;
	}
	
	/**
	 * @return true if an item was dropped, false otherwise
	 */
	public boolean unequipItem(){
		if(this.pkmn==null){
			return false;
		}
		pkmn=null;
		return true;
	}
	
	/**
	 * @param a
	 * @return the current attack
	 */
	public Attack selectAttack(Attack a){
		this.currentAttack=a;
		return currentAttack;
	}
}