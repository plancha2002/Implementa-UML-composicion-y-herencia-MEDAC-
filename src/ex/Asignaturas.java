package ex;



import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Asignaturas {


    private String nombre;

    private static ArrayList<Estudiante> estudiantes;


    public Asignaturas(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<Estudiante>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return este metodo nos va a devolver la lista de estudiantes de la 
     * asigantura que le indiquemos
     */
    public ArrayList<Estudiante> listaEstudiantes() {
        return estudiantes;

    }

    @Override
    public String toString() {
        return "Esta matriculado en: " + nombre;
    }

    /**
     * 
     * @param e que sera un Objeto de tipo Estudiante
     * @func agregara al estudiante dato en la practica lo aremos con matricular
     */
    public static void matricularAlumno(Estudiante e) {
        estudiantes.add(e);


    }
    
    /**
     * 
     * @param e que sera el objeto estudiante
     * @param a que sera el objeto asignatura
     * @func nos unira el metodo matricular alumno y matricular asignatura en uno solo
     * para facilitar la sintaxis
     */
    public static void matricular(Estudiante e, Asignaturas a) {
        matricularAlumno(e);
        Estudiante.matricularAsignatura(a);
    }

    
    public static void darDeBajaEstudiante(Estudiante estudiante){
        estudiantes.remove(estudiante);
    }

    public static void baja(Estudiante estudiante, Asignaturas asignatura){
        darDeBajaEstudiante(estudiante);
        Estudiante.darDeBajaAsignatura(asignatura);
    }
}
