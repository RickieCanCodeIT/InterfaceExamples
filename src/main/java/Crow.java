public class Crow extends Bird implements Flying, Walks{

    public Crow(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void fly() {
        System.out.println(name + " flies like a crow!");
    }

    @Override
    public void walk() {
        System.out.println(name + " walks like a crow!");
    }

    @Override
    public void run() {
        System.out.println(name + " runs like a crow, but slowly");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " screeches " + sound);
    }
}
