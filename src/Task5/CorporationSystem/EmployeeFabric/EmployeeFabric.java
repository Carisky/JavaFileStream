package Task5.CorporationSystem.EmployeeFabric;

import Task5.CorporationSystem.Employee;
import Task5.CorporationSystem.EmployeeFabric.enums.FirstName;
import Task5.CorporationSystem.EmployeeFabric.enums.LastName;

import java.util.Random;

public class EmployeeFabric {
    private static final FirstName[] FIRST_NAMES = FirstName.values();
    private static final LastName[] LAST_NAMES = LastName.values();
    private static final Random RANDOM = new Random();

    public static Employee createRandomEmployee() {
        FirstName randomFirstName = FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)];
        LastName randomLastName = LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)];

        return new Employee(randomFirstName.toString(), randomLastName.toString(), getRandomAge());
    }

    private static int getRandomAge() {
        return 20 + RANDOM.nextInt(41);
    }
}
