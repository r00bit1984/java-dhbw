import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ware {
    public final String bezeichnung;
    public final double preis;
    public String nummer;

    public Ware(String id, String desc, double price) {
        nummer = id;
        bezeichnung = desc;
        preis = price;
    }

    public String getNummer() {
        return nummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(String nummer) {
        this.nummer = nummer;
    }

    public String getNormalisierteWarenNummer() {
        String input = nummer;
        Pattern pattern = Pattern.compile("^DE-\\d{4}-\\d{4}$");
        /*
         * `^`: The caret symbol at the beginning of the expression indicates that the match should start at the beginning of the input string.
         * `DE`: This matches the literal characters "DE" in the input string.
         * `-`: This matches a hyphen character in the input string.
         * `\\d{4}`: This matches exactly four digits (0-9) in the input string. The `\\d` is an escape sequence that represents any digit, and the `{4}` specifies that exactly four of these digits should be matched.
         * `-`: This matches a hyphen character in the input string.
         * `\\d{4}`: This matches exactly four digits (0-9) in the input string. The `\\d` is an escape sequence that represents any digit, and the `{4}` specifies that exactly four of these digits should be matched.
         * `$`: The dollar symbol at the end of the expression indicates that the match should end at the end of the input string.
         */
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return nummer;
        } else if (nummer.length() == 8) {
            return String.format("DE-%s-%s", input.substring(0, 4), input.substring(4));
        } else {
            throw new IllegalArgumentException("Nummer ist nicht 8 lang");
        }
    }

    @Override
    public String toString() {
        return nummer + " " + bezeichnung + ", " + preis;
    }
}
