package weapon;

public class WaterGun extends Weapon {

    public WaterGun(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println(this + "Сик Сик");
    }
}
