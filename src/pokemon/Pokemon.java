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
public abstract class Pokemon implements Pkmn
{
	private int damage;
	private int maxHealth;
	private int currentHealth;
	private int experience;
	/**
	 * The pokemon's chance to attack
	 */
	private int chanceToAttack = 1;
	private TypeBehavior type;
	private String name;
	
	private Pkmn pkmn=null;
	private ArrayList<Attack> moves=new ArrayList<Attack>();
	private Attack currentAttack=null;
	
	private StatusEffect status=null;
	
	/**
	 * @param target
	 * @return whether or not the pokemon attacked
	 * @throws StatusEffectException 
	 */
	public boolean attack(Pokemon target) throws StatusEffectException{
		if (status != null){
			int statusDamage = status.statusTick();
			currentHealth -= statusDamage;
		}
		if (chanceToAttack == 1){
		//if(freezeTarget()==false){
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
		System.out.println("You're frozen...");
		return false;
	}
	
	/**
	 * @return the damage that will be inflicted by a status effect.
	 */
	public int statusTick(){
		return 0;
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

	public ArrayList<Attack> getMoves() {
		return moves;
	}
	
	public StatusEffect getStatus(){
		return status;
	}
	
	public void setStatus(StatusEffect status){
		this.status = status;
	}
	
	public Attack getAttack(int i){
		return moves.get(i);
	}
	
	public void setCurrentAttack(int i){
		currentAttack=moves.get(i);
	}

	public Pkmn getPkmn(){
		return pkmn;
	}
	
	public int calculateAmplifiedDamage(){
		return 0;
	}
	
	public int calculateAmplifiedExperience(){
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

	public int getChanceToAttack() {
		return chanceToAttack;
	}

	public void setChanceToAttack(int chanceToAttack) {
		this.chanceToAttack = chanceToAttack;
	}

	public Attack getCurrentAttack() {
		return currentAttack;
	}

	public void setCurrentAttack(Attack currentAttack) {
		this.currentAttack = currentAttack;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setType(TypeBehavior type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPkmn(Pkmn pkmn) {
		this.pkmn = pkmn;
	}

	public void setMoves(ArrayList<Attack> moves) {
		this.moves = moves;
	}
	
	
	
}