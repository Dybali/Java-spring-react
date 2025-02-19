import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 500; // Başlangıç bakiyemiz
        int pin = 9876; // Kullanıcıdan beklenen PIN
        int attempts = 3; // 3 hakkı var

        System.out.println("ATM'ye Hoşgeldiniz!");

        while (attempts > 0) {
            System.out.print("PIN kodunuzu girin: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == pin) {
                System.out.println("Giriş başarılı!");

                while (true) {
                    System.out.println("\n1. Bakiye Görüntüle");
                    System.out.println("2. Para Yatır");
                    System.out.println("3. Para Çek");
                    System.out.println("4. Çıkış");
                    System.out.print("Lütfen bir işlem seçin: ");

                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Bakiyeniz: " + balance + " TL");
                            break;
                        case 2:
                            System.out.print("Ne kadar yatırmak istiyorsunuz? ");
                            int deposit = scanner.nextInt();
                            balance += deposit;
                            System.out.println("Yeni bakiyeniz: " + balance + " TL");
                            break;
                        case 3:
                            System.out.print("Ne kadar çekmek istiyorsunuz? ");
                            int withdraw = scanner.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Üzgünüm, yeterli bakiyeniz yok!");
                            } else {
                                balance -= withdraw;
                                System.out.println("Yeni bakiyeniz: " + balance + " TL");
                            }
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor... İyi günler!");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Geçersiz seçim! Tekrar deneyin.");
                    }
                }
            } else {
                attempts--;
                if (attempts == 0) {
                    System.out.println("Üzgünüm, 3 kez yanlış girdiniz. Hesabınız bloke edildi!");
                } else {
                    System.out.println("Yanlış PIN! Kalan hakkınız: " + attempts);
                }
            }
        }
        scanner.close();
    }
}
