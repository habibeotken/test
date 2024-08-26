public class EsitAgirlik extends Aday {
    public EsitAgirlik(int edebiyat, int turkce, int matematik, int fizik,String isim) {
        super(edebiyat, turkce, matematik, fizik,isim);
    }

    @Override
    int puanHesapla() {
        return getEdebiyat()*4+getTurkce()*5+getFizik()*1+getMatematik()*1;
    }
}
