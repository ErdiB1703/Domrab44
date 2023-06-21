import java.util.Scanner;

public class NumberAdder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        String sum = addNumbers(number1, number2);
        System.out.println("Сумма чисел: " + sum);
    }

    public static String addNumbers(int number1, int number2) {
        int sum = number1 + number2;
        return String.valueOf(sum);
    }
}