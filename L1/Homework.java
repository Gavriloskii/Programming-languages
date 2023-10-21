import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        double randomValue = rand.nextDouble() * 100;

        int integerPart = (int) randomValue;
        double decimalPart = randomValue - integerPart;
        char character = (char) integerPart;

        System.out.printf("The random number: %.2f\n", randomValue);
        System.out.println("The integer part: " + integerPart);
        System.out.printf("The decimal part: %.2f\n", decimalPart);
        System.out.println("The character for the integer part: " + character);
    }
}
