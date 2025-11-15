package org.example;
import java.util.Scanner;
public class Application 
{
    static String nombre;

    public static void main(String[] args) 
    {
        moduloGeneral();
        moduloTradicionalSpellingBe();
    }
    

    private static void moduloGeneral() 
    {
        Scanner sc = new Scanner(System.in);
        char simbolo = (char) 42;
        String palabra = "Lingolyn";
        String titulo = String.valueOf(simbolo).repeat(8) + palabra + String.valueOf(simbolo).repeat(8);
        System.out.println(titulo);
        System.out.println("¡Bienvenido a Lingolyn!");
        System.out.println("Por favor, ingresa tu nombre (como quieres que te llamemos);");
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre + ", ¿Qué modo deseas practicar?");
        System.out.println("1. Spelling Bee (deletreo)");
        System.out.println("2. Vocabulario (ampliar palabras)");
        int opc1 = 0;
        while (opc1 != 1 && opc1 != 2) {
            System.out.println("Elige 1 o 2:");
            opc1 = sc.nextInt();
            if (opc1 != 1 && opc1 != 2) {
                System.out.println("?");
                System.out.println("Opción invalida");
                System.out.println("Debes ingresar 1 o 2.");
                System.out.println("Intenta de nuevo.");
                opc1 = sc.nextInt();
            }
            if (opc1 == 1 || opc1 == 2) {
                if (opc1 == 1) {
                    System.out.println(nombre + ", elegiste: Spelling Bee.");
                    System.out.println("Ahora elige la modalidad");
                    System.out.println("1. Modalidad Tradicional");
                    System.out.println("2. Modalidad Retos y Juegos");
                    System.out.println("Ingresa 1 o 2:");
                    int opcs = sc.nextInt();
                    

                } else if (opc1 == 2) {
                    System.out.println(nombre + ", elegiste: Vocabulario.");
                    System.out.println("Ahora elige la modalidad");
                    System.out.println("1. Modalidad Tradicional");
                    System.out.println("2. Modalidad Juegos");
                    System.out.println("Ingresa 1 o 2:");
                    int opcv = sc.nextInt();
                }
            }
        }
    }
    
    private static void moduloTradicionalSpellingBe() 
    {
        
    }
}
