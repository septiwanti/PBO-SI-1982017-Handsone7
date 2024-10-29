
package Polimorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new Persegi(4); // Membuat instance dari Persegi
        System.out.println("Luas Persegi: " + bangunDatar.luas());
        System.out.println("Keliling Persegi: " + bangunDatar.keliling());
    }
}
