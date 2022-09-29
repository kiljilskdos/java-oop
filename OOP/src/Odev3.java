import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args){

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Faktoriyel Hesabı İçin Sayı Giriniz");

        long sayi = tarayici.nextLong();


        OdevlerSinifi o = new OdevlerSinifi();

        long faktoriyel = o.faktoriyel(sayi);

        System.out.println("Faktoriyel Sonuç  :"+faktoriyel);

    }
}
