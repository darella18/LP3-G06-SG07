public class Menor {
    public static double menor(double a, double b, double c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        double a = 3.5;
        double b = 2.8;
        double c = 4.2;

        double menorValor = menor(a, b, c);
        System.out.println("El menor valor es: " + menorValor);
    }
}