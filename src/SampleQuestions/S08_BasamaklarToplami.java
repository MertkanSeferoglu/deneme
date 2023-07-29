package SampleQuestions;


import java.util.Scanner;

public class S08_BasamaklarToplami {
    public static void main(String[] args) {
        /*Kullanicidan üc basamaklı bir sayı alin.
            Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
            ipuclari:
            Matematiksel Islemler konusuna bakalim.
            Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.
         */
        /* Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayi giriniz");
        int sayi = scan.nextInt();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        birlerBasamagi = sayi % 10;
        rakamlarToplami = birlerBasamagi + rakamlarToplami;
        sayi /= 10;
        birlerBasamagi = sayi % 10;
        rakamlarToplami = birlerBasamagi + rakamlarToplami;
        sayi /= 10;
        birlerBasamagi = sayi % 10;
        rakamlarToplami = birlerBasamagi + rakamlarToplami;
        sayi /= 10;
        System.out.println("Rakamlar toplami: " + rakamlarToplami);
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli bir sayi giriniz");
        int sayi = scanner.nextInt();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int basamakSayisi = (sayi + "").length();
        for (int i = 1; i <= basamakSayisi; i++) {
            birlerBasamagi = sayi % 10;
            rakamlarToplami = birlerBasamagi + rakamlarToplami;
            sayi /= 10;
        }
        System.out.println("Rakamlar toplami: " + rakamlarToplami);


    }
}
