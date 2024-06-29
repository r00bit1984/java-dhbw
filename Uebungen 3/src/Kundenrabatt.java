public class Kundenrabatt {
    public double rabattSatz = 0.05;

    public double getRabattSatz() {
        return rabattSatz;
    }

    public void setRabattSatz(double rabattSatz) {
        this.rabattSatz = rabattSatz;
    }

    public double berechneRabattpreis(double vollerPreis) {
        return vollerPreis * rabattSatz;
    }
}
