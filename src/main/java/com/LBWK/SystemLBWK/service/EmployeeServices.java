package com.LBWK.SystemLBWK.service;

import com.LBWK.SystemLBWK.model.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeServices {
    public void EmployeeMenu(){

    }
    public void registerEmployee(Scanner scanner, List<Employee> listEmployee){
        System.out.println("Register a new Employee");
        System.out.println("--------------------");

        System.out.print("Enter employee id: ");
        int id = scanner.nextInt();

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee position: ");
        String position = scanner.nextLine();

        Employee employee = new Employee(id, name, position, null);
        listEmployee.add(employee);

        System.out.println("Client registered successfully!");
    }
}
