package c_animals;

public class Frog extends Animals{
    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }



    @Override
    String produceSound() {
        String frogSound = "Ribbit";
        return frogSound;
    }
}
