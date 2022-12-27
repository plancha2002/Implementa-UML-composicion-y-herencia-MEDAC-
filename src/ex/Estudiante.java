package ex;

import java.util.ArrayList;

public class Estudiante extends Persona {

    private float nota_media;

    private static ArrayList<Asignaturas> asignaturas;

    public Estudiante(String nombre, String DNI, float nota_media) {
        super(nombre, DNI);
        this.nota_media = nota_media;
        this.asignaturas = new ArrayList<Asignaturas>();

    }

    public float getNota_media() {
        return nota_media;
    }

    public void setNota_media(float nota_media) {
        this.nota_media = nota_media;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nota_media=" + nota_media +
                ", nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
//metodos

    public ArrayList<Asignaturas> listaAsignaturas() {
        return asignaturas;
    }

    public static void matricularAsignatura(Asignaturas asignatura) {
        asignaturas.remove(asignatura);

    }

    public static void darDeBajaAsignatura(Asignaturas asignatura){
        asignaturas.remove(asignatura);
    }



}
