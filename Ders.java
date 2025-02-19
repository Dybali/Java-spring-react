import java.util.Scanner;

public class Ders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notlar = new double[5];
        double toplam = 0;
        double enYuksek = -1, enDusuk = 101;

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". dersin notunu girin: ");
            notlar[i] = scanner.nextDouble();
            toplam += notlar[i];

            if (notlar[i] > enYuksek) enYuksek = notlar[i];
            if (notlar[i] < enDusuk) enDusuk = notlar[i];
        }

        double ortalama = toplam / 5;

        if (ortalama > 50) {
            System.out.println("Geçtiniz!");
        } else {
            System.out.println("Kaldınız!");
        }

        for (double not_ : notlar) {
            if (not_ < 30) {
                System.out.println("Düşük not aldığınız dersler var!");
                break;
            }
        }

        System.out.println("En yüksek not: " + enYuksek);
        System.out.println("En düşük not: " + enDusuk);

        scanner.close();
    }
}
