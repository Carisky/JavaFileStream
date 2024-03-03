package Task5;

import Task5.CorporationSystem.CorporationMenu;
import Task5.CorporationSystem.CorporationSystem;
import Task5.CorporationSystem.EmployeeFabric.EmployeeFabric;
import TestFiles.FilePaths;

public class Task5Main {
    public static void main(String[] args) {
        CorporationSystem system = new CorporationSystem(FilePaths.getCorporationSystemEmploesStorage().getFilePath());

        if (system.isSystemEmpty()){
            for (int i = 0; i < 10; i++) {
                system.addEmployee(EmployeeFabric.createRandomEmployee());
            }
        }
        CorporationMenu Menu = new CorporationMenu(system);
        Menu.displayMenu();
    }
}
