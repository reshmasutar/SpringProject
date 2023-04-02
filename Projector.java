package demo;

public class Projector implements Machine{
    @Override
    public void getType() {
        System.out.println("Machine type is a Projector");
    }

    @Override
    public void getPrice() {
        System.out.println("Machine price is a 25000");

    }
}
