public class Animal implements Comparable<Animal>{
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal " +
                "name='" + name;
    }

    @Override
    public int compareTo(Animal o) {
        return name.compareTo(o.getName());
    }
}
