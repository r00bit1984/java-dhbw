public class Algorithmen {
    public static long ggT(long a, long b) {
        long rest = a % b;
        if (rest == 0) {
            return b;
        } else {
            return ggT(b, rest);
        }
    }
}
