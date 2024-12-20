package aalbertocoscia;


import aalbertocoscia.stream.entities.Employee;
import aalbertocoscia.stream.enums.Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Employee imp1 = new Employee("Luca", "Rossi", Genre.M, 2500.00);
        Employee imp2 = new Employee("Anna", "Bianchi", Genre.F, 3200.00);
        Employee imp3 = new Employee("Marco", "Verdi", Genre.M, 2800.00);
        Employee imp4 = new Employee("Chiara", "Gialli", Genre.F, 3000.00);
        Employee imp5 = new Employee("Giovanni", "Neri", Genre.M, 3500.00);

        List<Employee> employees = new ArrayList<>();
        employees.add(imp1);
        employees.add(imp2);
        employees.add(imp3);
        employees.add(imp4);
        employees.add(imp5);

        List<Employee> maleEmployees = employees.stream()
                .filter(employee -> employee.getGenere().equals(Genre.M))
                .toList();
        maleEmployees.forEach(System.out::println);

        Set<Employee> femaleEmployees = employees.stream()
                .filter(employee -> employee.getGenere().equals(Genre.F))
                .collect(Collectors.toSet());
        femaleEmployees.forEach(System.out::println);

        String allEmployees = employees.stream()
                .map(Employee::getInfo)
                .collect(Collectors.joining(", "));
        System.out.println(allEmployees);
    }
}