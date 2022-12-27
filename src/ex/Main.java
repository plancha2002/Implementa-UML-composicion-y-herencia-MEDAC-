/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex;

import java.util.Scanner;

/**
 *
 * @author eplan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int alumno;
        int asinatura;
        //declaramos una lista con tres estudiantes
        Estudiante[] listaE=new Estudiante[3];
        
        listaE[0]= new Estudiante("Eduardo", "55080612M", 5.5f);
        listaE[1] = new Estudiante("Pablo", "6785439L", 5.0f);
        listaE[2] = new Estudiante("Maria", "76352784J", 7.0f);

        
        Asignaturas[] listaA = new Asignaturas[3];
        //declaramos tres asignaturas
        listaA[0] = new Asignaturas("Matematicas");
        listaA[1] = new Asignaturas("Lengua");
        listaA[2] = new Asignaturas("Ciencias");
        
        /*
        Estas declaraciones se hacen con el objetibo de tener ordenados asignaturas 
        y estudiantes para un menu de seleccion. Tambien podriamso hacerlo con un ArrayList para
        no condicionarnos al largo de la lista
        */


        menu(listaE, listaA);
        
 
    }

    public static void menu(Estudiante[] listaE, Asignaturas[] listaA) {
        int opcion;
        do {
            int opcionNumE;
            int opcionNumA;

            Scanner input = new Scanner(System.in);
            System.out.println("--------------------------");
            System.out.println("|¿Que desea hacer?");
            System.out.println("|1.- dar de alta a un alumno en una clase");
            System.out.println("|2.- dar de baja a un alumno de una clase");
            System.out.println("|3.- ver lista de asiganturas de un alumno");
            System.out.println("|4.- ver lista de estudiantes en una asigantura");
            System.out.println("|5.- salir");
            System.out.println("--------------------------");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione un alumno");

                    for (int i = 0; i < listaE.length; i++) {

                        System.out.println(i + 1 + ".- " + listaE[i].getNombre());

                    }
                    System.out.print(":");
                    opcionNumE = input.nextInt()-1;
                    System.out.println("Seleccione la asignatura en que quiere matricular al estudiante " + listaE[opcionNumE].getNombre());

                    for (int i = 0; i < listaA.length; i++) {

                        System.out.println(i + 1 + ".- " + listaA[i].getNombre());

                    }

                    System.out.print(":");
                    opcionNumA = input.nextInt()-1;

                    Asignaturas.matricular(listaE[opcionNumE], listaA[opcionNumA]);

                    System.out.println("¡Listo!");
                    System.out.println(listaE[opcionNumE].listaAsignaturas());

                    break;

                case 2:
                    System.out.println("Seleccione un alumno para dar de baja de una materia");

                    for (int i = 0; i < listaE.length; i++) {

                        System.out.println(i + 1 + ".- " + listaE[i].getNombre());

                    }
                    System.out.print(":");
                    opcionNumE = input.nextInt()-1;
                    System.out.println("Seleccione la asignatura en que quiere dar de baja al estudiante " + listaE[opcionNumE].getNombre());

                    for (int i = 0; i < listaA.length; i++) {

                        System.out.println(i + 1 + ".- " + listaA[i].getNombre());

                    }

                    System.out.print(":");
                    opcionNumA = input.nextInt()-1;

                    Asignaturas.baja(listaE[opcionNumE], listaA[opcionNumA]);

                    System.out.println("¡Listo!");
                    System.out.println(listaE[opcionNumE].listaAsignaturas());

                    break;
                case 3:
                    System.out.println("Seleccione un alumno para ver su lista de asignaturas");

                    for (int i = 0; i < listaE.length; i++) {

                        System.out.println(i + 1 + ".- " + listaE[i].getNombre());

                    }
                    System.out.print(":");
                    opcionNumE = input.nextInt()-1;
                    System.out.println(listaE[opcionNumE].listaAsignaturas());

                    break;
                case 4:
                    System.out.println("Seleccione una materia para ver los alumnos matriculados");

                    for (int i = 0; i < listaA.length; i++) {

                        System.out.println(i + 1 + ".- " + listaA[i].getNombre());

                    }
                    System.out.print(":");
                    opcionNumA = input.nextInt()-1;
                    System.out.println(listaA[opcionNumA].listaEstudiantes());

                    break;

            }
        } while (opcion != 5);

    }

}
