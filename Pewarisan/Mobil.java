
package Pewarisan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public Mobil(final String merek, final String model, final int tahunProduksi, final int jumlahPintu, final String jenisBahanBakar) {
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + getMerek());
        System.out.println("Model: " + getModel());
        System.out.println("Tahun Produksi: " + getTahunProduksi());
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
    }
}
