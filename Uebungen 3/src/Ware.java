public class Ware {
    private String nummer;
    private final String bezeichnung;
    private final double preis;

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
}
