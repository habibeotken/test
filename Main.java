import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Character[] char_dizi = {'J', 'A', 'V', 'A'};
        Integer[] integer_dizi = {1, 2, 3, 4, 5, 6};
        String[] string_dizi = {"java", "phtyon", "C++", "php"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("isil"), new Ogrenci("burcak"), new Ogrenci("arda")};
        yazdir(char_dizi);
        yazdir(integer_dizi);
        yazdir(string_dizi);
        yazdir(ogrenci_dizi);
        Sayisal say = new Sayisal(10, 45, 65, 50);
        Sayisal say2 = new Sayisal(15, 50, 25, 65);
        Sayisal birinci=birinci(say,say2);
        EsitAgirlik ea1= new EsitAgirlik(50,35,40,15);
        EsitAgirlik ea2= new EsitAgirlik(50,45,35,25);
        EsitAgirlik birinci2=birinci(ea1,ea2);
        System.out.println("birinicinin puanı: "+birinci.puanHesapla());
        System.out.println("eşit ağırlık birincisi: "+birinci2.puanHesapla());*/
        System.out.println("YGS-LYS birinci bulma. ");
        Scanner scn = new Scanner(System.in);
        System.out.println("--------------------------");
        String islemler = "Islemler.....\n"
                + "1. Esit agırlık birincisi\n"
                + "2. Sayısal birincisi\n"
                + "Cıkıs :X";
        System.out.println("--------------------------");

        System.out.println(islemler);


        while (true) {

            System.out.println("Öğrencinin ismi: ");
            String isim1 = scn.next();
            System.out.println("Netleri:(e,t,f,m) ");
            int edebiyat1 = scn.nextInt();
            int turkce1 = scn.nextInt();
            int fizik1 = scn.nextInt();
            int matematik1 = scn.nextInt();
            System.out.println("------------------------");
            System.out.println("Öğrencinin ismi: ");
            String isim2 = scn.next();
            System.out.println("Netleri:(e,t,f,m) ");
            int edebiyat2 = scn.nextInt();
            int matematik2 = scn.nextInt();
            int fizik2 = scn.nextInt();
            int turkce2 = scn.nextInt();

            System.out.println("--------------------------");
            System.out.println("İslemi giriniz.");
            String islem = scn.next();


            if (islem.equals("1")) {
                EsitAgirlik ea1 = new EsitAgirlik(edebiyat1, turkce1, matematik1, fizik1, isim1);
                EsitAgirlik ea2 = new EsitAgirlik(edebiyat2, turkce2, matematik2, fizik2, isim2);
                EsitAgirlik birinci = birinci(ea1, ea2);
                System.out.println("ea1'in puanı: "+ea1.puanHesapla());
                System.out.println("ea2'nin puanı: "+ea2.puanHesapla());

                System.out.println("eşit ağırlık birincisi: " + birinci.getIsim());
                continue;

            }
            if (islem.equals("2")) {
                Sayisal say1 = new Sayisal(edebiyat1, turkce1, matematik1, fizik1, isim1);
                Sayisal say2 = new Sayisal(edebiyat2, turkce2, matematik2, fizik2, isim2);
                Sayisal birinci = birinci(say1, say2);
                System.out.println("say1 puanı: "+say1.puanHesapla());
                System.out.println("say2 puanı: "+say2.puanHesapla());
                System.out.println("sayısal birincisi: " + birinci.getIsim());

            }
            if (islem.equals("X")) {
                System.out.println("sistemden cikis yapiliyor..");
    break;
            }
        }


        }


        public static <E extends Aday > E birinci(E say, E say2) {
            if (say2.puanHesapla() > say.puanHesapla()) {
                return say2;
            }
            if (say.puanHesapla() > say2.puanHesapla()) {
                return say;
            }
            return birinci(say, say2);
        }

        public static<E > void yazdir (E[]dizi){
            for (E e : dizi) {
                System.out.println(e);
            }
        }
    }
