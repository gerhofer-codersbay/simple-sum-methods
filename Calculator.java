import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        // Summe
        int completelydifferentsum = sum(firstNumber, secondNumber);
        int sumOfThree = sum(firstNumber, secondNumber, thirdNumber);
        System.out.println("Summe von first and second number ist " + completelydifferentsum);
        System.out.println("Summe von first, second and third number ist " + sumOfThree);

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

}
