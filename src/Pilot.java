public class Pilot  extends Person {

    public Pilot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + "can fly on a plane");
    }
}
