public class Estacionamiento {
    public static double calcularCargo(int horas) {
        double cargo = 0.0;

        if (horas <= 1) {
            cargo = 3.0; // primera hora
        } else {
            cargo = 3.0 + (horas - 1) * 0.5; // horas adicionales
            if (cargo > 12.0) {
                cargo = 12.0; // cargo maximo por dia
            }
        }

        return cargo;
    }
    public static void main(String[] args) {
        int horas = 5; // numero de horas a ingresar
        double cargo = calcularCargo(horas);
        System.out.println("El cargo es: S/" + cargo);
    }
}