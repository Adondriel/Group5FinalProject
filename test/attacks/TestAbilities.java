package attacks;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import attacks.FireAttackAbilities.*;
import attacks.GrassAttackAbilities.*;
import attacks.WaterAttackAbilities.*;
import exceptions.StatusEffectException;
import gameState.TurnChange;
import gameplay.Environment;
import gameplay.Player;
import pokemon.MockFirePokeman;
import pokemon.MockGrassPokeman;
import pokemon.MockWaterPokeman;
import pokemon.Pokemon;
import statusEffects.Burn;
import statusEffects.Frozen;
import statusEffects.Poison;


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
	
	@Test
	public void testEmber()
	{
		
		Pokemon fire1 = new MockFirePokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		TurnChange tc = new TurnChange(e.getPlayer());
		
		e.setTC(tc);
		
		e.getPlayer().setSelectedPokemon(fire1);
		Ember embur = new Ember(e.getPlayer().getSelectedPokemon().getDamage());
		
		e.getPlayer().getSelectedPokemon().selectAttack(embur);
		
		
		//fire1 attacking grass target
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertTrue(e.getComputer().getSelectedPokemon().getStatus() instanceof Burn);
		assertEquals(663, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//fire1 attacking water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertEquals(325, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//fire1 attacking grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		assertEquals(249, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
	}
	
	/**
	 * test FireFang Ability
	 */
	@Test
	public void testFireFang()
	{
		Pokemon fire1 = new MockFirePokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.getPlayer().setSelectedPokemon(fire1);
		FireFang firefang = new FireFang(e.getPlayer().getSelectedPokemon().getDamage());
		e.getPlayer().getSelectedPokemon().selectAttack(firefang);
		
		//attack firetarget
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(642, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(304, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(228, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
	}
	
	@Test
	public void testWill_O_Wisp()
	{
		Pokemon fire1 = new MockFirePokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		TurnChange tc = new TurnChange(e.getPlayer());
		
		e.setTC(tc);
		
		e.getPlayer().setSelectedPokemon(fire1);
		Will_O_Wisp willy = new Will_O_Wisp(e.getPlayer().getSelectedPokemon().getDamage());
		
		e.getPlayer().getSelectedPokemon().selectAttack(willy);
		
		
		//fire1 attacking grass target
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertTrue(e.getComputer().getSelectedPokemon().getStatus() instanceof Burn);
		assertEquals(612, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//fire1 attacking water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertEquals(325, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//fire1 attacking grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		assertEquals(249, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	
	/**
	 * test Heat Wave Ability
	 */
	@Test
	public void testHeatWave()
	{
		Pokemon fire1 = new MockFirePokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.getPlayer().setSelectedPokemon(fire1);
		HeatWave heatwave = new HeatWave(e.getPlayer().getSelectedPokemon().getDamage());
		e.getPlayer().getSelectedPokemon().selectAttack(heatwave);
		
		//attack firetarget
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(617, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(279, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(203, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	
	@Test
	public void testInferno()
	{
		Pokemon fire1 = new MockFirePokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		TurnChange tc = new TurnChange(e.getPlayer());
		
		e.setTC(tc);
		
		e.getPlayer().setSelectedPokemon(fire1);
		Inferno inferno = new Inferno(e.getPlayer().getSelectedPokemon().getDamage());
		
		e.getPlayer().getSelectedPokemon().selectAttack(inferno);
		
		
		//fire1 attacking grass target
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertTrue(e.getComputer().getSelectedPokemon().getStatus() instanceof Burn);
		assertEquals(612, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//fire1 attacking water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertEquals(325, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//fire1 attacking grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		assertEquals(249, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	
	@Test
	public void testFireSpin()
	{
		Pokemon fire1 = new MockFirePokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		TurnChange tc = new TurnChange(e.getPlayer());
		
		e.setTC(tc);
		
		e.getPlayer().setSelectedPokemon(fire1);
		FireSpin firespin = new FireSpin(e.getPlayer().getSelectedPokemon().getDamage());
		
		e.getPlayer().getSelectedPokemon().selectAttack(firespin);
		
		
		//fire1 attacking grass target
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertTrue(e.getComputer().getSelectedPokemon().getStatus() instanceof Burn);
		assertEquals(612, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//fire1 attacking water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertEquals(325, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//fire1 attacking grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		assertEquals(249, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	
	@Test
	public void testBugBite()
	{
		Pokemon grass = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		TurnChange tc = new TurnChange(e.getPlayer());
		
		e.setTC(tc);
		
		e.getPlayer().setSelectedPokemon(grass);
		BugBite bugbite = new BugBite(e.getPlayer().getSelectedPokemon().getDamage());
		
		e.getPlayer().getSelectedPokemon().selectAttack(bugbite);
		
		
		//grass attacking fire target
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertTrue(e.getComputer().getSelectedPokemon().getStatus() instanceof Poison);
		assertEquals(663, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//grass attacking water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertEquals(325, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//grass attacking grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		assertEquals(249, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	
	/**
	 * test Leech Seed
	 */
	@Test
	public void testLeechSeed()
	{
		Pokemon grass1 = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.getPlayer().setSelectedPokemon(grass1);
		LeechSeed leechseed = new LeechSeed(e.getPlayer().getSelectedPokemon().getDamage());
		e.getPlayer().getSelectedPokemon().selectAttack(leechseed);
		
		//attack firetarget
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(749, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(295, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(394, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	
	@Test
	public void testPetalBlizzard()
	{
		Pokemon grass1 = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.getPlayer().setSelectedPokemon(grass1);
		PetalBlizzard petablizzard = new PetalBlizzard(e.getPlayer().getSelectedPokemon().getDamage());
		e.getPlayer().getSelectedPokemon().selectAttack(petablizzard);
		
		//attack firetarget
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(712, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(258, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(357, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	@Test
	public void testRazorLeaf()
	{
		Pokemon grass = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		TurnChange tc = new TurnChange(e.getPlayer());
		
		e.setTC(tc);
		
		e.getPlayer().setSelectedPokemon(grass);
		RazorLeaf razorLeaf = new RazorLeaf(e.getPlayer().getSelectedPokemon().getDamage());
		
		e.getPlayer().getSelectedPokemon().selectAttack(razorLeaf);
		
		
		//grass attacking grass target
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertTrue(e.getComputer().getSelectedPokemon().getStatus() instanceof Poison);
		assertEquals(663, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//grass attacking water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertEquals(325, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//grass attacking grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		assertEquals(249, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	/**
	 * test Solar beam ability
	 */
	@Test
	public void testSolarBeam()
	{
		Pokemon grass1 = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.getPlayer().setSelectedPokemon(grass1);
		SolarBeam solarbeam = new SolarBeam(e.getPlayer().getSelectedPokemon().getDamage());
		e.getPlayer().getSelectedPokemon().selectAttack(solarbeam);
		
		//attack firetarget
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(698, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(244, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(343, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	/**
	 * test String shot ability
	 */
	@Test
	public void testStringShot()
	{
		Pokemon grass1 = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.getPlayer().setSelectedPokemon(grass1);
		StringShot stringshot = new StringShot(e.getPlayer().getSelectedPokemon().getDamage());
		e.getPlayer().getSelectedPokemon().selectAttack(stringshot);
		
		//attack firetarget
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(710, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(256, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(355, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	@Test
	public void testTackle()
	{
		Pokemon grass1 = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.getPlayer().setSelectedPokemon(grass1);
		Tackle tackle = new Tackle(e.getPlayer().getSelectedPokemon().getDamage());
		e.getPlayer().getSelectedPokemon().selectAttack(tackle);
		
		//attack firetarget
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(752, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(298, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//attack grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(397, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	@Test
	public void testVineWhip()
	{
		Pokemon grass = new MockGrassPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		TurnChange tc = new TurnChange(e.getPlayer());
		
		e.setTC(tc);
		
		e.getPlayer().setSelectedPokemon(grass);
		VineWhip vinewhip = new VineWhip(e.getPlayer().getSelectedPokemon().getDamage());
		
		e.getPlayer().getSelectedPokemon().selectAttack(vinewhip);
		
		
		//grass attacking grass target
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertTrue(e.getComputer().getSelectedPokemon().getStatus() instanceof Poison);
		assertEquals(663, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//grass attacking water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertEquals(325, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//grass attacking grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		assertEquals(249, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	
	@Test
	public void testBubble()
	{
		Pokemon water = new MockWaterPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.getPlayer().setSelectedPokemon(water);
		Bubble bubble = new Bubble(e.getPlayer().getSelectedPokemon().getDamage());
		e.getPlayer().getSelectedPokemon().selectAttack(bubble);
		
		//water attack firetarget
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(752, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attack water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(298, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attack grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(397, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	@Test
	public void testBubbleBeam()
	{
		Pokemon water = new MockWaterPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.getPlayer().setSelectedPokemon(water);
		BubbleBeam bubblebeam = new BubbleBeam(e.getPlayer().getSelectedPokemon().getDamage());
		e.getPlayer().getSelectedPokemon().selectAttack(bubblebeam);
		
		//water attack firetarget
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(752, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attack water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(298, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attack grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(397, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	@Test
	public void testHydroPump()
	{
		Pokemon water = new MockWaterPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.getPlayer().setSelectedPokemon(water);
		HydroPump hydropump = new HydroPump(e.getPlayer().getSelectedPokemon().getDamage());
		e.getPlayer().getSelectedPokemon().selectAttack(hydropump);
		
		//water attack firetarget
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(752, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attack water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(298, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attack grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(397, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	
	@Test
	public void WaterGun()
	{
		Pokemon water = new MockWaterPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		TurnChange tc = new TurnChange(e.getPlayer());
		
		e.setTC(tc);
		
		e.getPlayer().setSelectedPokemon(water);
		WaterGun watergun = new WaterGun(e.getPlayer().getSelectedPokemon().getDamage());
		
		e.getPlayer().getSelectedPokemon().selectAttack(watergun);
		
		
		//water attacking grass target
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertTrue(e.getComputer().getSelectedPokemon().getStatus() instanceof Frozen);
		assertEquals(663, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attacking water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertEquals(325, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attacking grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		assertEquals(249, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	@Test
	public void testWaterPulse()
	{
		Pokemon water = new MockWaterPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		TurnChange tc = new TurnChange(e.getPlayer());
		
		e.setTC(tc);
		
		e.getPlayer().setSelectedPokemon(water);
		WaterPulse waterpulse = new WaterPulse(e.getPlayer().getSelectedPokemon().getDamage());
		
		e.getPlayer().getSelectedPokemon().selectAttack(waterpulse);
		
		
		//water attacking grass target
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertTrue(e.getComputer().getSelectedPokemon().getStatus() instanceof Frozen);
		assertEquals(663, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attacking water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		
		assertEquals(325, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attacking grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
			
		} catch (StatusEffectException e)
		{
			e.printStackTrace();
		}
		assertEquals(249, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}
	@Test
	public void testWithdraw()
	{
		Pokemon water = new MockWaterPokeman();
		Pokemon fireTarget = new MockFirePokeman();
		Pokemon waterTarget = new MockWaterPokeman();
		Pokemon grassTarget = new MockGrassPokeman();
		
		e.getPlayer().setSelectedPokemon(water);
		Withdraw withdraw = new Withdraw(e.getPlayer().getSelectedPokemon().getDamage());
		e.getPlayer().getSelectedPokemon().selectAttack(withdraw);
		
		//water attack firetarget
		e.getComputer().setSelectedPokemon(fireTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(752, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attack water target
		e.getComputer().setSelectedPokemon(waterTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(298, e.getComputer().getSelectedPokemon().getCurrentHealth());
		
		//water attack grass target
		e.getComputer().setSelectedPokemon(grassTarget);
		try
		{
			e.getPlayer().getSelectedPokemon().attack(e.getComputer().getSelectedPokemon());
		} catch (StatusEffectException e1)
		{
			e1.printStackTrace();
		}
		assertEquals(397, e.getComputer().getSelectedPokemon().getCurrentHealth());
	}

}
