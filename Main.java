import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Kullanici kullanici1 = new Kullanici("Bireysel", "Cem", "cemdrman@gmail.com");
        kullanici1.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici2 = new Kullanici("Bireysel", "Kadir", "cilgin.kadir@gmail.com");
        kullanici2.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici3 = new Kullanici("Bireysel", "Hatice", "hatice.dev@gmail.com");
        kullanici3.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici4 = new Kullanici("Bireysel", "Ayşe", "ayse.sari@gmail.com");
        kullanici3.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici5 = new Kullanici("Bireysel", "Cem", "cemdrman@gmail.com");
        kullanici1.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici6 = new Kullanici("Bireysel", "Kadir", "cilgin.kadir@gmail.com");
        kullanici2.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici7 = new Kullanici("Bireysel", "Hatice", "hatice.dev@gmail.com");
        kullanici3.mesajKutusu = prepareMesajKutusu();

        Kullanici kullanici8 = new Kullanici("Bireysel", "Ayşe", "ayse.sari@gmail.com");
        kullanici3.mesajKutusu = prepareMesajKutusu();


        List<Ilan> ilanListesi = new ArrayList<>();

        Ilan ilan1 = prepareIlan("Sahibinden Acil Satılık", kullanici1);
        ilanListesi.add(ilan1);
        ilan1.setIl("Ankara");
        ilan1.setOdaSayisi("3+1");
        ilan1.setFiyat(2400);

        Ilan ilan2 = prepareIlan("Dosta GİDERRR ACİLLL!!!", kullanici2);
        ilanListesi.add(ilan2);
        ilan2.setIl("İstanbul");
        ilan2.setOdaSayisi("2+1");
        ilan2.setFiyat(2200);

        Ilan ilan3 = prepareIlan("Metroya Koşarak 5 dk", kullanici3);
        ilanListesi.add(ilan3);
        ilan3.setIl("Ankara");
        ilan3.setOdaSayisi("3+1");
        ilan3.setFiyat(5000);

        Ilan ilan4 = prepareIlan("Öğrenciye ve Bekara uygun", kullanici4);
        ilanListesi.add(ilan4);
        ilan4.setIl("İstanbul");
        ilan4.setOdaSayisi("1+1");
        ilan4.setFiyat(1500);

        Ilan ilan5 = prepareIlan("Yeni Binada", kullanici5);
        ilanListesi.add(ilan5);
        ilan5.setIl("İstanbul");
        ilan5.setOdaSayisi("2+1");
        ilan5.setFiyat(1200);

        Ilan ilan6 = prepareIlan("Uygun Fiyatlı", kullanici6);
        ilanListesi.add(ilan6);
        ilan6.setIl("Ankara");
        ilan6.setOdaSayisi("2+1");
        ilan6.setFiyat(1750);

        Ilan ilan7 = prepareIlan("Eşyasıyla Birlikte!", kullanici7);
        ilanListesi.add(ilan7);
        ilan7.setIl("İstanbul");
        ilan7.setOdaSayisi("3+1");
        ilan7.setFiyat(2750);

        Ilan ilan8 = prepareIlan("Sahibinden Acil!", kullanici8);
        ilanListesi.add(ilan8);
        ilan8.setIl("İstanbul");
        ilan8.setOdaSayisi("1+1");
        ilan8.setFiyat(1800);


        //ilanları filtreleyerek görüntülemek için eklenen fonksiyon
        ilanAra(ilanListesi, "İstanbul", 3000, "2+1", "3+1");


    }

    // Şehir bilgisi, max fiyat ve (tek seçenekli) oda sayısına göre ilanları sıralayan fonksiyon.
    private static void ilanAra(List<Ilan> ilanListesi, String sehir, int maxFiyat, String odaSayisi) {
        System.out.println("\n" + sehir + " şehrindeki " + maxFiyat + " TL altındaki " + odaSayisi + " ilanlar şu şekilde:\n");
        for (Ilan ilan : ilanListesi) {
            if (ilan.getIl().equals(sehir) && ilan.getFiyat() < maxFiyat && ilan.getOdaSayisi().equals(odaSayisi)) {
                System.out.println(ilan.getBaslik() + "\n" + sehir + " - " + ilan.getOdaSayisi()   + " - " + ilan.getFiyat() + " TL\n");
            }
        }
    }

    // Şehir bilgisi, max fiyat ve (çift seçenekli) oda sayısına göre ilanları sıralayan fonksiyon.
    private static void ilanAra(List<Ilan> ilanListesi, String sehir, int maxFiyat, String odaSayisi1, String odaSayisi2) {
        System.out.println("\n" + sehir + " şehrindeki " + maxFiyat + " TL altındaki " + odaSayisi1 + " ve " + odaSayisi2 + " ilanlar şu şekilde:\n");
        for (Ilan ilan : ilanListesi) {
            if (ilan.getIl().equals(sehir) && ilan.getFiyat() < maxFiyat && (ilan.getOdaSayisi().equals(odaSayisi1) || ilan.getOdaSayisi().equals(odaSayisi2))) {
                System.out.println(ilan.getBaslik() + "\n" + sehir + " - " + ilan.getOdaSayisi()   + " - " + ilan.getFiyat() + " TL\n");
            }
        }
    }



    private static List<Mesaj> prepareMesajKutusu() {
        List<Mesaj> mesajKutusu = new ArrayList<>();
        mesajKutusu.add(new Mesaj("baslik1"));
        mesajKutusu.add(new Mesaj("deneme"));
        mesajKutusu.add(new Mesaj("selam"));
        return mesajKutusu;
    }

    private static Ilan prepareIlan(String baslik, Kullanici kullanici) {
        Ilan ilan = new Ilan();
        ilan.setBaslik(baslik);
        ilan.setGayrimenkul(makeGayrimenkul());


        //kullanici.mesajKutusu.add(new Mesaj("acil dönüş")); // NPE

        ilan.setKullanici(kullanici);

        ilan.setAktifMi(true);

        ilan.setResimList(makeResimList());
/*
        for (Mesaj mesaj : kullanici.mesajKutusu) {
            System.out.println(mesaj.baslik);
        }


 */
        return ilan;
    }

    private static String[] makeResimList() {
        String[] resimList = new String[5];
        resimList[0] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
        resimList[1] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
        return resimList;
    }

    private static Gayrimenkul makeGayrimenkul() {
        return new Gayrimenkul();
    }

}