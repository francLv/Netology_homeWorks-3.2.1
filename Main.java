import java.util.Scanner;

public class Main {
    
    public static final int end = -1;

    public static void main(String[] args) {
        int slot;
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти:%n",
                player.getSlotsCount());
        do {
            slot = scanner.nextInt();
            player.shotWithWeapon(slot);
        } while (slot != end);
        System.out.println("GAME OVER!");
    }
}