import java.util.Arrays;

public class Kino {
    private Film[] filme = new Film[100];
    private int lastIndex;

    public Kino(Film[] filme) {
        this.filme = filme;
        int lastIndex = 0;
        for (Film f : filme) {
            if (f == null) {
                break;
            }
            lastIndex++;
        }
    }

    public void print() {
        for (Film f : filme) {
            System.out.println(f);
        }
    }

    public void addFilm(Film film) {
        filme[lastIndex] = film;
    }

    public Film getKuerzesterFilm() {
        int MAX = 9999999;
        int index = 0;
        for (Film f : filme) {
            if (MAX >= Integer.parseInt(f.länge)) {
                MAX = Integer.parseInt(f.länge);
                index++;
            }
        }
        return filme[index - 1];
    }

    public Film getLängsterFilm() {
        int MIN = 0;
        int index = 0;
        for (Film f : filme) {
            if (MIN <= Integer.parseInt(f.länge)) {
                MIN = Integer.parseInt(f.länge);
                index++;
            }
        }
        return filme[index - 1];
    }

    public double getDurchschnittlicheDauer () {
        double sum = 0;
        int menge = 0;
        for (Film f : filme) {
            sum += Integer.parseInt(f.länge);
            menge++;
        }
        return sum / menge;

    }

    public void getFilmeNachLaenge () {
        int[] längen = new int[filme.length];
        int i = 0;
        for (Film f : filme) {
            längen[i] = Integer.parseInt(f.länge);
            i++;
        }
        Arrays.sort(längen);
        for (int j = 0; j < längen.length; j++) {
            System.out.println(längen[j]);
        }
    }
}
