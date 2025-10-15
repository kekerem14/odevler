void main() {
    Scanner input = new Scanner(System.in);
    IO.print("Eşkenar üçgenin bir kenar uzunluğu: ");
    int kenar = input.nextInt();
    IO.print("Üçgenin yüksekliği: ");
    int yukseklik = input.nextInt();
    int cevre = kenar * 3;
    int alan = (yukseklik * kenar) / 2;
    IO.println("Çevre: " + cevre);
    IO.println("Alan: " + alan);
    input.close();
    }
