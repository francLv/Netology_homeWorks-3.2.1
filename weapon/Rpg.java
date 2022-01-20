package weapon;

public class Rpg extends Weapon {

    public Rpg(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println(this + "БУХ-БАБАХ!!!");
    }
}
