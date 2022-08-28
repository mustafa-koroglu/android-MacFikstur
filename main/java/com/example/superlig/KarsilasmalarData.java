package com.example.superlig;

public class KarsilasmalarData {
    private  String takim;
    private  String takim1;
    private  String tarih;
    private  int image;
    private  int image1;

    public KarsilasmalarData(String takim, String takim1, String tarih, int image, int image1) {
        this.takim = takim;
        this.takim1 = takim1;
        this.tarih = tarih;
        this.image = image;
        this.image1 = image1;
    }

    public String getTakim() {
        return takim;
    }

    public void setTakim(String takim) {
        this.takim = takim;
    }

    public String getTakim1() {
        return takim1;
    }

    public void setTakim1(String takim1) {
        this.takim1 = takim1;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }
}
