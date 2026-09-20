import java.util.Scanner;

public class IT23249820Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int index = 0;

        while (index < studentsArray.length) {
            System.out.print(
                "Enter Student ID for Student " + (index + 1) + ": "
            );

            int studentId = input.nextInt();

            if (studentId > 0) {
                studentsArray[index] = studentId;
                index++;
            } else {
                System.out.println(
                    "Error: Please Enter ONLY Positive Numbers"
                );
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = input.nextInt();
        boolean found = false;

        for (int studentId : studentsArray) {
            if (studentId == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }

        input.close();
    }
}