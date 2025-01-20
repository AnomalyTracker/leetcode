package org.example.leetcode.ArrayCodeProblems;


public class Employee {
    private long salary;
    private String department;

    public Employee(long salary, String department) {
        this.salary = salary;
        this.department = department;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
