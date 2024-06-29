public class Ware {
    public String nummer;
    public final String bezeichnung;
    public final double preis;

    public Ware(String id, String desc, double price) {
        nummer = id;
        bezeichnung = desc;
        preis = price;
    }

    public String getNummer() {
        return nummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(String nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return nummer + " " + bezeichnung + ", " + preis;
    }
}
