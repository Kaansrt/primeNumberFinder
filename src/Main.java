public class Main {
    public static void main(String[] args) {
        int primeNumber = 0;
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    primeNumber++;
                }
            }
            if (primeNumber == 1) {
                System.out.println(i);
            }
            if (primeNumber != 1) {
                System.out.println(i+ " Asal değildir.");
            }
            primeNumber=0;

        }

    }
}