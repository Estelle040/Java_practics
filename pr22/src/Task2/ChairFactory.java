package Task2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair creatVictorianChair() {
        return new VictorianChair(196);
    }

    @Override
    public MagicChair creatMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
