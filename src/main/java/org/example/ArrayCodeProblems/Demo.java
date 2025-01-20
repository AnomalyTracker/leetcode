package org.example.leetcode.ArrayCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(100,"dept1");
        Employee emp2 = new Employee(200,"dept2");
        Employee emp3 = new Employee(300,"dept1");
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        Map<String, List<Employee>> collect = employees.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).collect(Collectors.groupingBy(Employee::getDepartment));

        collect.forEach((dept,empList)->
        empList.forEach(emp-> System.out.println(emp+" ")));
    }
}
