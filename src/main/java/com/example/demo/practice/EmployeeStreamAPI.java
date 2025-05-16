package com.example.demo.practice;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamAPI {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "Alice", "HR", 5000.0),
                new Employee(2, "Bob", "IT", 7000.0),
                new Employee(3, "Charlie", "Finance", 6000.0),
                new Employee(4, "David", "HR", 4000.0),
                new Employee(5, "Eve", "IT", 8000.0),
                new Employee(6, "Frank", "Finance", 5500.0));
        Map<String, Optional<Employee>> empWithHighSal = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(empWithHighSal);
        double avgSalry = employeeList.stream().map(Employee::getSalary).mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println("The average salary of all the employee is : "+avgSalry);
        List<Employee> empsAbvAvgsal = employeeList.stream().filter(s -> s.getSalary() >= avgSalry).toList();
        System.out.println(empsAbvAvgsal);
        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println();

    }
}
