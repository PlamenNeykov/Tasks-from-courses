package c_animals;

public class Cat extends Animals{
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    String produceSound() {
        String catSound = "Meow meow";
        return catSound;
    }
}
