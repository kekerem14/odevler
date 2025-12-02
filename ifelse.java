public class Main {
    public static void main(String[] args) {
        double sinav1 = 70; // 1. sınav puanı
        double sinav2 = 80; // 2. sınav puanı

        double ortalama = sinav1 * 0.4 + sinav2 * 0.6;

        if (ortalama >= 75) System.out.println("Geçti");
        else {
            System.out.println("Kaldı");
        }
    }
}
