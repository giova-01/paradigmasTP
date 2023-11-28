package gestionDeAlumnos.product;

import java.util.Date;

public class ConcreteProductAlumno extends  AbstractProductPersona{
    private int legajo;

    public ConcreteProductAlumno(String nombre, String apellido, String DNI, byte edad, Date nacimiento, int legajo) {
        super(nombre, apellido, DNI, edad, nacimiento);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
