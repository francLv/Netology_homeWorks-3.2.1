package weapon;

public class MachineGun extends Weapon {

    public MachineGun(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println(this + "ТРА-ТА-ТА");
    }
}
