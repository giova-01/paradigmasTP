package gestion.Usuarios;

import java.text.SimpleDateFormat;
import java.util.Date;

class ContadorAlumnos {
    private static ContadorAlumnos instancia = null;
    private int contador;

    private ContadorAlumnos() {
        contador = 1;
    }

    public static ContadorAlumnos getInstancia() {
        if (instancia == null) {
            instancia = new ContadorAlumnos();
        }
        return instancia;
    }

    public int getContador() {
        return contador++;
    }
}
class Usuario {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected Date fechaNacimiento;
    protected int edad;

    public Usuario(String nombre, String apellido, String dni, Date fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }
}

