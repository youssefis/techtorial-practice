package mentringTasks;

import mapPractice.Employee;

public class EmployeeM {

    /*
    Create a class Employee which has three variables as age, title of job and salary.
    Then Employee class should have a method which takes Employee as a parameter and prints all info about Employee.
    Then create a EmployeePractice and create multiple employees from there and all info about each employee.
     */
    int age;
    String jobTitle;
    int salary;



    public EmployeeM(int age,String jobTitle,int salary){
        this.age=age;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }


    public String toString() {
        return "age: " + age + "\njobTitle: "+jobTitle+"\nsalary: "+salary;
    }


}
