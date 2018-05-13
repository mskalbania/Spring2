package iocANDcdiXMLbased.classes;

public abstract class FortuneServiceCoach implements Coach {

	private FortuneService fortuneService;

	public FortuneServiceCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getFortuneText() {
		return fortuneService.getFortune();
	}

	public abstract String getDailyWorkout();
}
