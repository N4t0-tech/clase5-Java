import java.util.Scanner;
import java.lang.Math;
public class CalculadoraSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;
        do {
            mostrarMenu();
            int opcion = scanner.nextInt();
            continuar = ejecutarOperacion(opcion, scanner);
        } while (continuar);
        scanner.close();
    }

    // Códigos de color ANSI
    static final String RESET  = "\u001B[0m";
    static final String CYAN   = "\u001B[36m";
    static final String YELLOW = "\u001B[33m";
    static final String GREEN  = "\u001B[32m";
    static final String BOLD   = "\u001B[1m";
    static final String DIM    = "\u001B[2m";

    public static void mostrarMenu() {
        System.out.println();
        System.out.println(CYAN + BOLD);
        System.out.println("                     /$$                     /$$             /$$                        ");
        System.out.println("                    | $$                    | $$            | $$                        ");
        System.out.println("  /$$$$$$$  /$$$$$$ | $$  /$$$$$$$ /$$   /$$| $$  /$$$$$$  /$$$$$$    /$$$$$$   /$$$$$$  ");
        System.out.println(" /$$_____/ |____  $$| $$ /$$_____/| $$  | $$| $$ |____  $$|_  $$_/   /$$__  $$ /$$__  $$");
        System.out.println("| $$        /$$$$$$$| $$| $$      | $$  | $$| $$  /$$$$$$$  | $$    | $$  \\ $$| $$  \\__/");
        System.out.println("| $$       /$$__  $$| $$| $$      | $$  | $$| $$ /$$__  $$  | $$ /$$| $$  | $$| $$      ");
        System.out.println("|  $$$$$$$|  $$$$$$$| $$|  $$$$$$$|  $$$$$$/| $$|  $$$$$$$  |  $$$$/|  $$$$$$/| $$      ");
        System.out.println(" \\_______/ \\_______/|__/ \\_______/ \\______/ |__/ \\_______/   \\___/   \\______/ |__/");
        System.out.println(RESET);
        System.out.println(YELLOW + BOLD + "  ╔══════════════════════════════════════╗");
        System.out.println("  ║       SELECCIONE UNA OPERACIÓN       ║");
        System.out.println("  ╠══════════════════════════════════════╣" + RESET);
        System.out.println(GREEN + "  ║  " + BOLD + "1." + RESET + GREEN + "  Suma                            ║");
        System.out.println("  ║  " + BOLD + "2." + RESET + GREEN + "  Resta                           ║");
        System.out.println("  ║  " + BOLD + "3." + RESET + GREEN + "  Multiplicación                  ║");
        System.out.println("  ║  " + BOLD + "4." + RESET + GREEN + "  División                        ║");
        System.out.println("  ║  " + BOLD + "5." + RESET + GREEN + "  Raíz cuadrada                   ║");
        System.out.println("  ║  " + BOLD + "6." + RESET + GREEN + "  Potencia                        ║");
        System.out.println("  ║  " + BOLD + "7." + RESET + GREEN + "  Módulo                          ║");
        System.out.println("  ║  " + BOLD + "8." + RESET + GREEN + "  Salir                           ║" + RESET);
        System.out.println(YELLOW + BOLD + "  ╚══════════════════════════════════════╝" + RESET);
        System.out.print(BOLD + "\n  >> Opción: " + RESET);
    }

    public static boolean ejecutarOperacion(int opcion, Scanner scanner) {
        int a, b;
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
                return false;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return true;
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

