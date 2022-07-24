package service;

import domain.Employee;
import java.util.ArrayList;
import java.util.List;

public class AppCompany {
    public static void reportEmployeeData(List<Employee> employees) {
        //lo dejo como List el parametro así puedo usar cualquiera
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }
    }

    //podríamos solo hacer sout(employees); que ya es un for de toStrings

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