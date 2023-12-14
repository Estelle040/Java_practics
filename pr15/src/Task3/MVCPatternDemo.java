package Task3;

public class MVCPatternDemo {
    public static void main(String[] args) {
        new ScoreController(new Score(), new ScoreView());
    }
}
