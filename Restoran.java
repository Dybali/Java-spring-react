import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplamHesap = 0;
        int secim;

        do {
            System.out.println("Menü:");
            System.out.println("1. Pizza - 40 TL");
            System.out.println("2. Burger - 25 TL");
            System.out.println("3. Çorba - 15 TL");
            System.out.println("4. Siparişi Tamamla ve Hesabı Göster");

            System.out.print("Bir seçenek girin (1-4): ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplamHesap += 40;
                    System.out.println("Pizza seçtiniz.");
                    break;
                case 2:
                    toplamHesap += 25;
                    System.out.println("Burger seçtiniz.");
                    break;
                case 3:
                    toplamHesap += 15;
                    System.out.println("Çorba seçtiniz.");
                    break;
                case 4:
                    System.out.println("Sipariş tamamlandı.");
                    break;
                default:
                    System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
            }

        } while (secim != 4);  // Kullanıcı 4'ü seçene kadar döngü devam eder

        System.out.println("Toplam hesap: " + toplamHesap + " TL");
        scanner.close();
    }
}
