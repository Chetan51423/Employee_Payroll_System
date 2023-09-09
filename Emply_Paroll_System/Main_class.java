package Emply_Paroll_System;

public class Main_class {
    public static void main(String[] args) {
        Payroll_System payrollSystem = new Payroll_System();

        Full_Time_Employee emp1= new Full_Time_Employee("Chetan", 1, 100000.0);
        Part_Time_Employee emp2= new Part_Time_Employee("Ganesh", 2, 100, 1000.0);
        Full_Time_Employee emp3= new Full_Time_Employee("Ram", 3, 100000.0);
        Full_Time_Employee emp4= new Full_Time_Employee("Shyam", 4, 100000.0);
        Full_Time_Employee emp5= new Full_Time_Employee("Suresh", 5, 100000.0);
        Full_Time_Employee emp6= new Full_Time_Employee("Ramesh", 6, 100000.0);
        Full_Time_Employee emp7= new Full_Time_Employee("laxman", 7, 100000.0);



        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        payrollSystem.addEmployee(emp4);
        payrollSystem.addEmployee(emp5);
        payrollSystem.addEmployee(emp6);
        payrollSystem.addEmployee(emp7);

        payrollSystem.displayEmployee();
    }
}
