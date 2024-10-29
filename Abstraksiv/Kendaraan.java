
package Absrtakai;

abstract class Kendaraan { // Mengubah nama kelas menjadi 'Kendaraan' dengan huruf kapital
    private String warna; // Mendeklarasikan atribut warna

    public Kendaraan(final String warna) {
        this.warna = warna;
    }

    abstract void bergerak(); // Metode abstract
}
