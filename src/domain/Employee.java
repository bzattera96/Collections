package domain;

import java.util.Objects;

public class Employee {
    private String name;
    private long dni;
    private int age;

    public Employee(String name, long dni, int age) {
        this.name = name;
        this.dni = dni;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Empleado: " + name + ", DNI: " + dni + ", Age : " + age + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getDni() == employee.getDni() && getAge() == employee.getAge() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDni(), getAge());
    }
}

