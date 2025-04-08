import java.util.List;

public class Client {
    private String name;
    private String cpf;
    private String nationality;
    private List<Car> cars;

    public Client(String name, String cpf, String nationality, List<Car> cars) {
        this.name = name;
        this.cpf = cpf;
        this.nationality = nationality;
        this.cars = cars;
    }

    public void addCar(Car car){
        this.cars.add(car);
    }
    public void listCars(){
        for (Car c : cars){
            System.out.println("Car: " + c.getBrand() + " " + c.getModel() + " " + c.getYear());
        }
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNationality() {
        return nationality;
    }

    public List<Car> getCars() {
        return cars;
    }
}
