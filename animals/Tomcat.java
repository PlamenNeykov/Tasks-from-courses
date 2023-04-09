package c_animals;

public class Tomcat extends Cat{

    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    @Override
    String produceSound() {
        String tomcatSound = "MEOW";
        return tomcatSound;
    }
}
