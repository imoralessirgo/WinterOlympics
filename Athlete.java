
public class Athlete {
	FinalResult finalResult;
	
	public Athlete(FinalResult finalResult) {
		this.finalResult = finalResult;
	}
	
	boolean betterSkiier(Athlete Athlete) {
		return (this.finalResult.skiingResult.pointsEarned() < Athlete.finalResult.skiingResult.pointsEarned());
		
	}
	
	boolean betterShooter(Athlete Athlete) {
		return (this.finalResult.shootingResult.pointsEarned() > Athlete.finalResult.shootingResult.pointsEarned());
		
	}

	boolean hasBeaten(Athlete Athlete) {
		if (this.betterShooter(Athlete) || this.betterSkiier(Athlete))
			return true;
		else
			return false;
	}
}
