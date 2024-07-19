public class Fahrzeug {
    private String fahrzeugArt = "allgemeines Fahrzeug";
    private int anzahlRaeder;

    public Fahrzeug(int anzahlRaeder) {
        this.anzahlRaeder = anzahlRaeder;
    }
    public Fahrzeug(String fahrzeugArt, int anzahlRaeder) {
        this.fahrzeugArt = fahrzeugArt;
        this.anzahlRaeder = anzahlRaeder;
    }

    public String gibFahrzeugArt() {
        if (fahrzeugArt.equals("Motorrad")) {
            return "Motorrad";
        }
        if (fahrzeugArt.equals("Pkw")) {
            return "Pkw";
        }
        else {
            return fahrzeugArt;
        }
    }

    public int gibAnzahlRaeder() {
        return anzahlRaeder;
    }

    @Override
    public String toString() {

            return "Dieses Fahrzeug ist ein " + fahrzeugArt + " mit " + anzahlRaeder + " Rädern.";

    }
}
