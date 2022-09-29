import java.util.Scanner;

public class Odev2 {

    public static void main(String[] args){

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Kısa kenarı giriniz");
        int kisaKenar = tarayici.nextInt();


        System.out.println("Uzun kenarı giriniz");
        int uzunKenar = tarayici.nextInt();

        OdevlerSinifi o = new OdevlerSinifi();
        int gelenSonuc = o.cevreHesapla(kisaKenar,uzunKenar);

        System.out.println("Sonuç : "+gelenSonuc);
    }
}
