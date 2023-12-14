import java.util.Scanner;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPlayer1 = scanner.next();
        String inputPlayer2 = scanner.next();
        scanner.close();

        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();

        // Инициализация колод игроков
        for (int i = 4; i >= 0; i--) {
            player1.push(Character.getNumericValue(inputPlayer1.charAt(i)));
            player2.push(Character.getNumericValue(inputPlayer2.charAt(i)));
        }

        int moves = 0;
        while (moves < 106 && !player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.pop();
            int card2 = player2.pop();

            if (card1 == 0 && card2 == 9) {
                player1.add(0, card1);
                player1.add(0, card2);
            } else if (card1 == 9 && card2 == 0) {
                player2.add(0, card1);
                player2.add(0, card2);
            } else if (card1 > card2) {
                player1.add(0, card1);
                player1.add(0, card2);
            } else {
                player2.add(0, card1);
                player2.add(0, card2);
            }

            moves++;
        }

        if (player1.isEmpty()) {
            System.out.println("second " + moves);
        } else if (player2.isEmpty()) {
            System.out.println("first " + moves);
        } else {
            System.out.println("botva");
        }
    }
}
