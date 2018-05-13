package iocANDcdiXMLbased.classes;

public class BaseballCoach extends FortuneServiceCoach {

	public BaseballCoach(FortuneService fortuneService) {
		super(fortuneService);
	}

	@Override
	public String getDailyWorkout() {
		return "Baseball Workout " + getFortuneText();
	}
}
