package SampleQuestions;

import java.util.Scanner;

public class S09_ZamaniSaniyeyeCevir {
    public static void main(String[] args) {
        // Girilen zamanı saniyeye çeviriniz.
        // Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        // Ipucu: Saati alıp saniyeye cevirebilirsiniz.

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen saati giriniz");
        int saat = scan.nextInt();
        System.out.println("Lütfen dakikayı giriniz");
        int dakika = scan.nextInt();
        System.out.println("Lütfen saniyeyi giriniz");
        int saniye = scan.nextInt();

        System.out.println("Girdiginiz zamanin saniye cinsinden değeri: " + ((saat*3600) + (dakika*60) +(saniye)));

        */



        Scanner scan = new Scanner(System.in);
        System.out.print("Zamanı saat:dakika:saniye şeklinde yazınız (2:30:45) ");
        String zaman = scan.nextLine();

        String[] zamanSplit = zaman.split(":");
        int saat2 = Integer.parseInt(zamanSplit[0]);
        int dakika2 = Integer.parseInt(zamanSplit[1]);
        int saniye2 = Integer.parseInt(zamanSplit[2]);

        int toplamSaniye2 = (saat2 * 3600) + (dakika2 * 60) + saniye2;

        System.out.println("Saatin saniye karşılığı: " + toplamSaniye2 + " saniyedir");



    }
}
