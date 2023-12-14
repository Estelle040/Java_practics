package Task2;

public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("Магия произошла");
    }

    @Override
    public void sit() {
        System.out.println("Пока вы сидели на стуле, он превратился в бабочек");
    }
}
