import java.util.regex.*;


public class KinoDateiUtil {
    private String[] DATEN;

    public KinoDateiUtil(String[] DATEN) {
        this.DATEN = DATEN;
    }

    public Kino loadKino() {
        Film filme[] = new Film[DATEN.length];
        for (int i = 0; i < DATEN.length; i++) {
            String[] movieInfo = DATEN[i].split("---");
            filme[i] = new Film(movieInfo[0], movieInfo[1]);
        }
        for (Film f : filme) {
            System.out.println(f.toString());
        }
        Kino finalFilme = new Kino(filme);
        return finalFilme;
    }

    public void saveKino(Kino kino) {
        System.out.println(kino.toString());
        System.out.println();
        System.out.println("Information");
        System.out.println("Längste Spieldauer: " + kino.getLängsterFilm());
        System.out.println("Kürzeste Spieldauer: " + kino.getKuerzesterFilm());
        System.out.println("Durchschnittliche Spieldauer: " + kino.getDurchschnittlicheDauer());
    }
}
