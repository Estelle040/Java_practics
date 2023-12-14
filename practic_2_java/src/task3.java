public class task3 {
    public static void main(String[] args) {
        int n = 15;

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        for (int i = 1; i <= n; i++) {
            double harmonic = 1.0 / i;
            System.out.println(harmonic);
        }
    }
}
