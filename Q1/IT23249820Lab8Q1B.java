import java.util.Scanner;

public class IT23249820Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int evenIndex = 0;

        System.out.println("Enter 5 Numbers:");

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();

            if (myArray[i] % 2 == 0) {
                evenArray[evenIndex] = myArray[i];
                evenIndex++;
            }
        }

        System.out.println("\nmyArray Contents:");

        for (int number : myArray) {
            System.out.print(number + " ");
        }

        System.out.println("\n\nevenArray Contents:");

        for (int number : evenArray) {
            System.out.print(number + " ");
        }

        System.out.println();
        input.close();
    }
}