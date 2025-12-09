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

class Pazartesi {
    private Ders matematik;
    private Ders edebiyat;

    public Pazartesi() {
        matematik = new Ders("Ahmet Hoca", "Yazı Ödevi", 95, 70);
        edebiyat = new Ders("Mehmet Hoca", "Şiir Ezberleme", 85, 80);
    }

    public void ekranaYazdir() {
        System.out.println("--- Pazartesi Dersleri ---");
        System.out.println("Matematik:");
        matematik.ekranaYazdir();
        System.out.println();
        System.out.println("Edebiyat:");
        edebiyat.ekranaYazdir();
        System.out.println();
    }
}

class Sali {
    private Ders matematik;
    private Ders edebiyat;

    public Sali() {
        matematik = new Ders("Ahmet Hoca", "Problem Çözme", 88, 75);
        edebiyat = new Ders("Mehmet Hoca", "Kompozisyon Yazma", 90, 85);
    }

    public void ekranaYazdir() {
        System.out.println("--- Salı Dersleri ---");
        System.out.println("Matematik:");
        matematik.ekranaYazdir();
        System.out.println();
        System.out.println("Edebiyat:");
        edebiyat.ekranaYazdir();
        System.out.println();
    }
}

class Main {
    void main() {
        Pazartesi p = new Pazartesi();
        Sali s = new Sali();

        p.ekranaYazdir();
        s.ekranaYazdir();
    }
}
