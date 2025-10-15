void main() {
    Scanner input = new Scanner(System.in);

    IO.print("Birinci sayı: ");
    int sayi1 = input.nextInt();

    IO.print("İkinci sayı: ");
    int sayi2 = input.nextInt();

    int sonuc = sayi1 * sayi2;
    IO.println("Sonuç: " + sonuc);

    input.close();
}
