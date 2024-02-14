public class Dog implements Printable{

    private int age;
    private String name;
    private String breed;

    public Dog(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void print() {

    }
}
