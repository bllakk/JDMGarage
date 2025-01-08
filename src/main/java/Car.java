import java.util.ArrayList;
import java.util.List;

public class Car {
    String carModel;
    String carManufacturer;
    int year;
    List<Modification> listModification;
    List<CarPart> listPart;
    Engine engine;

    public Car(String carModel, String carManufacturer, int year, Engine engine){
        this.carModel = carModel;
        this.carManufacturer = carManufacturer;
        this.year = year;
        this.listModification = new ArrayList<>();
        this.listPart = new ArrayList<>();
        this.engine = engine;
    }

    public void addPart(CarPart part){
        listPart.add(part);
    }

    public void removePart(CarPart part){
        listPart.remove(part);
    }

    public void addModification(Modification modification){
        listModification.add(modification);
    }

    public void removeModification(Modification modification){
        listModification.remove(modification);
    }

    public String getDescription(){
        return "Car model: " + carModel + ", manufacturer: " + carManufacturer + ", year: " + year + ", engine: " + engine.getDescription() + ", mods list: " + listModification + ", parts: " + listPart;
    }
}
