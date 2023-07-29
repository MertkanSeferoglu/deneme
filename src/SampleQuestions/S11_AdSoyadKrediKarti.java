package SampleQuestions;

import java.util.Scanner;

public class S11_AdSoyadKrediKarti {
    public static void main(String[] args) {
        /*
        Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
        Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
        Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
        Ipucu: IF ile çözebilirsiniz.
        Giriş :
         > Gandalf Grey 563245879632
        Çıktı :
         > İsim : G****** G***
         > CCN : **** **** 9632

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String ad = scan.next();
        System.out.println("Lütfen soyadınızı giriniz");
        String soyAd = scan.next();
        System.out.println("Lütfen kredi kartı numaranizi giriniz");
        String kartNo = scan.next();

        if (kartNo.length() != 16) {
            System.out.println("Geçersiz kart numarası yazdınız");
        } else {
            System.out.println("İsim: " + ad.toUpperCase().charAt(0) +
                    ad.substring(1).replaceAll("\\w", "*")
                    + " " + soyAd.toUpperCase().charAt(0) +
                    soyAd.substring(1).replaceAll("\\w", "*").replace("ğ","*") +"\nKKN: "+
                    "**** **** **** " + kartNo.substring(12, 16));
        }

    }
}
