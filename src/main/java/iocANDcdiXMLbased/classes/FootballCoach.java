package iocANDcdiXMLbased.classes;

public class FootballCoach implements Coach{

	private FortuneService fortuneService;
	private String injectedVal;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setInjectedVal(String injectedVal) {
		this.injectedVal = injectedVal;
	}

	@Override
	public String getDailyWorkout() {
		return injectedVal + " Football Workout " + fortuneService.getFortune();
	}
}
