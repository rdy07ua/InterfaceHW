public class Driver extends Person {

    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println(getName() + "can drive a car");
    }
}
