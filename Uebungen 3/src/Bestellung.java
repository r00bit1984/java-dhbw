public class Bestellung {
    private final Bestellposition[] positionen = new Bestellposition[100];
    private Kunde kunde;

    public Bestellung(Kunde kunde) {
        this.kunde = kunde;
    }


    public void nimmAuf(Bestellposition position) {
        int lastIndex = 0;
        while (positionen[lastIndex] != null) {
            lastIndex++;
        }
        positionen[lastIndex] = position;
    }

    public void zeigeAn() {
        System.out.print("Bestellung von " + kunde);
        if (kunde.getBekommtRabatt() == true){
            System.out.println(" mit 5% Kundenrabatt.");
        }
        System.gc();
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Artikelnummer", "Bezeichnung", "Preis", "Menge");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < positionen.length; i++) {
            if (positionen[i] != null) {
                System.out.printf("%-15s %-15s %-15.2f %-15s\n", positionen[i].ware.nummer, positionen[i].ware.bezeichnung, positionen[i].ware.preis, positionen[i].menge );
            }
        }
    }
}
