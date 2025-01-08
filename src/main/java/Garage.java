import java.util.ArrayList;
import java.util.List;

public class Garage {
    String name;
    List<Car> listGarage;
    int maxCapacity;

    public Garage(String name, int maxCapacity){
        this.name = name;
        listGarage = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }
    public void addCar(Car car){
        listGarage.add(car);
    }

    public void removeCar(Car car){
        listGarage.remove(car);
    }

    public List<String> listCar(){
        List<String> info = new ArrayList<>();
        for (Car car : listGarage){
            info.add(car.carDescription());
        }
        return info;
    }
}
