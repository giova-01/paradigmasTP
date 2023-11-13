package gestionDeAlumnos.product;

public class ConcreteProfuctProfesor extends AbstractProductPersona{
    private String cv;

    public ConcreteProfuctProfesor(String nombre, String apellido, String DNI, byte edad, String cv) {
        super(nombre, apellido, DNI, edad);
        this.cv = cv;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}
