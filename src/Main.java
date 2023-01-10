import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int nr1;
        int nr2;
        int upperBound = 100;
        int aux;
        Random number = new Random();
        nr1 = number.nextInt(upperBound);
        nr2 = number.nextInt(upperBound);
        System.out.println("the first number is " + nr1);
        System.out.println("the second number is " + nr2);
        if (nr1 == nr2) {
            System.out.println("the number are equal");
            return;
        }
        if (nr1 > nr2) {
            aux = nr1;
            nr1 = nr2;
            nr2 = aux;
        }
        divisors(nr1, nr2);
    }


    public static void divisors(int nr, int nr2) {
        int maxDivNr = 0;
        int divCounter = 0;
        int theNumber = 0;

        for (int i = nr; i < nr2; i++) {
            divCounter = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0 && j % 2 == 0) {
                    divCounter++;
                }

            }
            if (divCounter > maxDivNr) {
                maxDivNr = divCounter;
                theNumber = i;
            }
        }
        System.out.println("the max number is " + theNumber + " and the max number of divisors is " + maxDivNr);
    }


}
