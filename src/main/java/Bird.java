public abstract class Bird {
    protected String name;
    protected String sound;

    public Bird(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public abstract void makeSound();
}
