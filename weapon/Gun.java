package weapon;

public class Gun extends Weapon {

    public Gun(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println(this + " ПИФ-ПАФ");
    }
}
