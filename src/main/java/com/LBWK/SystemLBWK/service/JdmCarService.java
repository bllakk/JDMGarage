package com.LBWK.SystemLBWK.service;

import com.LBWK.SystemLBWK.model.Client;
import com.LBWK.SystemLBWK.model.JdmCar;

import java.util.List;
import java.util.Scanner;

public class JdmCarService {
    public void registerJdmCar(Scanner scanner, List<JdmCar> listCars, List<Client> listClients, Client foundClient){
        System.out.println("Register a new car");
        System.out.println("--------------------");

        System.out.println("Enter brand car: ");
        String brand = scanner.nextLine();

        System.out.println("Enter model car: ");
        String model = scanner.nextLine();

        System.out.println("Enter year car: ");
        int year = scanner.nextInt();

        System.out.println("Enter customer CPF: ");
        long searchCpf = Long.parseLong(scanner.nextLine());
        for (Client c : listClients){
            if (c.getCpf() == searchCpf){
                foundClient = c;
                break;
            }
        }

        System.out.println("Enter country origin: ");
        String countryOrigin = scanner.nextLine();

        JdmCar Car = new JdmCar(brand, model, year, foundClient, null, countryOrigin, false);

        if (foundClient != null) {
            System.out.println("Client found: " + foundClient);
            foundClient.addCar(Car);
        } else {
            System.out.println("Client not found.");
        }

        listCars.add(Car);
        System.out.println("Car registered successfully!");
    }
}
