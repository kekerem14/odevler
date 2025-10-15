void main() {
    Scanner input = new Scanner(System.in);

    IO.print("Birinci sayıyı girin: ");
    int sayi1 = input.nextInt();

    IO.print("İkinci sayıyı girin: ");
    int sayi2 = input.nextInt();

    int sonuc = sayi1 - sayi2;
    IO.println("Sonuç: " + sonuc);

    input.close();
}
