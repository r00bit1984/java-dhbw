public class Start {
    public static void main(String[] args) {
        String[] DATEN = {"Dr. Schiwago---300", "Ghostbusters---104", "Charade---99", "Toy Story---99", "Jenseits von Afrika---238", "Goofy Ahh Movie :skull:---999"};
        KinoDateiUtil util = new KinoDateiUtil(DATEN);
        Kino newKino = util.loadKino();
        util.saveKino(newKino);
    }
}
