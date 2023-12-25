import java.util.Random;

public class CaptainsLogReader {
    public static void main(String[] args) {
        CaptainsLog captainsLog = new CaptainsLog(new Random());
        System.out.printf("Random planet class: %s %n",captainsLog.randomPlanetClass());
        System.out.printf("Random shit registry number: %s %n",captainsLog.randomShipRegistryNumber());
        System.out.printf("Random stardate: %.4f%n", captainsLog.randomStardate());
    }
}
