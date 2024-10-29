
package Pertama;

public class Mobil {
    private String warna;
    private String merek;
    private int kecepatanMaks;

    public Mobil(final String warna, final String merek, final int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilanInfo() {
        System.out.println("Warna : " + warna);
        System.out.println("Merek : " + merek);
        System.out.println("Kecepatan Maks : " + kecepatanMaks + " km/jam");
    }

    public String getWarna() {
        return warna;
    }

    public String getMerek() {
        return merek;
    }

    public int getKecepatanMaks() {
        return kecepatanMaks;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
