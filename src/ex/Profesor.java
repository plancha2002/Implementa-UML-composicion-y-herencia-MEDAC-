package ex;

public class Profesor extends Persona{

    private float sueldo;

    public Profesor() {
        super();
    }

    public Profesor(float sueldo) {
        this.sueldo = sueldo;
    }

    public Profesor(String nombre, String DNI, float sueldo) {
        super(nombre, DNI);
        this.sueldo = sueldo;
    }
}
