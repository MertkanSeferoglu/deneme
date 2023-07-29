package Homeworks;

import java.util.Scanner;

public class C04_Deneme {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           System.out.print("Lütfen bir şifre girin: ");
           String password = scanner.nextLine();

           boolean sifreDogru = true;

           if (!Character.isLowerCase(password.charAt(0))) {
               System.out.println("İlk karakter küçük harf olmalıdır.");
               sifreDogru = false;
           }

           if (!Character.isDigit(password.charAt(password.length() - 1))) {
               System.out.println("Son karakter rakam olmalıdır.");
               sifreDogru = false;
           }

           if (password.contains(" ")) {
               System.out.println("Şifre boşluk içermemelidir.");
               sifreDogru = false;
           }

           if (password.length() < 10) {
               System.out.println("Şifre en az 10 karakter uzunluğunda olmalıdır.");
               sifreDogru = false;
           }

           if (sifreDogru) {
               System.out.println("Şifre başarıyla kaydedildi.");
           }
        }
    }


