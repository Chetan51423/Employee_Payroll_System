package Emply_Paroll_System;

public class Part_Time_Employee extends Employee
{
    private int hoursWork;
    private double hourlyRate;

    public Part_Time_Employee(String name, int id, int hoursWork, double hourlyRate)
    {
        super(name, id);
        this.hoursWork = hoursWork;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary()
    {
        return (hoursWork)*(hourlyRate);
    }
}
