import java.util.Scanner;
import java.lang.Math;
public class CalculadoraSimple {

    public static void main(String[] args) {
        boolean condition = true;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("                     /$$                     /$$             /$$                        ");
            System.out.println("                    | $$                    | $$            | $$                        ");
            System.out.println("  /$$$$$$$  /$$$$$$ | $$  /$$$$$$$ /$$   /$$| $$  /$$$$$$  /$$$$$$    /$$$$$$   /$$$$$$  ");
            System.out.println(" /$$_____/ |____  $$| $$ /$$_____/| $$  | $$| $$ |____  $$|_  $$_/   /$$__  $$ /$$__  $$");
            System.out.println("| $$        /$$$$$$$| $$| $$      | $$  | $$| $$  /$$$$$$$  | $$    | $$  \\ $$| $$  \\__/");
            System.out.println("| $$       /$$__  $$| $$| $$      | $$  | $$| $$ /$$__  $$  | $$ /$$| $$  | $$| $$      ");
            System.out.println("|  $$$$$$$|  $$$$$$$| $$|  $$$$$$$|  $$$$$$/| $$|  $$$$$$$  |  $$$$/|  $$$$$$/| $$      ");
            System.out.println(" \\_______/ \\_______/|__/ \\_______/ \\______/ |__/ \\_______/   \\___/   \\______/ |__/");
            System.out.println("-------------------------------Seleccione una operación:--------------------------------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Raíz cuadrada");
            System.out.println("6. Potencia");
            System.out.println("7. Modulo");
            System.out.println("8. Salir");

            int a, b;
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado suma");
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + suma(a, b));
                    break;
                case 2:
                    System.out.println("Ha seleccionado resta");
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + resta(a, b));
                    break;
                case 3:
                    System.out.println("Ha seleccionado multiplicación");
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + multiplicacion(a, b));
                    break;
                case 4:
                    System.out.println("Ha seleccionado división");
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + division(a, b));
                    break;
                case 5:
                    System.out.println("Ha seleccionado raíz cuadrada");
                    System.out.print("Ingrese el número: ");
                    a = scanner.nextInt();
                    System.out.println("Resultado: " + raizCuadrada(a));
                    break;
                case 6:
                    System.out.println("Ha seleccionado potencia");
                    System.out.print("Ingrese la base: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el exponente: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + potencia(a, b));
                    break;
                case 7:
                    System.out.println("Ha seleccionado módulo");
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + modulo(a, b));
                    break;

                case 8:
                    System.out.println("Saliendo...");
                    condition = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }       
        while(condition);
        scanner.close();
    }
    
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return 0;
        }
        return (double) a / b;
    }
    public static double raizCuadrada(int a) {
        if (a < 0) {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo");
            return 0;
        }
        return Math.sqrt(a);
    }
    public static double potencia(int a, int b) {
        return Math.pow(a, b);
    }
    public static int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return 0;
        }
        return a % b;
    }
}

