import java.util.ArrayList;

public class InterfaceExample {

    public static void main(String[] args) {
        Bird bird1 = new Bluejay("Ralph", "Caww!");
        Bird bird2 = new Ostrich("Nick", "Screeee!");
        Bird bird3 = new Crow("Matthew", "Talks");

        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);

        for (Bird currentBird : birds) {
            //instnaceof using interface
            if (currentBird instanceof Flying) {
                ((Flying)currentBird).fly();
            }
            if (currentBird instanceof Walks) {
                ((Walks)currentBird).walk();
                ((Walks)currentBird).run();
            }
            //instanceof using class
            if (currentBird instanceof Bluejay) {
                ((Bluejay)currentBird).fly();
            }
            if (currentBird instanceof Ostrich) {
                ((Ostrich)currentBird).walk();
                ((Ostrich)currentBird).run();
            }

            currentBird.makeSound();
        }
    }
}
