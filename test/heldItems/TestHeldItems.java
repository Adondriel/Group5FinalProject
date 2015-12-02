package heldItems;

import static org.junit.Assert.*;
import exceptions.StatusEffectException;
import gameplay.Environment;

import org.junit.Test;

import attacks.GrassAttackAbilities.*;
import pokemon.*;

/**
 * @author Benjamin Uleau
 *
 */
public class TestHeldItems {
	Environment e=Environment.getEnvironment();
	/**
	 * Tets GrassGem on pokemon
	 * @throws StatusEffectException 
	 */
	@Test
	public void testHeldItems() throws StatusEffectException {
		//Create a pokemon, a grass gem, and a fire gem
		Pokemon p=new MockGrassPokeman();
		Pokemon q=new MockGrassPokeman();
		
		Pkmn grass=new GrassGem(p);
		Pkmn fire=new FireGem(p);
		Pkmn water=new WaterGem(p);
		Pkmn macho=new MachoBrace(p);
		
		//Make sure pokemon can equip and unequip gems properly
		assertTrue(p.equipItem(grass));
		assertFalse(p.equipItem(fire));
		assertTrue(p.unequipItem());
		assertTrue(p.equipItem(fire));
		assertFalse(p.equipItem(water));
		p.unequipItem();
		assertTrue(p.equipItem(water));
		p.unequipItem();
		assertTrue(p.equipItem(macho));
		//p.unequipItem();
		//p.equipItem(grass);
		LeechSeed leechseed = new LeechSeed(p.getDamage());
		p.selectAttack(leechseed);
		p.attack(q);
		//Make sure there is no damage amplification without the proper item equipped
		assertEquals(394, q.getCurrentHealth());
		p.unequipItem();
		p.equipItem(grass);
		p.attack(q);
		assertEquals(275, q.getCurrentHealth());
	}

}
