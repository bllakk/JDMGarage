package com.LBWK.SystemLBWK.service;

import com.LBWK.SystemLBWK.model.Car;
import com.LBWK.SystemLBWK.model.Client;
import com.LBWK.SystemLBWK.model.ProjectJDM;

import java.util.List;
import java.util.Scanner;

public class ProjectJdmService {
    public void registerProject(Scanner scanner, List<ProjectJDM> listProject, List<Client> listClients, Client foundClient){
        System.out.println("Register project");
        System.out.println("--------------------");

        System.out.println("Enter name project: ");
        String projectName = scanner.nextLine();

        long searchCpf = Long.parseLong(scanner.nextLine());
        System.out.println("Enter customer CPF: ");

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

                for (Car c : foundClientCars){
                    System.out.println(indicator++ + ". " + c.getModel());
                }
            }
        }



        System.out.println("Enter name project: ");
    }
}
