package service;

import domain.Employee;
import java.util.ArrayList;
import java.util.List;

public class AppCompany {
    public static void reportEmployeeData(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }
    }
    public static List getFromEmployeesLessThanThirty(ArrayList<Employee> employees) {
        ArrayList <Employee> variable = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() < 30) {
                variable.add(employees.get(i));
                System.out.println(employees.get(i).toString());
            }
        }
        return variable;
    }
}