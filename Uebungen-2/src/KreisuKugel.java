public class KreisuKugel {
    public static final double pi = Math.PI;

    public static void main(String[] args) {
        double radius = 33;
        double umfang = umfang(radius);
        double oberfläche = oberfläche(radius);
        double oberflächeKugel = oberflächeKugel(radius);
        double volumenKugel = volumenKugel(radius);
        System.out.println("Radius\tUmfang\tFläche\tOberfläche\tVolumen");
        System.out.println(radius + "\t" + umfang +"\t" + oberfläche +"\t" + oberflächeKugel +"\t" + volumenKugel);

    }
    public static double umfang(double r){
        return pi * 2 * r;
    }
    public static double oberfläche(double r){
        return pi * r * r;
    }
    public static double oberflächeKugel(double r){
        return 4* pi * r * r;
    }
    public static double volumenKugel(double r){
        return (4/3) * pi * r * r * r;
    }

}
