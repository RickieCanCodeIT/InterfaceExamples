public class Ostrich extends Bird implements  Walks {

    public Ostrich(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " gargles " + sound);
    }

    @Override
    public void walk() {
        System.out.println(name + " walks like an Ostrich");
    }

    @Override
    public void run() {
        System.out.println(name + " runs like an ostrich, probably faster than you");
    }
}
