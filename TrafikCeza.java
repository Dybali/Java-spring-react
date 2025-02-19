import java.util.Scanner;

public class TrafikCeza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hızınızı girin (km/s): ");
        int hiz = scanner.nextInt();
        int ceza = 0;

        switch (hiz / 10) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                System.out.println("Sıkıntı yok, hız sınırında gidiyorsun.");
                break;
            case 10: case 11:
                ceza = 1000;
                System.out.println("Biraz fazla basmışsın, ceza: " + ceza + " TL");
                break;
            case 12: case 13:
                ceza = 2000;
                System.out.println("Hız yapıyorsun! Ceza: " + ceza + " TL");
                break;
            default:
                System.out.println("Çok hızlısın! Ehliyete el kondu!");
        }

        scanner.close();
    }
}
