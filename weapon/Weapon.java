package weapon;

public class Weapon {
    private final String name;

    public Weapon(String name) {
        this.name = name;
    }

    public void shoot() {
        System.out.println(this + "просто ОГОНЬ!");
    }

    @Override
    public String toString() {
        return "Это ОРУЖИЕ " + name + " ";
    }
}
