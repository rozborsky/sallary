package ua.rozborsky.classes;

import ua.rozborsky.interfaces.Employee;

import java.util.List;

/**
 * Created by roman on 31.12.2016.
 */
public class View {

    public void showEmployees(List employees){
        System.out.println("id\t\tname\t\t\tmonthly salary");
        System.out.println("----------------------------------");
        for (int i = 0; i < employees.size(); i++) {
            String row = ((Employee)(employees.get(i))).getId() + "\t\t" + ((Employee)(employees.get(i))).getName();
            int lengthWordInTabs = (((Employee)(employees.get(i))).getName().length()) / 4;

            for (int j = 0; j < 5 - lengthWordInTabs; j++) {
                row += "\t";
            }
            row += ((Employee)(employees.get(i))).getMonthlySalary();
            System.out.println(row);
        }
        System.out.println("----------------------------------\n");
    }

    public void showFirstEmployees (List employees, int number) {
        System.out.println("id\t\tname\t\t\tmonthly salary");
        System.out.println("----------------------------------");
        for (int i = 0; i < number; i++) {
            String row = ((Employee)(employees.get(i))).getId() + "\t\t" + ((Employee)(employees.get(i))).getName();
            int lengthWordInTabs = (((Employee)(employees.get(i))).getName().length()) / 4;

            for (int j = 0; j < 5 - lengthWordInTabs; j++) {
                row += "\t";
            }
            row += ((Employee)(employees.get(i))).getMonthlySalary();
            System.out.println(row);
        }
        System.out.println("----------------------------------\n");
    }

    public void showLastEmployeesId (List employees, int number) {
        System.out.println("id");
        System.out.println("----");

        for (int i = employees.size() - number; i < employees.size(); i++) {
            System.out.println(((Employee) (employees.get(i))).getId());
        }
        System.out.println("----\n");
    }
}