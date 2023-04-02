package demo;

public class Ac implements Machine{
    @Override
    public void getType() {
        System.out.println("Machine type is AC");
    }

    @Override
    public void getPrice() {
        System.out.println("Machine price is a 75000");
    }
}
