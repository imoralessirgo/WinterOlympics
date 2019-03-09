
public class SkiingResult {
	int place;
	double timeLap1;
	double timeLap2;
	double timeLap3;
	double timeLap4;
	int numOfPenalties;
	
	public SkiingResult (int place, double timeLap1, double timeLap2, double timeLap3, double timeLap4, int numOfPenalties) {
		this.place = place;
		this.timeLap1 = timeLap1;
		this.timeLap2 = timeLap2;
		this.timeLap3 = timeLap3;
		this.timeLap4 = timeLap4;
		this.numOfPenalties = numOfPenalties;
		
	}
	
	double pointsEarned() {
		
		return (this.timeLap1 + this.timeLap2 + this.timeLap3 + this.timeLap4);
	}
	
	double getPenalties() {
		
		return (this.numOfPenalties * 5.0);
	}
}
