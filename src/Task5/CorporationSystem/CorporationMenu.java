package Task5.CorporationSystem;

import utils.ConsoleColorOut.ConsoleColorOut;
import utils.UserInput.UserInput;
public class CorporationMenu {
    private CorporationSystem corporationSystem;

    public CorporationMenu(CorporationSystem corporationSystem) {
        this.corporationSystem = corporationSystem;
    }

    public void displayMenu() {
        while (true) {
            ConsoleColorOut.GREEN("===== Corporation System Menu =====");
            ConsoleColorOut.YELLOW("1. Add Employee");
            ConsoleColorOut.YELLOW("2. Edit Employee");
            ConsoleColorOut.YELLOW("3. Delete Employee");
            ConsoleColorOut.YELLOW("4. Find Employee by Last Name");
            ConsoleColorOut.YELLOW("5. Display All Employees");
            ConsoleColorOut.YELLOW("6. Exit");

            int choice = UserInput.getUserInt();

            switch (choice) {
                case 1:
                    corporationSystem.addEmployee();
                    corporationSystem.saveEmployeesToFile();
                    break;
                case 2:
                    editEmployeeMenu();
                    break;
                case 3:
                    deleteEmployeeMenu();
                    break;
                case 4:
                    findEmployeeMenu();
                    break;
                case 5:
                    corporationSystem.displayAllEmployees();
                    break;
                case 6:
                    corporationSystem.saveEmployeesToFile();
                    ConsoleColorOut.GREEN("Exiting the Corporation System. Goodbye!");
                    System.exit(0);
                default:
                    ConsoleColorOut.RED("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void editEmployeeMenu() {
        String lastName = UserInput.field("Enter Last Name of the employee to edit: ");
        Employee updatedEmployee = UserInput.EmployeeInput();
        corporationSystem.editEmployee(lastName, updatedEmployee);
    }

    private void deleteEmployeeMenu() {
        String lastName = UserInput.field("Enter Last Name of the employee to delete: ");
        corporationSystem.deleteEmployee(lastName);
    }

    private void findEmployeeMenu() {
        Employee foundEmployee = corporationSystem.findEmployeeByLastName();
        if (foundEmployee != null) {
            ConsoleColorOut.BLUE("Employee found:\n" + foundEmployee.toString());
        } else {
            ConsoleColorOut.RED("Employee not found.");
        }
    }
}

