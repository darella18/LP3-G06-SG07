import java.util.Scanner;
public class NumerosPerfectos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Numeros perfectos menores a " + n + ":");
        for (int i = 1; i < n; i++) {
            if (esPerfecto(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean esPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }
}