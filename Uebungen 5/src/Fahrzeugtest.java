public class Fahrzeugtest {
    public static void main(String[] args) {
        Fahrzeug allgemeinesFahrzeug = new Fahrzeug(16);
        Pkw Pkw = new Pkw(5);
        Motorrad Motorrad = new Motorrad();

//        System.out.println("Das Fahrzeug ist ein " + allgemeinesFahrzeug.gibFahrzeugArt() + " mit " + allgemeinesFahrzeug.gibAnzahlRaeder() + " Rädern.");
//        System.out.println("Das Fahrzeug ist ein " + Pkw.gibFahrzeugArt() + " mit " + Pkw.gibAnzahlRaeder() + " Rädern und " + Pkw.gibAnzahlTüren() + " Türen");
//        System.out.println("Das Fahrzeug ist ein " + Motorrad.gibFahrzeugArt() + " mit " + Motorrad.gibAnzahlRaeder() + " Rädern.");
        System.out.println(Motorrad.toString());
        Fahrzeug[] fahrzeuge = new Fahrzeug[]{
                new Fahrzeug(16), new Pkw(4), new Motorrad()};
        for (Fahrzeug f : fahrzeuge) {
            System.out.println("Das Fahrzeug ist ein " + f);
        }
    }
}
