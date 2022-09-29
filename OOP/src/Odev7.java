import java.util.Scanner;

public class Odev7 {

    public static void main(String[] args){

        Scanner tarayici = new Scanner(System.in);
        System.out.println("Çalışma Gün Sayınızı Giriniz");
        int gun = tarayici.nextInt();

       int sonuc = new OdevlerSinifi().maasHesapla(gun);

        System.out.println("Maaş :"+sonuc);
    }
}
