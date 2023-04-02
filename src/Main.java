import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Cat", "black", "Bob", 10));
        pets.add(new Pet("Dog", "grey", "Chip", 1));
        pets.add(new Pet("Cat", "black", "Bob", 7));
        pets.add(new Pet("Dog", "grey", "Chip", 1));
        pets.add(new Pet("Cat", "black", "Bob", 8));
        pets.add(new Pet("Dog", "grey", "Chip", 1));
        pets.add(new Pet("Parrot", "Yellow", "Chack", 2));
        pets.add(new Pet("Parrot", "Yellow", "Chack", 2));
        pets.add(new Pet("Parrot", "Yellow", "Chack", 2));

        ArrayList<Pet> dogs = new ArrayList<>();
        ArrayList<Pet> cats = new ArrayList<>();

        pets.removeIf(p -> p.getKind().contains("Parrot"));

        for (Iterator<Pet> iterator = pets.iterator(); iterator.hasNext(); ) {
            Pet p = iterator.next();
            if (p.getKind().contains("Cat")) {
                cats.add(p);
            } else {
                dogs.add(p);
            }
        }
        double abv = 0;
        int ages = 0;

        for (Pet p : cats) {
            ages += p.getAge();
            abv = (double) ages / cats.size();
        }
        System.out.println(pets);
        System.out.println(cats);
        System.out.println(dogs);
        System.out.println(abv);
    }
}