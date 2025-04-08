import java.util.List;

public abstract class Car {
    private String brand;
    private String model;
    private int year;
    private Client owner;
    private List<Modification> modifications;

    public Car(String brand, String model, int year, Client owner, List<Modification> modifications) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.owner = owner;
        this.modifications = modifications;
    }

    public void addModification(Modification m){
        this.modifications.add(m);
    }
    public float calculateCost(){
        float totalCost = 0;
        for (Modification m : modifications){
            totalCost += m.getCost();
        }
        return totalCost;
    }
    
    abstract void technicalSheet();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Client getOwner() {
        return owner;
    }

    public List<Modification> getModifications() {
        return modifications;
    }

}
