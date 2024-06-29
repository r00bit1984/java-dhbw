public class Rechner {
    public static void main(String[] args) {
        Bruchzahl zahl = new Bruchzahl(3, 5);
        Bruchzahl zahl2 = new Bruchzahl(1, 2);
        Bruchzahl zahl3 = zahl.addiere(zahl2);
        System.out.println(zahl3);
        Bruchzahl zahl4 = zahl.subtrahiere(zahl2);
        System.out.println(zahl4);
        Bruchzahl zahl5 = zahl4.bildeGegenwert();
        System.out.println(zahl5);
        Bruchzahl zahl6 = zahl.dividiere(zahl2);
        System.out.println(zahl6);
        zahl6.kuerze();
        System.out.println(zahl6);
        Bruchzahl bruch = new Bruchzahl(0, 4);
        bruch.kuerze();
        System.out.println(bruch);
        System.out.println(bruch.ggT(12, 15));
        bruch.normiere();
        System.out.println(bruch);
    }
}