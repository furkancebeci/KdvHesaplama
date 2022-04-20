import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double value;
        double kdvRatio = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz Tutari Giriniz: ");
        value = input.nextDouble();

        System.out.println("KDV'siz Fiyat = " + value);
        System.out.println("KDV'li Fiyat = " + (value + (value * kdvRatio)));
        System.out.println("KDV Tutari = " + (value * kdvRatio));
    }
}