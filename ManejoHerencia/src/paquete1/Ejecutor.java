/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.List;
import static java.util.Locale.US;
import java.util.Scanner;
import paquete2.*;
import paquete3.*;
import paquete4.*;
import paquete5.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        List<Prestamo> prestamos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(US);

        int opcion;
        do {
            System.out.println("===================MENU====================");
            System.out.println("Prestamo Auto                           [1]");
            System.out.println("Prestamo Educativo                      [2]");
            System.out.println("Salir                                   [3]");
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextInt();
            System.out.println("===========================================");
            entrada.nextLine();

            if (opcion == 1) {
                System.out.println("==========PRESTAMO AUTOMOVIL==========");

                System.out.print("Ingrese el nombre del 1 beneficiario: ");
                String nB = entrada.nextLine();

                System.out.print("Ingrese el apellido del 1 beneficiario: ");
                String aB = entrada.nextLine();

                System.out.print("Ingrese el username del beneficiario: ");
                String uB = entrada.nextLine();

                System.out.print("Ingrese el plazo del prestamo en meses: ");
                int pP = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Ingrese la ciudad del prestamo: ");
                String ciudadP = entrada.nextLine();

                System.out.print("Ingrese el tipo de auto: ");
                String tipoA = entrada.nextLine();

                System.out.print("Ingrese la marca de auto: ");
                String marcaA = entrada.nextLine();

                System.out.print("Ingrese el nombre del garante: ");
                String nG = entrada.nextLine();

                System.out.print("Ingrese el apellido del garante: ");
                String aG = entrada.nextLine();

                System.out.print("Ingrese el username del garante: ");
                String uG = entrada.nextLine();

                System.out.print("Ingrese el valor del auto: ");
                double valorA = entrada.nextDouble();
                entrada.nextLine();

                Persona beneficiario = new Persona(nB, aB, uB);
                Persona garante = new Persona(nG, aG, uG);

                PrestamoAutomovil prestamoAuto = new PrestamoAutomovil(beneficiario,
                        pP, ciudadP, tipoA, marcaA, garante, valorA);

                prestamos.add(prestamoAuto);

            } else if (opcion == 2) {
                System.out.println("===========PRESTAMO AUTOMOVIL===========");

                System.out.print("Ingrese el nombre del beneficiario: ");
                String nE = entrada.nextLine();

                System.out.print("Ingrese el apellido del beneficiario: ");
                String aE = entrada.nextLine();

                System.out.print("Ingrese el username del beneficiario: ");
                String uE = entrada.nextLine();

                System.out.print("Ingrese el tiempo de préstamo en meses: ");
                int pP = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Ingrese la ciudad del préstamo: ");
                String ciudadP = entrada.nextLine();

                System.out.print("Ingrese el nivel de estudio: ");
                String nivelE = entrada.nextLine();

                System.out.print("Ingrese el nombre de la institución "
                        + "educativa: ");
                String institucionE = entrada.nextLine();

                System.out.print("Ingrese el acronimo de la institución "
                        + "educativa: ");
                String acronimo = entrada.nextLine();

                System.out.print("Ingrese el valor de la carrera: ");
                double valorC = entrada.nextDouble();
                entrada.nextLine();

                Persona beneficiario = new Persona(nE, aE, uE);
                institucion institucionEducativa = new institucion(institucionE, 
                        acronimo);

                PrestamoEducativo p = new PrestamoEducativo(beneficiario, pP, 
                        ciudadP,nivelE, institucionEducativa, valorC);
                prestamos.add(p);
            }
        } while (opcion != 3);
        System.out.println("Lista de préstamos realizados: ");
        
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}
