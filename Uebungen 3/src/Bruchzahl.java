public class Bruchzahl {
    public long z;
    public long n;

    public Bruchzahl(long z, long n) {
        if (n == 0) {
            throw new IllegalArgumentException("Nenner darf nicht Null sein!");
        }
        this.z = z;
        this.n = n;
    }

    @Override
    public String toString() {
        return "Bruch: \n" + z + "\n--\n" + n;
    }

    public Bruchzahl addiere(Bruchzahl q) {
        long tempz;
        long tempn;
        tempz = z * q.n + n * q.z;
        tempn = n * q.n;
        return new Bruchzahl(tempz, tempn);
    }

    public Bruchzahl multipliziere(Bruchzahl q) {
        long tempz;
        long tempn;
        tempz = z * q.n;
        tempn = n * q.n;
        return new Bruchzahl(tempz, tempn);
    }

    public Bruchzahl subtrahiere(Bruchzahl q) {
        long tempz;
        long tempn;
        tempz = z * q.n - n * q.z;
        tempn = n * q.n;
        return new Bruchzahl(tempz, tempn);
    }

    public Bruchzahl bildeGegenwert() {
        return new Bruchzahl(-z, -n);
    }

    public Bruchzahl dividiere(Bruchzahl q) {
        long tempz;
        long tempn;
        tempz = z * q.n;
        tempn = n * q.z;
        return new Bruchzahl(tempz, tempn);
    }

    public Bruchzahl bildeKehrwert() {
        return new Bruchzahl(n, z);
    }

    public Bruchzahl normiere() {
        long tempz = z;
        long tempn = n;
        if (n < 0) {
            tempz = z * (-1);
            tempn = n * (-1);
        }
        if (z != 0 | n != 0) {
            if (z == 0) {
                tempn = 1;
            }
            if (n == 0) {
                tempz = 1;
            }
        }
        this.kuerze();
        return new Bruchzahl(tempz, tempn);
    }

    public void kuerze() {
        long ggT = ggT(z, n);
        z = z / ggT;
        n = n / ggT;
    }

    public long ggT(long a, long b) {
        long rest = a % b;
        if (rest == 0) {
            return b;
        } else {
            return ggT(b, rest);
        }
    }

}