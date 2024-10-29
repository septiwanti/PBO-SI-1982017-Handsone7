
package Polimorfisme;

public class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}
