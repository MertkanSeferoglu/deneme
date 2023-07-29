package SampleQuestions;

import java.util.Scanner;

public class S07_DoubleToInt_FloatToShort {
    public static void main(String[] args) {
        /*Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir double sayı giriniz");
        double doublesayi = scan.nextDouble();
        System.out.println("Girmiş olduğunuz sayi " + doublesayi + " integer hali: " + (int) doublesayi);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lütfen bir float sayi giriniz");
        float floatsayi = scan2.nextFloat();
        System.out.println("Girmiş olduğunuz sayi " + floatsayi + " short hali: " + (short) floatsayi);


    }
}
