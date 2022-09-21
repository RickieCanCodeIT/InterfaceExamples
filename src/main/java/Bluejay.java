public class Bluejay extends Bird implements Flying {

    public Bluejay(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says " + sound);
    }

    @Override
    public void fly() {
        System.out.println(name + " soars like a Bluejay!");
    }
}
