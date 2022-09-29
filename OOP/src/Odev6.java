import java.util.Scanner;

public class Odev6 {

    public static void main(String[] args){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Öğrenci Adını Giriniz");
        String ogrenciAdi = tarayici.next();

        System.out.println("Öğrenci Okul No Giriniz");
        int okulNo = tarayici.nextInt();

        System.out.println("İzin Miktarı Giriniz");
        int izinMiktari = tarayici.nextInt();

        System.out.println("Tarih Giriniz");
        String tarih = tarayici.next();

        System.out.println("Velinin Adını Giriniz");
        String adi = tarayici.next();

        System.out.println("Velinin Soyadını Giriniz");
        String soyadi = tarayici.next();

        String veliAdSoyad = adi+" "+soyadi;


        OdevlerSinifi o = new OdevlerSinifi();
        o.dilekceOlustur(ogrenciAdi,okulNo,izinMiktari,tarih,veliAdSoyad);


    }
}
