public class Pet {
    private String kind, colour, name;
    private int age;

    public Pet(String kind, String colour, String name, int age) {
        this.kind = kind;
        this.colour = colour;
        this.name = name;
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet " +
                "kind='" + kind + '\'' +
                ", name='" + name;
    }
}
