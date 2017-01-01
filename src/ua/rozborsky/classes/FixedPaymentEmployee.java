package ua.rozborsky.classes;

import ua.rozborsky.interfaces.Employee;

import java.math.BigDecimal;

/**
 * Created by roman on 30.12.2016.
 */
public class FixedPaymentEmployee extends Employee {                //class that describes employees with fixed payment

    public FixedPaymentEmployee(String name) {
        super(name);
    }

    @Override
    public void calculatingMonthlySalary(Double fixedSallary) {
        monthlySalary = new BigDecimal(fixedSallary.toString());
    }
}
