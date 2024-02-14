public class Main {
    public static void main(String[] args) {
        Dog[] dog = new Dog[3];
        dog[0] = createObject("AverageDog");
        dog[1] = createObject("OlderDog");
        dog[2] = createObject("DogJr");

        Printable[] dogs = {dog[0], dog[1], dog[2]};

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].print();
        }
    }

    public static Dog createObject(String className) {

        Dog obj = null;

        switch (className) {
            case "AverageDog":
                obj = new AverageDog(8, " Rex", " labrador");
                break;

            case "DogJr":
                obj = new DogJr(12, " Alex", " Buldog");
                break;

            case "OlderDog":
                obj = new OlderDog(10, " Miko", " Buldog");
                break;
        }
        return obj;
    }
}