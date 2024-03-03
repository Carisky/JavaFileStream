package Task5.CorporationSystem;

import java.util.ArrayList;
import java.util.List;

import CustomFileWriter.CustomFileWriter;
import FileReader.FileReader;
import utils.ConsoleColorOut.ConsoleColorOut;
import utils.UserInput.UserInput;

public class CorporationSystem {
    private List<Employee> employees;
    private String filePath;

    public CorporationSystem(String filePath) {
        this.filePath = filePath;
        this.employees = loadEmployeesFromFile();
    }

    private List<Employee> loadEmployeesFromFile() {
        List<Employee> loadedEmployees = new ArrayList<>();
        List<String> lines = FileReader.FileGetLines(filePath);

        if (lines != null) {
            for (String line : lines) {
                String[] fields = line.split(" ");
                loadedEmployees.add(new Employee(fields[0],fields[1],Integer.parseInt(fields[2])));
            }
        }

        return loadedEmployees;
    }

    public void saveEmployeesToFile() {
        StringBuilder employeesString = new StringBuilder();
        for(Employee employee : employees){
            employeesString.append(employee);
        }
        CustomFileWriter.writeStringToFile(filePath, employeesString.toString());
    }

    public boolean isSystemEmpty(){
        return employees.isEmpty();
    }

    public void addEmployee() {
        employees.add(UserInput.EmployeeInput());
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void editEmployee(String lastName, Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getLastName().equalsIgnoreCase(lastName)) {
                employees.set(i, updatedEmployee);
                saveEmployeesToFile();
                return;
            }
        }
        ConsoleColorOut.RED("Employee with last name '" + lastName + "' not found.");
    }

    public void deleteEmployee(String lastName) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getLastName().equalsIgnoreCase(lastName)) {
                // Нашли сотрудника, удаляем его из списка
                employees.remove(i);
                saveEmployeesToFile(); // Сохраняем изменения в файл
                return; // Можно выйти из метода, если сотрудник найден и удален
            }
        }
        ConsoleColorOut.RED("Employee with last name '" + lastName + "' not found.");
    }

    public Employee findEmployeeByLastName() {
        String LastName = UserInput.field("Last Name ");
        for (Employee employee : employees) {
            if (employee.getLastName().equalsIgnoreCase(LastName)) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getEmployeesByAge(int age) {
        // Get a list of employees with the specified age
        return null;
    }

    public List<Employee> getEmployeesByLastNamePrefix(char prefix) {
        // Get a list of employees whose last names start with the specified prefix
        return null;
    }

    public void displayAllEmployees() {
        for(Employee employee : employees){
            ConsoleColorOut.BLUE(employee.toString());
        }
    }
}
