package mentringTasks;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMPractice {

    public static void main(String[] args) {



    EmployeeM employeeM1=new EmployeeM(34,"nurse",44000);
    EmployeeM employeeM2=new EmployeeM(28,"taxi driver",90000);
    EmployeeM employeeM3=new EmployeeM(29,"developer",30000);

    List<EmployeeM> employees=new ArrayList<>();
    employees.add(employeeM1);
    employees.add(employeeM2);
    employees.add(employeeM3);

    for (EmployeeM employee :employees){

        System.out.println(employee);
        System.out.println();

    }


    }

}
