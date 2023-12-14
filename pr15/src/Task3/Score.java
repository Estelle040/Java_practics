package Task3;

public class Score {
    private int milanScore = 0;
    public int madridScore = 0;

    public int getMilanScore() {
        return milanScore;
    }

    public int getMadridScore() {
        return madridScore;
    }

    public void incMilan() {
        milanScore++;
    }
    public void incMadrid() {
        madridScore++;
    }
}
