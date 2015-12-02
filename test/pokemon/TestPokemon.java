package pokemon;

import static org.junit.Assert.*;

import org.junit.Test;

import attacks.*;
import attacks.GrassAttackAbilities.*;
import attacks.FireAttackAbilities.*;
import attacks.WaterAttackAbilities.*;

/**
 * @author Benjamin Uleau
 *
 */
public class TestPokemon {
	/**
	 * Test Mock grass pokemon with all grass attacks
	 */
	@Test
	public void testMockGrassPokeman(){
		Pokemon p=new MockGrassPokeman();
		TypeBehavior t=new GrassType();
		assertEquals(100, p.getDamage());
		assertEquals(1000, p.getMaxHealth());
		assertEquals(1000, p.getCurrentHealth());
		p.takeHit(50);
		assertEquals(950, p.getCurrentHealth());
		assertEquals(0, p.getExperience());
		assertTrue(p.getType() instanceof GrassType);
		//assertEquals(t, p.getType());
		assertEquals("GRASS", p.getName());
		assertTrue(p.getAttack(0) instanceof LeechSeed);
		assertTrue(p.getAttack(1) instanceof VineWhip);
		assertTrue(p.getAttack(2) instanceof RazorLeaf);
		assertTrue(p.getAttack(3) instanceof Tackle);
		assertTrue(p.getAttack(4) instanceof BugBite);
		assertTrue(p.getAttack(5) instanceof PetalBlizzard);
		assertTrue(p.getAttack(6) instanceof SolarBeam);
		assertTrue(p.getAttack(7) instanceof StringShot);
	}
	
	/**
	 * Test Mock fire pokemon with all fire attacks
	 */
	@Test
	public void testMockFirePokeman(){
		Pokemon p=new MockFirePokeman();
		TypeBehavior t=new FireType();
		assertEquals(100, p.getDamage());
		assertEquals(1000, p.getMaxHealth());
		assertEquals(1000, p.getCurrentHealth());
		p.takeHit(50);
		assertEquals(950, p.getCurrentHealth());
		assertEquals(0, p.getExperience());
		assertTrue(p.getType() instanceof FireType);
		assertEquals("FIRE", p.getName());
		assertTrue(p.getAttack(0) instanceof Ember);
		assertTrue(p.getAttack(1) instanceof HeatWave);
		assertTrue(p.getAttack(2) instanceof FireFang);
		assertTrue(p.getAttack(3) instanceof Inferno);
		assertTrue(p.getAttack(4) instanceof Will_O_Wisp);
		assertTrue(p.getAttack(5) instanceof FireSpin);
	}
	
	/**
	 * Test Mock Water Pokemon with all water attacks
	 */
	@Test
	public void testMockWaterPokeman(){
		Pokemon p=new MockWaterPokeman();
		TypeBehavior t=new WaterType();
		assertEquals(100, p.getDamage());
		assertEquals(1000, p.getMaxHealth());
		assertEquals(1000, p.getCurrentHealth());
		p.takeHit(50);
		assertEquals(950, p.getCurrentHealth());
		assertEquals(0, p.getExperience());
		assertTrue(p.getType() instanceof WaterType);
		assertEquals("WATER", p.getName());
		assertTrue(p.getAttack(0) instanceof Bubble);
		assertTrue(p.getAttack(1) instanceof BubbleBeam);
		assertTrue(p.getAttack(2) instanceof HydroPump);
		assertTrue(p.getAttack(3) instanceof WaterGun);
		assertTrue(p.getAttack(4) instanceof WaterPulse);
		assertTrue(p.getAttack(5) instanceof Withdraw);
	}
	
	/**
	 * Test Bulbasaur as a representation of the grass type pokemon
	 */
	@Test
	public void testBulbasaur(){
		Pokemon p=new Bulbasaur();
		TypeBehavior t=new GrassType();
		assertEquals(49, p.getDamage());
		assertEquals(450, p.getMaxHealth());
		assertEquals(450, p.getCurrentHealth());
		p.takeHit(50);
		assertEquals(400, p.getCurrentHealth());
		assertEquals(0, p.getExperience());
		assertTrue(p.getType() instanceof GrassType);
		assertEquals("Bulbasaur", p.getName());
		assertTrue(p.getAttack(0) instanceof LeechSeed);
		assertTrue(p.getAttack(1) instanceof VineWhip);
		assertTrue(p.getAttack(2) instanceof RazorLeaf);
		assertTrue(p.getAttack(3) instanceof Tackle);
	}
	
	/**
	 * test charmander as a representation of fire type pokemon
	 */
	@Test
	public void testCharmander(){
		Pokemon p=new Charmander();
		TypeBehavior t=new FireType();
		assertEquals(52, p.getDamage());
		assertEquals(390, p.getMaxHealth());
		assertEquals(390, p.getCurrentHealth());
		p.takeHit(50);
		assertEquals(340, p.getCurrentHealth());
		assertEquals(0, p.getExperience());
		assertTrue(p.getType() instanceof FireType);
		assertEquals("Charmander", p.getName());
		assertTrue(p.getAttack(0) instanceof Ember);
		assertTrue(p.getAttack(1) instanceof FireFang);
		assertTrue(p.getAttack(2) instanceof Inferno);
		assertTrue(p.getAttack(3) instanceof HeatWave);
	}
	
	/**
	 * test squirtle 
	 */
	@Test
	public void testSquirtle(){
		Pokemon p=new Squirtle();
		TypeBehavior t=new WaterType();
		assertEquals(48, p.getDamage());
		assertEquals(440, p.getMaxHealth());
		assertEquals(440, p.getCurrentHealth());
		p.takeHit(50);
		assertEquals(390, p.getCurrentHealth());
		assertEquals(0, p.getExperience());
		assertTrue(p.getType() instanceof WaterType);
		assertEquals("Squirtle", p.getName());
		assertTrue(p.getAttack(0) instanceof WaterGun);
		assertTrue(p.getAttack(1) instanceof Withdraw);
		assertTrue(p.getAttack(2) instanceof Bubble);
		assertTrue(p.getAttack(3) instanceof WaterPulse);
	}
}
