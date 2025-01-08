public class Modification {
    String type;
    String description;

    public Modification(String type, String description){
        this.type = type;
        this.description = description;
    }


    @Override
    public String toString() {
        return "Type modification: " + type + ", description: " + description;
    }
}
