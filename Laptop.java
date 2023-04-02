package demo;

public class Laptop implements Machine{
    @Override
    public void getType() {
        System.out.println("Machine type is Laptop");
    }

    @Override
    public void getPrice() {
        System.out.println("Machine price is a 95000");
    }
}
