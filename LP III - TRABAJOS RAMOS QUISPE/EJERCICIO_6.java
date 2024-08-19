import java.util.Scanner;

public class ConversorTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas: ");
        int horas = scanner.nextInt();

        System.out.print("Ingrese el número de minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Ingrese el número de segundos: ");
        int segundos = scanner.nextInt();

        int totalSegundos = convertirTiempo(horas, minutos, segundos);

        System.out.println("El equivalente en segundos es: " + totalSegundos);
    }

    public static int convertirTiempo(int horas, int minutos, int segundos) {
        int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
        return totalSegundos;
    }
}