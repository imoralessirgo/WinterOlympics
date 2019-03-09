import static org.junit.Assert.*;

import org.junit.Test;

public class Examples {

	
    ShootingRound shootingRound1 = new ShootingRound(1);
    ShootingRound shootingRound2 = new ShootingRound(3);
    ShootingRound shootingRound3 = new ShootingRound(2);
    ShootingRound shootingRound4 = new ShootingRound(5);
    
    ShootingResult shootingResult = new ShootingResult(shootingRound1, shootingRound2, shootingRound3, shootingRound4);
    ShootingResult shootingResult1 = new ShootingResult(shootingRound2, shootingRound2, shootingRound1, shootingRound4);
    
    SkiingResult skiingResult = new SkiingResult(3, 12.0, 14.0, 13.0, 12.0, 7);	//Position, Lap 1, Lap 2, Lap 3, Lap 4, penalties
    SkiingResult skiingResult1 = new SkiingResult(1, 20.0, 15.0, 13.0, 18.0, 2);	//Position, Lap 1, Lap 2, Lap 3, Lap 4, penalties
    
    FinalResult finalResult = new FinalResult(shootingResult, skiingResult1);
    FinalResult finalResult1 = new FinalResult(shootingResult1, skiingResult);
    
    Athlete athlete1 = new Athlete(finalResult);
    Athlete athlete2 = new Athlete(finalResult1);
	
    
    /* Testing pointsEarned() */
    @Test
	public void testPointsEarned() {
		assertEquals(51.0,skiingResult.pointsEarned(),0.1);
	}
	@Test
	public void testPointsEarned1() {
		assertEquals(66.0,skiingResult1.pointsEarned(),0.1);
	}
	@Test
	public void testPointsEarned2() {
		assertEquals(11.0,shootingResult.pointsEarned(),0.1);
	}
	@Test
	public void testPointsEarned3() {
		assertEquals(12.0,shootingResult1.pointsEarned(),0.1);
	}
	
	/* Testing getPenalties */
	@Test
	public void testGetPenlties() {
		assertEquals(35.0,skiingResult.getPenalties(),0.1);
	}
	@Test
	public void testGetPenlties1() {
		assertEquals(10.0,skiingResult1.getPenalties(),0.1);
	}
	@Test
	public void testGetPenlties2() {
		assertEquals(540.0,shootingResult.getPenalties(),0.1);
	}
	@Test
	public void testGetPenlties3() {
		assertEquals(480.0,shootingResult1.getPenalties(),0.1);
	}
	
	/* Testing FinalScore  */
	@Test
	public void testFinalScore() {
		assertEquals(606.0,finalResult.finalScore(),0.1);
	}
	@Test
	public void testFinalScore1() {
		assertEquals(563.0,finalResult1.finalScore(),0.1);
	}
	
	/* Testing BetterSkiier */
	@Test
	public void testBetterSkiier() {
		assertEquals(false,athlete1.betterSkiier(athlete2));
	}
	@Test
	public void testBetterSkiier1() {
		assertEquals(true,athlete2.betterSkiier(athlete1));
	}
	
	/* Testing hasBeaten */
	@Test
	public void testHasBeaten() {
		assertEquals(false,athlete1.hasBeaten(athlete2));
	}
	@Test
	public void testHasBeaten1() {
		assertEquals(true,athlete2.hasBeaten(athlete1));
	}	
	
	
}
