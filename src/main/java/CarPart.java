public class CarPart {
    String name;
    String type;
    boolean original;

    public CarPart(String name, String type, boolean original){
        this.name = name;
        this.type = type;
        this.original = original;
    }

    @Override
    public String toString() {
        return "Part name: " + name + ", part type: " + type + ", originality: " + original;
    }
}
