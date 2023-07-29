package SampleQuestions;

import java.util.Scanner;

public class S03_KullanicidanAlinanSayilarinOrtalamasi {
    public static void main(String[] args) {
        //Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ortalamasinin hesaplanmasi için 5 tane pozitif tamsayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        System.out.println("Girdiğiniz sayilar:" + a + " " + b + " " + c + " " + d + " " + e +
                "\nOrtalamalari ise: " +(a+b+c+d+e)/5 );
    }
}
