import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player1Cards = scanner.next();
        String player2Cards = scanner.next();

        Queue<Integer> player1Deck = new LinkedList<>();
        Queue<Integer> player2Deck = new LinkedList<>();

        // Заполняем колоды игроков начальными картами
        for (int i = 0; i < 5; i++) {
            player1Deck.add(Character.getNumericValue(player1Cards.charAt(i)));
            player2Deck.add(Character.getNumericValue(player2Cards.charAt(i)));
        }

        int moves = 0;

        while (moves < 106 && !player1Deck.isEmpty() && !player2Deck.isEmpty()) {
            int player1Card = player1Deck.poll();
            int player2Card = player2Deck.poll();

            if (player1Card == 0 && player2Card == 9) {
                player1Deck.add(player1Card);
                player1Deck.add(player2Card);
            } else if (player1Card == 9 && player2Card == 0) {
                player2Deck.add(player1Card);
                player2Deck.add(player2Card);
            } else if (player1Card > player2Card) {
                player1Deck.add(player1Card);
                player1Deck.add(player2Card);
            } else {
                player2Deck.add(player1Card);
                player2Deck.add(player2Card);
            }

            moves++;
        }

        if (player1Deck.isEmpty()) {
            System.out.println("second " + moves);
        } else if (player2Deck.isEmpty()) {
            System.out.println("first " + moves);
        } else {
            System.out.println("botva");
        }
    }
}

