package ExcepcionesRobertRoyo;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Excepciones_RobertRoyo {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);
    public static final Random R = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        int opcion = 0;
        do {
            try {
                System.out.println("""
                           \nSelecciona una de las siguientes opciones:
                           
                           \t1. Adivinar el numero
                           \t2. División
                           \t3. Mensaje
                           \t4. Damas
                           \t5. Salir
                           """);
                System.out.print("\t- ");
                opcion = IN.nextInt();
                IN.nextLine();

                switch (opcion) {
                    case 1 -> {
                        int numeroAleatorio = R.nextInt(1, 21);
                        int numeroIntroducido = 0;
                        int intentos = 0;

                        System.out.println("\n***** Numero Secreto *****");

                        do {
                            try {
                                System.out.print("\nAdivina el numero: ");
                                numeroIntroducido = IN.nextInt();
                                IN.nextLine();

                                if (numeroAleatorio < numeroIntroducido) {
                                    System.out.println("El numero es mas pequeño que " + numeroIntroducido);
                                } else if (numeroAleatorio > numeroIntroducido) {
                                    System.out.println("El numero es mas grande que " + numeroIntroducido);
                                }
                                intentos++;
                            } catch (InputMismatchException ime) {
                                System.err.println("ERROR: Debes introducir un numero.");
                                IN.nextLine();
                            }
                        } while (numeroAleatorio != numeroIntroducido);

                        System.out.println("\n\033[32mHas Ganado con " + intentos + " intentos!!\033[0m");
                    }
                    case 2 -> {

                        while (true) {
                            try {
                                System.out.print("\nNumerador: ");
                                int numerador = IN.nextInt();

                                System.out.print("Divisor: ");
                                int divisor = IN.nextInt();

                                if (numerador < 0 || numerador > 100 || divisor < 0 || divisor > 100) {
                                    throw new IllegalArgumentException("ERROR: Los numeros deben estar dentro del rango (1 - 100).");
                                }

                                int resultado = numerador / divisor;

                                System.out.println("El resultado de la division entre \033[33m" + numerador + "\033[0m y \033[33m" + divisor + "\033[0m es: \033[32m" + resultado + "\033[0m");

                                break;
                            } catch (IllegalArgumentException iae) {
                                System.err.println(iae.getMessage());
                            } catch (ArithmeticException ae) {
                                System.err.println("ERROR: No se puede dividir entre 0.");
                            } catch (InputMismatchException ime) {
                                System.err.println("ERROR: Debes introducir numeros.");
                            } finally {
                                IN.nextLine();
                            }
                        }
                    }
                    case 3 -> {

                        while (true) {
                            try {
                                System.out.println("\nCreando un String...");

                                Thread.sleep(3000);

                                String str = "";
                                for (int i = 0; i < 5; i++) {
                                    str += (char) R.nextInt(97, 123);
                                }
                                System.out.println("El String generado es: " + str);

                                System.out.print("Introduce una posicion del string (1 - 5): ");
                                int pos = IN.nextInt();
                                
                                if (pos < 1 || pos > 5) {
                                    throw new IllegalArgumentException("ERROR: Posicion fuera de ranfo (1 - 5).");
                                }
                                
                                System.out.println("En la posicion " + pos + " hay: " + str.charAt(pos-1));
                                break;
                            } catch (InterruptedException ie) {
                                System.err.println("ERROR: Error en la generacion del String.");
                            } catch (InputMismatchException ime) {
                                System.err.println("ERROR: Debes introducir la posicion en forma de numero (1 - 5).");
                            } catch (IllegalArgumentException iae) {
                                System.err.println(iae.getMessage());
                            }finally {
                                IN.nextLine();
                            }
                            

                        }

                    }
                    case 4 -> {

                    }
                    case 5 ->
                        System.exit(0);
                }

            } catch (InputMismatchException ime) {
                System.err.println("ERROR: Debes seleccionar una de las opciones existentes con su numero asignado.");
                IN.nextLine();
            }
        } while (opcion != 5);

    }

}
