package com.LBWK.SystemLBWK.model;

import java.util.List;

public class JdmCar extends Car{
    private String countryOrigin;
    private boolean legalized;


    public JdmCar( String brand, String model, int year, Client owner, List<Modification> modifications, String countryOrigin, boolean legalized) {
        super(brand, model, year, owner, modifications);
        this.countryOrigin = countryOrigin;
        this.legalized = legalized;
    }

    @Override
    void technicalSheet() {
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        System.out.println("Year: " + this.getYear());
        System.out.println("Owner: " + this.getOwner().getName());
        System.out.println("Country of Origin: " + this.countryOrigin);
        System.out.println("Legalized: " + (this.legalized ? "Yes" : "No"));
        System.out.println("Modifications: ");
        for (Modification m : this.getModifications()){
            System.out.println("- " + m.getName() + ": $" + m.getCost());
        }
    }
}
