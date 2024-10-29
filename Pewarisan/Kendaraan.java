
package Pewarisan;

public class Kendaraan {
    private String merek;
    private String model;
    private int tahunProduksi;

    public Kendaraan(String merek, String model, int tahunProduksi) {
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }
}
