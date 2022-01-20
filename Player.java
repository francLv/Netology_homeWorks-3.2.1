import weapon.*;

public class Player {

    private final Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Weapon("как ВИД"),
                new Gun("Пистолет"),
                new MachineGun("Автомат"),
                new Rpg("РПГ"),
                new SlingShot("Рогатка"),
                new WaterGun("Водный пистолет")
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    void shotWithWeapon(int slot) {
        if (slot > Main.end && slot < getSlotsCount()) {
            Weapon weapon = weaponSlots[slot];
            weapon.shoot();
        } else
            System.out.println("Такого слота нет, введите от 0 до " + (getSlotsCount() - 1) + ":");
    }
}