import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        scanner.close();
        if (esPalindromo(numero)) {
            System.out.println("El numero " + numero + " es un palindromo.");
        } else {
            System.out.println("El numero " + numero + " no es un palindromo.");
        }
    }
    public static boolean esPalindromo(int numero) {
        int reverso = 0;
        int original = numero;

        while (numero > 0) {
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero /= 10;
        }
        return original == reverso;
    }
}