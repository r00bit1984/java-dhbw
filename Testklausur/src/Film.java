public class Film {
    public String name;
    public String länge;

    public Film(String name, String länge) {
        this.name = name;
        this.länge = länge;
    }

    @Override
    public String toString() {
        return name + ":" +  "\t" + länge + " Minuten";
    }
}
