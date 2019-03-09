
public class FinalResult {
	ShootingResult shootingResult;
	SkiingResult skiingResult;
	
	public FinalResult(ShootingResult shootingResult, SkiingResult skiingResult) {
		this.shootingResult = shootingResult;
		this.skiingResult = skiingResult;
	}
	
	double finalScore() {
		
		//variable will store the modifier according to the athlete's position
		int positionModifier = 0;
		
		if (this.skiingResult.place == 1)
			positionModifier = 10;
		if (this.skiingResult.place == 2)
			positionModifier = 7;
		if (this.skiingResult.place == 3)
			positionModifier = 3;
		if (this.skiingResult.place == 4)
			positionModifier = 1;
		
		//fScore holds the sum of the skiing time, and both penalties
		double fScore = this.skiingResult.pointsEarned() + this.skiingResult.getPenalties() + this.shootingResult.getPenalties();
		
		return fScore - positionModifier;
	}
	
}
