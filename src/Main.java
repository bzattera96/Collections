import domain.Employee;
import domain.Palabra;
import service.AppCompany;
import service.Diccionario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final void main(String[] args) {

        /*
        ArrayList <Employee> employees = new ArrayList<>();

        employees.add(new Employee("Juan Carlos Perez", 30555687, 31));
        employees.add(new Employee("Ana Maria González", 21547896, 25));
        employees.add(new Employee("Mario Luis Fernandez", 19632587, 39));
        employees.add(new Employee("Lucia Victoria Rossi", 29874587, 22));
        employees.add(new Employee("Laila Lucero Blanco", 38652478, 27));
        employees.add(new Employee("Florencia Anabel Zattera", 36829183, 36));

        System.out.println("La cantidad de empleados que trabajan en la compañia es: " + employees.size());
        AppCompany.reportEmployeeData(employees);
        System.out.println("Los empleados menores de 30 años son: ");
        AppCompany.getFromEmployeesLessThanThirty(employees);
        */

        Diccionario diccionarioEspaniol = new Diccionario("Español");
        diccionarioEspaniol.registrarPalabra(new Palabra("Programación", "Acción y efecto programar", "Español"));
        diccionarioEspaniol.registrarPalabra(new Palabra("Saludo", "Acción y efecto de saludar", "Español"));
        diccionarioEspaniol.registrarPalabra(new Palabra("Abeja", "Insecto himenóptero", "Español"));
        diccionarioEspaniol.registrarPalabra(new Palabra("Programación", "Acción", "Español"));

        diccionarioEspaniol.buscarPalabra("Programación");
    }
}