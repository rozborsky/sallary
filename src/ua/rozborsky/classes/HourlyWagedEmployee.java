package ua.rozborsky.classes;

import ua.rozborsky.interfaces.Employee;

import java.math.BigDecimal;

/**
 * Created by roman on 30.12.2016.
 */
public class HourlyWagedEmployee extends Employee{                      //class that describes employee with hourly wage
    public HourlyWagedEmployee(String name) {
        super(name);
    }

    @Override
    public void calculatingMonthlySalary(Double hourlyRate) {
        monthlySalary = new BigDecimal(20.8 + "").multiply(new BigDecimal(8 + ""))
                .multiply(new BigDecimal(hourlyRate.toString()));
    }
}
