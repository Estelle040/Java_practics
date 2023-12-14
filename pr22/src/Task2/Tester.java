package Task2;

public class Tester {
    public static void main(String[] args) {
        Client cl = new Client();
        ChairFactory fac = new ChairFactory();

        cl.setChair(fac.creatVictorianChair());
        cl.sit();

        cl.setChair(fac.creatMagicChair());
        cl.sit();

        cl.setChair(fac.createFunctionalChair());
        cl.sit();
    }
}
