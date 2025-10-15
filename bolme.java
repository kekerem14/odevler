void main() {
    Scanner input = new Scanner(System.in);

    IO.print("Bölünen: ");
    int sayi1 = input.nextInt();

    IO.print("Bölen: ");
    int sayi2 = input.nextInt();

    int sonuc = sayi1 / sayi2;
    IO.println("Sonuç: " + sonuc);

    input.close();
}
