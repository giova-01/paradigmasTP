package gestionDeAlumnos.product;

public abstract class AbstractProductPersona {
    private String nombre;
    private String apellido;
    private String DNI;
    private byte edad;

    public AbstractProductPersona() {

    }

    public AbstractProductPersona(String nombre, String apellido, String DNI, byte edad) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
    }
}
