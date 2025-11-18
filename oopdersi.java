class Ders {
    private String ogretmen;
    private String odev;
    private int yaziliNotu;
    private int sozluNotu;

    public Ders(String ogretmen, String odev, int yaziliNotu, int sozluNotu){
        this.ogretmen = ogretmen;
        this.odev = odev;
        this.yaziliNotu = yaziliNotu;
        this.sozluNotu = sozluNotu;
    }

    public void ekranaYazdir() {
        System.out.println("Öğretmen: " + ogretmen);
        System.out.println("Ödev: " + odev);
        System.out.println("Yazılı Notu: " + yaziliNotu);
        System.out.println("Sözlü Notu: " + sozluNotu);
    }
}

class Main {
    void main() {
        Ders matematik = new Ders("Ahmet Hoca", "Yazı Ödevi", 95, 70);
        matematik.ekranaYazdir();
    }
}
