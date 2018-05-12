package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("coachContext.xml");

		final long time = System.currentTimeMillis();
		String id;
		if (time % 2 == 0) {
			id = "fbCoach";
		} else {
			id = "bbCoach";
		}

		Coach coach = context.getBean(id, Coach.class);
		System.out.println(coach.getDailyWorkout());
	}
}
