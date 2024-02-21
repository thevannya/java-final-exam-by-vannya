import java.util.Scanner;

public class ArrayStore {
    public static void ArrayStoreFun() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        int count = 0;
        char choice;

        do {
            if (count == numbers.length) {
                int[] newNumbers = new int[numbers.length * 2];
                System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
                numbers = newNumbers;
            }

            System.out.print("Enter a number: ");
            numbers[count] = scanner.nextInt();
            count++;

            System.out.print("Do you want to enter more numbers? (Y/N) ");
            choice = scanner.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.print("The entered numbers are:  ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();

    }
}
