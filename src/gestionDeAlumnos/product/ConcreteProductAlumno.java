package gestionDeAlumnos.product;

public class ConcreteProductAlumno extends  AbstractProductPersona{
    private int legajo;

    public ConcreteProductAlumno(String nombre, String apellido, String DNI, byte edad, int legajo) {
        super(nombre, apellido, DNI, edad);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
