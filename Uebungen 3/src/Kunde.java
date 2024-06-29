public class Kunde {
    public String vorname;
    public String nachname;
    private String nummer;
    private boolean bekommtRabatt = false;

    public Kunde(String vorname, String nachname, String nummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname + " (KN " + nummer + ")";
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getNummer() {
        return nummer;
    }

    public boolean getBekommtRabatt() {
        return bekommtRabatt;
    }

    public void setBekommtRabatt(boolean bekommtRabatt) {
        this.bekommtRabatt = bekommtRabatt;
    }
}
