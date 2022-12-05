import java.util.Scanner;
public class Basamak {
    public static void main(String[] args) {
        int r, sayi, carpim = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi = sc.nextInt();

        while (sayi > 0) {
            r = sayi % 10;
            carpim *= r;
            sayi /= 10;
        }
        System.out.println("Girilen sayinin rakamlarının çarpimi: " + carpim);

        int toplam = 0, sayi2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi2 = scan.nextInt();

        while (sayi2 > 0) {
            toplam += sayi2 % 10;
            sayi2 /= 10;
        }
        System.out.println("Girilen sayinin rakamlarının toplamı = " + toplam);

        int fark = carpim - toplam;
        System.out.println("basamakların çarpımı ve toplamının farkı: " + fark);

    }
}