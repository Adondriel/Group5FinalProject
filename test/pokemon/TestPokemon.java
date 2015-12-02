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
	Attack bugbite=new BugBite(1);
	Attack leechseed=new LeechSeed(1);
	Attack petalblizzard=new PetalBlizzard(1);
	Attack razorleaf=new RazorLeaf(1);
	Attack solarbeam=new SolarBeam(1);
	Attack stringshot=new StringShot(1);
	Attack tackle=new Tackle(1);
	Attack vinewhip=new VineWhip(1);
	
	Attack ember=new Ember(1);
	Attack firefang=new FireFang(1);
	Attack firespin=new FireSpin(1);
	Attack heatwave=new HeatWave(1);
	Attack inferno=new Inferno(1);
	Attack will=new Will_O_Wisp(1);
	
	Attack bubble=new Bubble(1);
	Attack bubblebeam=new BubbleBeam(1);
	Attack hydropump=new HydroPump(1);
	Attack watergun=new WaterGun(1);
	Attack waterpulse=new WaterPulse(1);
	Attack withdraw=new Withdraw(1);
	
	@Test
	public void testBulbasaur(){
		Pokemon p=new Bulbasaur();
		TypeBehavior t=new GrassType();
		assertEquals(49, p.getDamage());
		assertEquals(450, p.getMaxHealth());
		assertEquals(450, p.getMaxHealth());
		p.takeHit(50);
		assertEquals(400, p.getCurrentHealth());
		assertEquals(0, p.getExperience());
		assertTrue(p.getType() instanceof GrassType);
		//assertEquals(t, p.getType());
		assertEquals("Bulbasaur", p.getName());
		assertTrue(p.getAttack(0) instanceof LeechSeed);
		assertTrue(p.getAttack(1) instanceof VineWhip);
		assertTrue(p.getAttack(2) instanceof RazorLeaf);
		assertTrue(p.getAttack(3) instanceof Tackle);
	}
	
	@Test
	public void testIvysaur(){
		
	}
	
	@Test
	public void testVenesaur(){
		
	}
}
