package org.example;
import java.util.Scanner; public class Application {
        static String nombre;

public static void main(String[] args)
{
    moduloGeneral();
    modalidadTradicionalSpellingBee();
    modalidadRetosyJuegosSpellingBee();
    modalidadTradicionalVocabulario();
    modalidadJuegosVocabulario();
}



private static void moduloGeneral()
{
    Scanner sc = new Scanner(System.in);
    char simbolo = (char) 42;
    String palabra = "Lingolyn";
    String titulo = String.valueOf(simbolo).repeat(10) + palabra + String.valueOf(simbolo).repeat(10);
    System.out.println(titulo);
    System.out.println("¡Bienvenido a Lingolyn!");
    System.out.println("Por favor, ingresa tu nombre (como quieres que te llamemos);");
    nombre = sc.nextLine();
    System.out.println("Hola " + nombre + ", ¿Qué modo deseas practicar?");
    System.out.println("1. Spelling Bee (deletreo)");
    System.out.println("2. Vocabulario (ampliar palabras)");
    int opcionprincipal = 0;
    while (opcionprincipal != 1 && opcionprincipal != 2)
    {
        System.out.println("Elige 1 o 2:");
        opcionprincipal = sc.nextInt();
        if (opcionprincipal != 1 && opcionprincipal != 2)
        {
            System.out.println("?");
            System.out.println("Opción invalida");
            System.out.println("Debes ingresar 1 o 2.");
            System.out.println("Intenta de nuevo.");
            opcionprincipal = sc.nextInt();
        }
        if (opcionprincipal == 1 || opcionprincipal == 2)
        {
            switch (opcionprincipal)
            {
                case 1:
                    System.out.println(nombre + ", elegiste: Spelling Bee.");
                    System.out.println("Ahora elige la modalidad");
                    System.out.println("1. Modalidad Tradicional");
                    System.out.println("2. Modalidad Retos y Juegos");
                    int modalidadSpellingBee = 0;
                    while ( modalidadSpellingBee != 1 && modalidadSpellingBee !=2 )
                    {
                        System.out.println("Ingresa 1 o 2:");
                        modalidadSpellingBee = sc.nextInt();
                        if (modalidadSpellingBee != 1 && modalidadSpellingBee != 2)
                        {
                            System.out.println("?");
                            System.out.println("Opción invalida");
                            System.out.println("Esa opción no corresponde a ninguna modalidad.");
                            System.out.println("Intenta nuevamente.");
                            modalidadSpellingBee = sc.nextInt();
                        }
                        if ( modalidadSpellingBee == 1 || modalidadSpellingBee ==2 )
                        {
                            switch (modalidadSpellingBee)
                            {
                                case 1:
                                    modalidadTradicionalSpellingBee();
                                    break;
                                case 2:
                                    modalidadRetosyJuegosSpellingBee();
                                    break;
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println(nombre + ", elegiste: Vocabulario.");
                    System.out.println("Ahora elige la modalidad");
                    System.out.println("1. Modalidad Tradicional");
                    System.out.println("2. Modalidad Juegos");
                    int modalidadVocabulario = 0;
                    while ( modalidadVocabulario != 1 && modalidadVocabulario !=2 )
                    {
                        System.out.println("Ingresa 1 o 2:");
                        modalidadVocabulario = sc.nextInt();
                        if (modalidadVocabulario != 1 && modalidadVocabulario != 2)
                        {
                            System.out.println("?");
                            System.out.println("Opción invalida");
                            System.out.println("Esa opción no corresponde a ninguna modalidad.");
                            System.out.println("Intenta nuevamente.");
                            modalidadVocabulario = sc.nextInt();
                        }
                        if ( modalidadVocabulario == 1 || modalidadVocabulario ==2 )
                        {
                            switch (modalidadVocabulario)
                            {
                                case 1:
                                    modalidadTradicionalVocabulario();
                                    break;
                                case 2:
                                    modalidadJuegosVocabulario();
                                    break;
                            }
                        }
                    }

                    break;
            }
        }
    }
}

private static void modalidadTradicionalSpellingBee()
{

    System.out.println("Has elegido la Modalidad Tradicional");
}

private static void modalidadRetosyJuegosSpellingBee()
{
    System.out.println("Has elegido la modalidad Retos y Juegos");
}
private static void modalidadTradicionalVocabulario()
{

}
private static void modalidadJuegosVocabulario()
{

}