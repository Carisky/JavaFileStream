package utils.UserInput;

import Task5.CorporationSystem.Employee;
import utils.ConsoleColorOut.ConsoleColorOut;

import java.util.Scanner;

public class UserInput {
    public static int[] readIntArrayFromUser() {
        Scanner scanner = new Scanner(System.in);

        ConsoleColorOut.PURPLE("Write numbers (space-separated): ");
        String input = scanner.nextLine();

        String[] strNumbers = input.split("\\s+");
        int[] array = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            array[i] = Integer.parseInt(strNumbers[i]);
        }

        return array;
    }
    public static Employee EmployeeInput(){
        Scanner scanner = new Scanner(System.in);

        ConsoleColorOut.PURPLE("Write FirstName ");
        String FirstName = scanner.nextLine();

        ConsoleColorOut.GREEN("Write LastName ");
        String LastName = scanner.nextLine();

        ConsoleColorOut.YELLOW("Write Age ");
        int Age = scanner.nextInt();

        return new Employee(FirstName,LastName,Age);
    }

    public static String field(String fieldName){
        ConsoleColorOut.PURPLE("enter "+fieldName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
