package com.LBWK.SystemLBWK.service;

import com.LBWK.SystemLBWK.model.Client;

import java.util.Scanner;
import java.util.List;


public class ClientService {
    public void registerClient(Scanner scanner, List<Client> listClients){
        System.out.println("Register a new user");
        System.out.println("--------------------");
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer CPF (only numbers): ");
        long cpf = Long.parseLong(scanner.nextLine());

        System.out.print("Enter customer nationality: ");
        String nationality = scanner.nextLine();

        Client client = new Client(name, cpf, nationality, null);
        listClients.add(client);

        System.out.println("Client registered successfully!");
    }
}
