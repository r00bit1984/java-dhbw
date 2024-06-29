public class Bestellposition {
    private Ware ware;
    private int menge;
    public Bestellposition(Ware ware, int menge) {
        this.ware = ware;
        this.menge = menge;
    }
    public Ware getWare() {
        return ware;
    }
    public int getMenge() {
        return menge;
    }
    @Override
    public String toString() {
        return ware.toString() + ", " + "Menge: " + menge;
    }
}
