package com.LBWK.SystemLBWK;

import com.LBWK.SystemLBWK.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        List<Client> listClients = new ArrayList<>();
        List<JdmCar> listCars = new ArrayList<>();
        List<Employee> listEmployee = new ArrayList<>();
        List<ProjectJDM> listProject = new ArrayList<>();

        Client foundClient = null;

        while (option != 0) {
            System.out.println("Welcome to the SystemLBWK");
            System.out.println("Select the desired menu");
            System.out.println("1. Client");
            System.out.println("2. Car");
            System.out.println("3. Employee");
            System.out.println("4. Projects");
            System.out.println("5. Modifications");
            System.out.println("6. Storage");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 0:
                    System.out.println("Exiting system. Bye!");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }

        scanner.close();
    }
}
