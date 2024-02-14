public class OlderDog extends Dog {
    public OlderDog(int age, String name, String breed) {
        super(age, name, breed);
    }


    @Override
    public void print() {
        System.out.println("Age: " + getAge() + "\nName" + getName() + "\nBreed" + getBreed());
    }
}
