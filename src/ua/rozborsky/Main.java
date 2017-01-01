package ua.rozborsky;

import ua.rozborsky.classes.EmployeesManager;
import ua.rozborsky.classes.FileManager;
import ua.rozborsky.classes.View;

import java.util.List;

/**
 * Created by roman on 30.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        EmployeesManager manager = new EmployeesManager();              //class that added employees return a list
                                                                        //and sorts them, depending on salary
        manager.addFixedPaymentEmployee("Hoffmann", 25000);
        manager.addFixedPaymentEmployee("Pitt", 20000);
        manager.addFixedPaymentEmployee("Norton", 10000);
        manager.addFixedPaymentEmployee("Drummer", 7000);
        manager.addFixedPaymentEmployee("Bush", 5000);
        manager.addFixedPaymentEmployee("Jetro", 4000);
        manager.addFixedPaymentEmployee("Murphy", 15000);
        manager.addFixedPaymentEmployee("Lewis", 10000);
        manager.addFixedPaymentEmployee("Jones", 4000);
        manager.addFixedPaymentEmployee("Chimino", 5000);
        manager.addFixedPaymentEmployee("Spielberg", 3000);
        manager.addHourlyWagedEmployee("Tesla", 30);
        manager.addHourlyWagedEmployee("Walberg", 30);
        manager.addHourlyWagedEmployee("Nilsen", 30);
        manager.addHourlyWagedEmployee("Strip", 35);

        List employees = manager.getEmployees();

        View view = new View();                                         //class that displays a list of employees
        view.showEmployees(employees);

        manager.sortEmployees();
        view.showEmployees(employees);

        view.showFirstEmployees(employees, 5);
        view.showLastEmployeesId(employees, 4);

        FileManager fileManager = new FileManager("employees");         //class that writes data to a file
        fileManager.createFile();                                       //and receives information about employees from file
        fileManager.writeInFile(employees);
        fileManager.getEmployeesFromFile();
    }
}
