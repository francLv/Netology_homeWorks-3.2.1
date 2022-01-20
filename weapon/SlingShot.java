package weapon;

public class SlingShot extends Weapon {

    public SlingShot(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println(this + "ПИУУУУУУУ");
    }
}
