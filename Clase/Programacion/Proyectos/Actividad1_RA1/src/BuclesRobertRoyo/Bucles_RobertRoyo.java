package BuclesRobertRoyo;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author r.royo
 */
public class Bucles_RobertRoyo {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static final Scanner IN = new Scanner(System.in);

    public static final int PRECIO_ENTRADAS = 7;
    public static final String TEXTO = """
                                   The ancient dragon guarded a treasure hidden deep within the misty mountains,
                                   where only the bravest dared to go. Legends whispered that its golden scales could
                                   blind a man, and that the echo of its roar could shake the very stones of the valley.
                                   """;
    public static final int ANIO_ACTUAL = LocalDate.now().getYear();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion;
        while (true) {
            System.out.println("""
                               \nSelecciona una opcion de programa:
                               \t1. Años bisiestos
                               \t2. Entrada
                               \t3. Frase
                               \t4. Edad
                               \t5. Multiplicaciones
                               \t6. Salir
                             """);
            System.out.print("    - ");
            opcion = IN.nextInt();

            System.out.println("\n");
            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce el primer año: ");
                    int anio1 = IN.nextInt();

                    System.out.print("Introduce el segundo año: ");
                    int anio2 = IN.nextInt();

                    if (anio1 > anio2) {
                        anio1 += anio2;
                        anio2 = anio1 - anio2;
                        anio1 = anio1 - anio2;
                    }

                    String bisiestos = """
                                       \n================================================================
                                       Años Bisiestos:""";

                    bisiestos += "\n================================================================";
                    for (int i = anio1; i <= anio2; i++) {
                        boolean anyDeTraspas = ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0)));
                        if (anyDeTraspas) {
                            bisiestos += ("\n\t" + i);
                        }
                    }
                    bisiestos += "\n================================================================";

                    System.out.println(bisiestos);
                }
                case 2 -> {
                    int entradasTotales, entradasEstudiantes, entradasJubilados, entradasNormales;
                    do {

                        System.out.print("Introduce la cantidad de entradas a comprar: ");
                        entradasTotales = IN.nextInt();

                        System.out.print("Indica cuantas de estas entradas son para estudiantes: ");
                        entradasEstudiantes = IN.nextInt();

                        System.out.print("Indica cuantas de estas entradas son para jubilados: ");
                        entradasJubilados = IN.nextInt();

                        entradasNormales = entradasTotales - (entradasEstudiantes + entradasJubilados);

                        if ((entradasEstudiantes + entradasJubilados) > entradasTotales) {
                            System.err.println("\nERROR: No puedes introducir mas entradas con dexcuento que la cantidad de entradas que tienes\n");
                        }

                    } while ((entradasEstudiantes + entradasJubilados) > entradasTotales);

                    double precio = entradasNormales * PRECIO_ENTRADAS;

                    precio += entradasEstudiantes * (PRECIO_ENTRADAS - (PRECIO_ENTRADAS * 0.25));
                    precio += entradasJubilados * (PRECIO_ENTRADAS - (PRECIO_ENTRADAS * 0.3));

                    String resumCompra = String.format("""
                                                       \n================================================================
                                                           Entradas del Museo:
                                                       ================================================================
                                                       
                                                               Numero total de entradas: \033[33m %d \033[0m
                                                               Numero de entradas Normales: \033[33m %d \033[0m (\033[32m %d€ \033[0m)
                                                               Numero de entradas para Estudiantes: \033[33m %d \033[0m (\033[32m %.2f€ \033[0m)
                                                               Numero de entradas para Jubilados: \033[33m %d \033[0m (\033[32m %.2f€ \033[0m)
                                                       
                                                               Precio final: \033[32m %.2f€ \033[0m
                                                       
                                                       ================================================================
                                                           (%d Normales + %d Estudiantes + %d Jubilados)
                                                       ================================================================
                                                       """, entradasTotales,
                            entradasNormales, PRECIO_ENTRADAS,
                            entradasEstudiantes, (PRECIO_ENTRADAS - (PRECIO_ENTRADAS * 0.25)),
                            entradasJubilados, (PRECIO_ENTRADAS - (PRECIO_ENTRADAS * 0.3)),
                            precio,
                            entradasNormales, entradasEstudiantes, entradasJubilados);

                    System.out.println(resumCompra);
                }
                case 3 -> {
                    System.out.print("Introduce un caracter: ");
                    char caracter = Character.toLowerCase(IN.next().charAt(0));

                    int count = 0;
                    for (int i = 0; i < TEXTO.length(); i++) {
                        if (Character.toLowerCase(TEXTO.charAt(i)) == caracter) {
                            count++;
                        }
                    }

                    System.out.println("En el texto hay \033[32m" + count + "\033[0m '" + caracter + "'");

                    System.out.println("\n================================================================");
                    for (int i = 0; i < TEXTO.length(); i++) {
                        if (Character.toLowerCase(TEXTO.charAt(i)) == caracter) {
                            System.out.print("\033[31m" + TEXTO.charAt(i) + "\033[0m");
                        } else {
                            System.out.print(TEXTO.charAt(i));
                        }
                    }
                    System.out.println("================================================================");
                }
                case 4 -> {
                    /*
                    Prompt IA:
                    
                        ¿Hola, Podrías explicarme como conseguir la fecha actual en java? 
                        También explícame como separar el año en un INT separado.
                    
                     */
                    System.out.print("Introduce tu edad: ");
                    int edad = IN.nextInt();

                    int edad2 = 1;
                    System.out.println("En " + (ANIO_ACTUAL - edad) + " naciste");
                    for (int i = (ANIO_ACTUAL - (edad - 1)); i < ANIO_ACTUAL; i++) {
                        System.out.println("En " + i + " tenias " + edad2);
                        edad2++;
                    }
                    System.out.println("Edad actual: tienes " + edad2 + " años");

                }
                case 5 -> {
                    System.out.println("*** MULTIPLICACIONES ***");
                    System.out.print("Introduce un numero: ");
                    int numero = IN.nextInt();

                    for (int i = 1; i <= numero; i++) {
                        System.out.println(i + "\t" + (i * 2) + "\t" + (i * 3) + "\t" + (i * 4));
                    }
                }
                case 6 ->
                    System.exit(0);
                default ->
                    System.err.println("\nERROR: Opcion no prevista. Introduce una de las opciones disponibles.");
            }
        }
    }
}
