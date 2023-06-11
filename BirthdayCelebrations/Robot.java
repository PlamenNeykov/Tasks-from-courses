package d_Person;

public class Robot implements Identifiable {
    private String id;
    private String model;


    public Robot (String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getID() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }
}
