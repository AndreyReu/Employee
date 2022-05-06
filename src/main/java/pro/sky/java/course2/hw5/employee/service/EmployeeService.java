package pro.sky.java.course2.hw5.employee.service;

import pro.sky.java.course2.hw5.employee.employee.Employee;

public class EmployeeService extends Employee {
    public EmployeeService(String firstName, String lastName) {
        super(firstName, lastName);
    }

    Employee[] employees = new Employee[]{
            new Employee("Ivan", "Ivanov"),
            new Employee("Maksim", "Galkin"),
            new Employee("Alla", "Pugacheva"),
            new Employee("Dmitriy", "Nagiev"),
            new Employee("Mihail", "Lermontov")
    };

    public void add(String firstName, String lastName) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee == null) {
                return;
            }
            {
                while (i < employees.length) {
                    if (employees[i] == null) {
                        employees[i] = employee;
                        return;
                    }
                    i++;
                }
            }
        }
    }

    public void remove(String firstName, String lastName) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                employees[i] = null;
            }
        }
    }

    public void find(String firstName, String lastName) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                System.out.println(employee.getFirstName() + employee.getLastName());
            }
        }
    }
}

