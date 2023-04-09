package c_animals;

public class Dog extends Animals{
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    String produceSound() {
        String dogSound = "Woof!";
        return dogSound;
    }
}
