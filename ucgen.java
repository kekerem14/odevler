import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Üçgenin kenarlarını girin: ");
        double x = girdi.nextDouble();
        double y = girdi.nextDouble();
        double z = girdi.nextDouble();

        double cevre = x + y + z;
        double alan = Math.sqrt((cevre/2) * (cevre/2 - x) * (cevre/2 - y) * (cevre/2 - z));

        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }
}
