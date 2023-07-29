package SampleQuestions;

import java.util.Scanner;

public class S10_VucutKitleIndeksi {
    public static void main(String[] args) {
        /*Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
         **indeks Hesaplama:
         İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
         Kullanıcıya aşağıdaki gibi mesaj verin:
         Eğer VKİ 18.5'ten az ise --> zayıfsınız
         Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
         Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
         VKİ 30'a eşit veya daha fazlaysa --> agam obezsin, diyet yap!
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kg cinsinden boyunuzu metre cinsinden yaziniz");
        double kilo = scan.nextDouble();
        double boy = scan.nextDouble();
        double VKI = kilo / (boy * boy);
        if (VKI < 18.5) {
            System.out.println("Vücut kitle endeksiniz: " + VKI + " zayıfsınız");
        } else if (VKI >= 18.5 && VKI < 25) {
            System.out.println("Vücut kitle endeksiniz: " + VKI + " kilo idealdir");
        } else if (VKI >= 25 && VKI < 30) {
            System.out.println("Vücut kitle endeksiniz: " + VKI + " şişmansınız");
        } else {
            System.out.println("Vücut kitle endeksiniz: " + VKI + " agam obezsin, diyet yap! ");
        }


    }
}
