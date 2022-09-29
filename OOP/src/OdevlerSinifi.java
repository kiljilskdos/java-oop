public class OdevlerSinifi {
    public void sicaklikDonustur(double sicaklik){

        double f = (sicaklik * 1.8)+32;
        System.out.println("FAHRENAYT  :"+f);
    }



    public int cevreHesapla(int kisaKenar,int uzunKenar){

        return (2 * kisaKenar) + (2 * uzunKenar);
    }




    public long faktoriyel(long sayi){

        long sonuc = 1;
        if (sayi == 0){
            sonuc = 1;
        }else{
            for (long i = 1; i<=sayi;i++){
                sonuc = sonuc * i;
            }
        }
        return sonuc;
    }




    public void harfSayisiBul(String kelime,char harf){
        int boyut = kelime.length();
        char [] harfler = new char[boyut];
        for (int i=0;i<boyut;i++){
            harfler[i] = kelime.charAt(i);
        }

        int sayac = 0;
        for(int i = 0;i<boyut;i++){
            if (harfler [i] == harf){
                sayac++;
            }
        }
        System.out.println("Harf Sayısı  :"+sayac );
    }




    public int icAciToplami(int kenarSayisi){

        int sonuc = (kenarSayisi - 2)*180;

        return sonuc;
    }




    public void dilekceOlustur(String ogrenciAdi,int okulNo,int izinMiktari,String tarih,String veliAdi){

        String dilekce ="\t\tBursa Anadolu Lisesi Müdürlüğüne,\n"+ogrenciAdi +" adlı "+okulNo+" nolu öğrencinin "+izinMiktari+" gün izinli olmasını rica ediyorum.\n"+"Tarih  :"+tarih+"\n"+"Veli Ad-Soyad  :"+veliAdi;
        System.out.println(dilekce);
    }




    public int maasHesapla(int gun){

        int calismaSaati = gun * 8;
        int mesaiSaati = calismaSaati - 160;
        int mesaiUcret = mesaiSaati * 10;
        int maas = 1750 + mesaiUcret;

        return maas;
    }
}




