import java.util.Scanner;

public class IT23249820Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int index = 0;

        while (index < numbers.length) {
            System.out.print(
                "Enter a Positive Number (" + (index + 1) + "/6): "
            );

            int number = input.nextInt();

            if (number > 0) {
                numbers[index] = number;
                index++;
            } else {
                System.out.println(
                    "Error: Please Enter ONLY Positive Numbers"
                );
            }
        }

        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("\nArray Contents:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println(
            "\nThe Maximum Number Entered: " + maximum
        );

        input.close();
    }
}