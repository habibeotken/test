public class Sayisal extends Aday {
    public Sayisal(int edebiyat, int turkce, int matematik, int fizik,String isim) {
        super(edebiyat, turkce, matematik, fizik,isim);
    }

    @Override
    int puanHesapla() {
        return getEdebiyat()*5+getMatematik()*5+getFizik()*5+getTurkce()*1;
    }
}
