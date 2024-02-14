public class AverageDog extends Dog{
    public AverageDog(int age, String name, String breed) {
        super(age, name, breed);
    }

    @Override
    public void print() {
        System.out.println("Age: " + getAge() + "\nName" + getName() + "\nBreed" + getBreed());
    }
}
