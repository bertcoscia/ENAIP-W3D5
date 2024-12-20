package aalbertocoscia.stream.entities;

import aalbertocoscia.stream.enums.Genre;

public class Employee {
    private static Integer idCounter = 0;
    private Integer id;
    private String name;
    private String surname;
    private Genre genere;
    private Double salary;

    public Employee(String name, String surname, Genre genere, Double salary) {
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
        this.genere = genere;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Genre getGenere() {
        return genere;
    }

    public void setGenere(Genre genere) {
        this.genere = genere;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", genere=" + genere +
                ", salary=" + salary +
                '}';
    }

    public String getInfo() {
        return "Employee " + this.id + " " + name + " " + surname + " (" + genere + ", " + salary + ")";
    }
}
