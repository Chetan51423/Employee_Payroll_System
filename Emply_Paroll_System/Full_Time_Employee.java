package Emply_Paroll_System;

public class Full_Time_Employee extends Employee
{
    private double monthlySalary;

    public Full_Time_Employee(String name, int id, double monthlySalary)
    {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary()
    {
        return monthlySalary;
    }
}
