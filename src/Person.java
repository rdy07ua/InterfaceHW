public class Person implements Driving, Flying {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void drive() {

    }

    @Override
    public void fly() {

    }


    interface Driving {
        void drive();
    }

    interface Flying {
        void fly();
    }
}
