import java.util.Arrays;
import java.util.Random;
public class sortOdevi {
    void main(String[] args) {
        int[] sayilar = new int[50];
        Random rand = new Random();
        for (int i=0; i < 50; i++) {
            sayilar[i] = rand.nextInt(0,100);
        }
        for (int i = 0; i < 49; i++) {
            for (int a = 0; a < 49; a++) {
                if (sayilar[a] > sayilar[a + 1]) {
                    int temp = sayilar[a];
                    sayilar[a] = sayilar[a + 1];
                    sayilar[a + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sayilar));
    }
}