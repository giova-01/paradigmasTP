package gestion.Usuarios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alumno {
    private static int contadorAlumnos = 1;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaNacimiento;
    private int edad;
    private String legajo;

    // Constructor
    public Alumno(String nombre, String apellido, String dni, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad();
        this.legajo = generarLegajo();
        contadorAlumnos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public String getLegajo() {
        return legajo;
    }

    private int calcularEdad() {
        Date fechaActual = new Date();
        long diferenciaEnMillis = fechaActual.getTime() - fechaNacimiento.getTime();
        int edadEnAnios = (int) (diferenciaEnMillis / (1000 * 60 * 60 * 24 * 365.25));

        return edad;
    }

    private String generarLegajo() {
        SimpleDateFormat sdf = new SimpleDateFormat("yy");
        String anioActual = sdf.format(new Date());
        String ultimosDigitosDNI = dni.substring(dni.length() - 3);

        return ultimosDigitosDNI + "-" + anioActual + "-" + contadorAlumnos;
    }
}