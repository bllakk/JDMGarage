package com.LBWK.SystemLBWK.service;

import com.LBWK.SystemLBWK.model.Car;
import com.LBWK.SystemLBWK.model.Client;
import com.LBWK.SystemLBWK.model.Employee;
import com.LBWK.SystemLBWK.model.ProjectJDM;

import java.util.List;
import java.util.Scanner;

public class ProjectJdmService {
    public void registerProject(Scanner scanner, List<ProjectJDM> listProject, List<Client> listClients, List<Employee> listEmployee, Client foundClient, Employee foundEmployee) {
        System.out.println("Register project");
        System.out.println("--------------------");

        System.out.println("Enter name project: ");
        String projectName = scanner.nextLine();

        System.out.println("Enter id employee");
        int idEmployee = scanner.nextInt();

        for (Employee e : listEmployee){
            if (e.getId() == idEmployee){
                foundEmployee = e;
                break;
            }
        }

        System.out.println("Enter customer CPF: ");
        long searchCpf = Long.parseLong(scanner.nextLine());

        for (Client c : listClients){
            if (c.getCpf() == searchCpf){
                foundClient = c;
                break;
            }
        }

        if (foundClient != null){
            List<Car> foundClientCars = foundClient.getCars();

            if (foundClientCars.isEmpty()){
                System.out.println("This client has no registered cars.");
            } else {
                System.out.println("Select a car of the project");
                int indicator = 1;

                for (Car c : foundClientCars) {
                    System.out.println(indicator++ + ". " + c.getModel());
                }
                System.out.print("Enter the number of the car: ");
                int carIndex = scanner.nextInt();
                scanner.nextLine();

                if (carIndex >= 1 && carIndex <= foundClientCars.size()){
                    Car selectedCar = foundClientCars.get(carIndex - 1);
                    System.out.println(selectedCar + " - selected!");

                    ProjectJDM projectJDM = new ProjectJDM(projectName, selectedCar, null, foundEmployee, false);
                    listProject.add(projectJDM);

                } else {
                    System.out.println("Invalid car selection.");
                }
            }
        } else {
            System.out.println("Client not found.");
        }
    }
}
