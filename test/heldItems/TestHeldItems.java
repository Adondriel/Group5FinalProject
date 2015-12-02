package heldItems;

import static org.junit.Assert.*;

import org.junit.Test;

import pokemon.*;

/**
 * @author Benjamin Uleau
 *
 */
public class TestHeldItems {
	/**
	 * Tets GrassGem on pokemon
	 */
	@Test
	public void testGrassGem() {
		//Create a pokemon, a grass gem, and a fire gem
		Pokemon p=new MockGrassPokeman();
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
		//NOTE:
		//Testing of pokemon damage amplification by a factor of 1.3 will be handled in 
	}

}
