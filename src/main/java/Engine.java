public class Engine {
    String type;
    int power;

    public Engine(String type,int power){
        this.type = type;
        this.power = power;
    }

    public String engineDescription() {
        return "Type of engine: " + type + ", power: " + power;
    }
}
