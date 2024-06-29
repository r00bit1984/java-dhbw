public class Bestellung {
    private final Bestellposition[] positionen = new Bestellposition[100];

    public Bestellung() {

    }

    public void nimmAuf(Bestellposition position) {
        int lastIndex = 0;
        while (positionen[lastIndex] != null) {
            lastIndex++;
        }
        positionen[lastIndex] = position;
    }

    public void zeigeAn() {
        for (Bestellposition b : positionen) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }
}
