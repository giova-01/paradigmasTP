package gestionDeAlumnos.product;

import java.util.Date;

public class ConcreteProfuctProfesor extends AbstractProductPersona{
    private String cv;


    public ConcreteProfuctProfesor(String nombre, String apellido, String DNI, byte edad, Date nacimiento, String cv) {
        super(nombre, apellido, DNI, edad, nacimiento);
        this.cv = cv;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}
