package ua.rozborsky.interfaces;

import java.math.BigDecimal;

/**
 * Created by roman on 30.12.2016.
 */
public abstract class Employee {                                        //abstract class that extends by
                                                                        //FixedPaymentEmployee and HourlyWagedEmployee
    static int numberClasses = 0;

    protected int id;
    protected String name;
    protected BigDecimal monthlySalary;


    public Employee(String name) {
        numberClasses++;
        this.id = numberClasses;
        this.name = name;
    }

    public BigDecimal getMonthlySalary() {
        return monthlySalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void calculatingMonthlySalary(Double sallary);
}
