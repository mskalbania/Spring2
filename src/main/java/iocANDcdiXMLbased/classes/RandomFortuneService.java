package iocANDcdiXMLbased.classes;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] fortunes = {"Fortune 1", "Fortune 2", "Fortune 3"};

    private String pickRandomFortune() {
        final int index = new Random().nextInt(3);
        return fortunes[index];
    }

    @Override
    public String getFortune() {
        return "Your fortune is " + pickRandomFortune();
    }
}
