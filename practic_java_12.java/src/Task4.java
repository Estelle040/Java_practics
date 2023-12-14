import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите карты первого игрока (5 карт): ");
        String player1Cards = scanner.nextLine();
        System.out.println("Введите карты второго игрока (5 карт): ");
        String player2Cards = scanner.nextLine();

        Deque<Integer> player1Deck = parseCards(player1Cards);
        Deque<Integer> player2Deck = parseCards(player2Cards);

        int moves = 0;
        while (moves < 106 && !player1Deck.isEmpty() && !player2Deck.isEmpty()) {
            int card1 = player1Deck.poll();
            int card2 = player2Deck.poll();

            if (card1 == 0 && card2 == 9) {
                player1Deck.offer(card1);
                player1Deck.offer(card2);
            } else if (card1 == 9 && card2 == 0) {
                player2Deck.offer(card1);
                player2Deck.offer(card2);
            } else if (card1 > card2) {
                player1Deck.offer(card1);
                player1Deck.offer(card2);
            } else {
                player2Deck.offer(card1);
                player2Deck.offer(card2);
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

    private static Deque<Integer> parseCards(String input) {
        Deque<Integer> deck = new ArrayDeque<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            deck.offer(Integer.parseInt(String.valueOf(input.charAt(i))));
        }
        return deck;
    }
}
