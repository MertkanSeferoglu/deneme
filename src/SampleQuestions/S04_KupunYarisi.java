package SampleQuestions;

import java.util.Scanner;

public class S04_KupunYarisi {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tam sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("Girdiğiniz sayi: " + sayi +"\nKüpünün yarisi: "+(sayi*sayi*sayi)/2);
    }
}
