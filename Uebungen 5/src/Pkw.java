public class Pkw extends Fahrzeug {

    int anzahlTüren;
    public Pkw(int anzahlTüren) {
        super("Pkw", 4);
        this.anzahlTüren = anzahlTüren;
    }

    public int gibAnzahlTüren() {
        return anzahlTüren;
    }

    @Override
    public String toString() {
            return "Dieses Fahrzeug ist ein " + super.gibFahrzeugArt() + " mit " + super.gibAnzahlRaeder() + " Rädern und " + anzahlTüren + " Türen.";
    }

}

