import java.util.Scanner;

public class MarketKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplamFiyat = 0;
        int secim;
        boolean indirimUygulandi = false;

        System.out.println("Market Kasasına Hoşgeldiniz!");
        System.out.println("Ürünler: \n1. Ekmek - 5 TL\n2. Süt - 15 TL\n3. Peynir - 40 TL\n(Alışverişi tamamlamak için 0'a basın)");

        for (;;) {
            System.out.print("Ürün seçiniz: ");
            secim = scanner.nextInt();

            if (secim == 0) {
                System.out.println("Alışveriş tamamlandı.");
                break;
            }

            switch (secim) {
                case 1:
                    toplamFiyat += 5;
                    System.out.println("Ekmek sepete eklendi.");
                    break;
                case 2:
                    toplamFiyat += 15;
                    System.out.println("Süt sepete eklendi.");
                    break;
                case 3:
                    toplamFiyat += 40;
                    System.out.println("Peynir sepete eklendi.");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        }

        System.out.print("İndirim kuponunuz var mı? (Evet için 1, Hayır için 0): ");
        int indirimSecim = scanner.nextInt();

        if (indirimSecim == 1) {
            toplamFiyat *= 0.9;
            indirimUygulandi = true;
        }

        System.out.println("Toplam ödemeniz: " + toplamFiyat + " TL");
        if (indirimUygulandi) {
            System.out.println("İndirim başarıyla uygulandı!");
        }

        System.out.println("Teşekkür ederiz, iyi günler!");
        scanner.close();
    }
}
