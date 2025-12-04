class Ders {
    private String ogretmen;
    private String odev;
    private int yaziliNotu;
    private int sozluNotu;
    private String olduguGunler;

    public Ders(String ogretmen, String odev, int yaziliNotu, int sozluNotu, String olduguGunler){
        this.ogretmen = ogretmen;
        this.odev = odev;
        this.yaziliNotu = yaziliNotu;
        this.sozluNotu = sozluNotu;
        this.olduguGunler = olduguGunler;
    }

    public void ekranaYazdir() {
        System.out.println("Öğretmen: " + ogretmen);
        System.out.println("Ödev: " + odev);
        System.out.println("Yazılı Notu: " + yaziliNotu);
        System.out.println("Sözlü Notu: " + sozluNotu);
        System.out.println("Dersin olduğu günler: " + olduguGunler);
    }
}

class Main {
    void main() {
        Ders matematik;
        matematik = new Ders("Ahmet Hoca", "Yazı Ödevi", 95, 70,"Perşembe, Cuma");
        matematik.ekranaYazdir();
    }
}
