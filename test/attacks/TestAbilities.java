package attacks;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import attacks.FireAttackAbilities.*;
import attacks.GrassAttackAbilities.*;
import attacks.WaterAttackAbilities.*;
import exceptions.StatusEffectException;
import gameplay.Environment;
import gameplay.Player;
import pokemon.MockFirePokeman;
import pokemon.MockGrassPokeman;
import pokemon.MockWaterPokeman;
import pokemon.Pokemon;
import statusEffects.Burn;


/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */

public class TestAbilities
{
	Environment e = Environment.getEnvironment();
	/**
	 * Test the Ember Ability
	 */
	
	public void testEmber()
	{
		
		Pokemon fire1 = new MockFirePokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.setPlayerPokemon(fire1);
		Ember embur = new Ember(e.getCurrentPlayerPokemon().getDamage());
		e.getCurrentPlayerPokemon().selectAttack(embur);
		
		//fire1 attacking grass target
		e.setComputerPokemon(fireTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		//assertTrue(e.getCurrentComputerPokemon().getStatus() instanceof Burn);
		assertEquals(663, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//fire1 attacking water target
		e.setComputerPokemon(waterTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertEquals(325, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//fire1 attacking grass target
		e.setComputerPokemon(grassTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		assertEquals(249, e.getCurrentComputerPokemon().getCurrentHealth());
		
	}
	
	@Test
	public void testFireFang()
	{
		Pokemon fire1 = new MockFirePokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.setPlayerPokemon(fire1);
		FireFang firefang = new FireFang(e.getCurrentPlayerPokemon().getDamage());
		e.getCurrentPlayerPokemon().selectAttack(firefang);
		
		//attack firetarget
		e.setComputerPokemon(fireTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		assertEquals(642, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack water target
		e.setComputerPokemon(waterTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(304, e.getCurrentComputerPokemon().getCurrentHealth());
		
		//attack grass target
		e.setComputerPokemon(grassTarget);
		try
		{
			e.getCurrentPlayerPokemon().attack(e.getCurrentComputerPokemon());
		} catch (StatusEffectException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		assertEquals(228, e.getCurrentComputerPokemon().getCurrentHealth());
		
	}
	
	@Test
	public void testFireSpin()
	{
		
	}
	
	@Test
	public void testHeatWave()
	{
		Pokemon fred = new MockFirePokeman();
		Pokemon ferry = new MockFirePokeman();
		HeatWave heat = new HeatWave(fred.getDamage());
	}
	
	@Test
	public void testInferno()
	{
		
	}
	
	@Test
	public void testWill_O_Wisp()
	{
		
	}
	
	@Test
	public void testBugBite()
	{
		
	}
	
	@Test
	public void testLeechSeed()
	{
		
	}
	
	@Test
	public void testPetalBlizzard()
	{
		
	}
	@Test
	public void testRazorLeaf()
	{
		
	}
	@Test
	public void testSolarBeam()
	{
		
	}
	@Test
	public void testStringShot()
	{
		
	}
	@Test
	public void testTackle()
	{
		
	}
	@Test
	public void testVineWhip()
	{
		
	}
	
	@Test
	public void testBubble()
	{
		
	}
	@Test
	public void testBubbleBeam()
	{
		
	}
	@Test
	public void testHydroPump()
	{
		
	}
	
	@Test
	public void WaterGun()
	{
		
	}
	@Test
	public void testWaterPulse()
	{
		
	}
	@Test
	public void testWithdraw()
	{
		
	}

}
