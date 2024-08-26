public abstract class Aday {
    private int turkce;
    private int matematik;
    private int edebiyat;
    private int fizik;
    private String isim;

    public Aday(int edebiyat,int turkce,int matematik,int fizik,String isim) {
        this.edebiyat = edebiyat;
        this.turkce=turkce;
        this.fizik=fizik;
        this.matematik=matematik;
        this.isim=isim;
    }

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }
    abstract int puanHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
