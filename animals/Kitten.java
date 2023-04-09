package c_animals;

public class Kitten extends Cat{
    public Kitten(String name, int age) {
        super(name, age, "Female" );
    }

    @Override
    String produceSound() {
        String kittenSound = "Meow";
        return kittenSound;
    }
}
