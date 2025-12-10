public class Main {
    void main() {
        Ders mat = new Ders("Murat Hoca","Test Çözme","70","100");
        Ders edebiyat = new Ders("Mustafa Hoca","Şiir Yazma","rastgele not:D","100");
        Ders almanca = new Ders("Derya Hoca","Dativ Örnek Cümle Yazma","92","90");
        Ders ingilizce = new Ders("Tümay Hoca","Workbook 2. Ünite bitirme","100","94");
        Ders muzik = new Ders("Aysel Hoca","Türkü Ezber","100","100");

        Gun pzt = new Gun(mat, edebiyat, ingilizce, almanca, muzik);
        Gun sali = new Gun(almanca, muzik, ingilizce, edebiyat, mat);
        System.out.println(pzt);
        System.out.println(sali);
    }
}

class Ders {
    String ogretmen;
    String odev;
    String yaziliNotu;
    String sozluNotu;

    Ders(String ogretmen, String odev, String yaziliNotu, String sozluNotu) {
        this.ogretmen = ogretmen;
        this.odev = odev;
        this.yaziliNotu = yaziliNotu;
        this.sozluNotu = sozluNotu;
    }
}

class Gun {
    public String toString() {
        return
                ders1.ogretmen + " - " + ders1.odev + " - " + ders1.yaziliNotu + " - " + ders1.sozluNotu + "\n" +
                ders2.ogretmen + " - " + ders2.odev + " - " + ders2.yaziliNotu + " - " + ders2.sozluNotu + "\n" +
                ders3.ogretmen + " - " + ders3.odev + " - " + ders3.yaziliNotu + " - " + ders3.sozluNotu + "\n" +
                ders4.ogretmen + " - " + ders4.odev + " - " + ders4.yaziliNotu + " - " + ders4.sozluNotu + "\n" +
                ders5.ogretmen + " - " + ders5.odev + " - " + ders5.yaziliNotu + " - " + ders5.sozluNotu;
    }

    Ders ders1;
    Ders ders2;
    Ders ders3;
    Ders ders4;
    Ders ders5;

    Gun(Ders ders1, Ders ders2, Ders ders3, Ders ders4, Ders ders5) {
        this.ders1 = ders1;
        this.ders2 = ders2;
        this.ders3 = ders3;
        this.ders4 = ders4;
        this.ders5 = ders5;

    }
}
