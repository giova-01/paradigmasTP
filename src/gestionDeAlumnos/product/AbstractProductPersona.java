package gestionDeAlumnos.product;

import java.util.Date;

public abstract class AbstractProductPersona {
    private String nombre;
    private String apellido;
    private String DNI;
    private byte edad;
    private Date nacimiento;

    public AbstractProductPersona() {

    }

    public AbstractProductPersona(String nombre, String apellido, String DNI, byte edad, Date nacimiento) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
        this.nacimiento = nacimiento;
    }
}
