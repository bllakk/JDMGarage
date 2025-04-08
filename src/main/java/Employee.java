import java.util.List;

public class Employee {
    private String name;
    private String position;
    private List<Modification> assignments;

    public void assignTask(Modification m){
        assignments.add(m);
    }

    public void listTasks(){
        for (Modification m : assignments) {
            System.out.println(m);
        }
    }

    public Employee(String name, String position, List<Modification> assignments) {
        this.name = name;
        this.position = position;
        this.assignments = assignments;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public List<Modification> getAssignments() {
        return assignments;
    }

}
