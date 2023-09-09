package Emply_Paroll_System;
import java.util.*;
public class Payroll_System
{
    private ArrayList<Employee> employeeList;

    public Payroll_System()
    {
        employeeList = new ArrayList<>();
    }

    // add employee

    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }


    // remove employee
    public void removeEmployee(int id)
    {
        Employee employeetoremove = null;
        for(Employee employee:employeeList)
        {
            if(employee.getId()==id)
            {
                employeetoremove = employee;
                break;
            }
        }
        if(employeetoremove != null)
        {
            employeeList.remove(employeetoremove);
        }

    }

    // display employee

    public void displayEmployee()
    {
        for(Employee employee: employeeList)
        {
            System.out.println(employee);
        }
    }
}
