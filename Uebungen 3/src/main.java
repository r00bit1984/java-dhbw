public class main {
    public static void main(String[] args) {
        Bestellung best = new Bestellung();
        Bestellposition pos;
        Ware w;
        w = new Ware("01019010", "Hammer", 19.00);
        pos = new Bestellposition(w, 30);
        best.nimmAuf(pos);
        w = new Ware("01019020", "Zange", 17.00);
        pos = new Bestellposition(w, 20);
        best.nimmAuf(pos);
        best.zeigeAn();
    }
}
