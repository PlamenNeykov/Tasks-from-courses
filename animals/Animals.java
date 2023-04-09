package c_animals;

public class Animals {

    //name, an age, and a gender.

    private String name;
    private int age;
    private String gender;

    public Animals(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<0) {
            throw new IllegalArgumentException("Invalid input!");
        } else {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if (gender.equals("Male")||gender.equals("Female")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    String produceSound() {
        return null;
    }

    @Override
    public String toString() {
        String toPrint = String.format("%s%n%s %d %s%n%s",
                this.getClass().getSimpleName(),this.getName(),this.getAge(), this.getGender(),
                produceSound());
        return toPrint;
    }
}
