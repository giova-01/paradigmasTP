package gestion.Usuarios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Profesor {
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaNacimiento;
    private int edad;
    private String curriculumVitae;

    public Profesor(String nombre, String apellido, String dni, Date fechaNacimiento, String curriculumVitae) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = calcularEdad();
        this.curriculumVitae = curriculumVitae;
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

    public String getCurriculumVitae() {
        return curriculumVitae;
    }

    public void setCurriculumVitae(String curriculumVitae) {
        this.curriculumVitae = curriculumVitae;
    }

    private int calcularEdad() {
        Date fechaActual = new Date();
        long diferenciaEnMillis = fechaActual.getTime() - fechaNacimiento.getTime();
        int edadEnAnios = (int) (diferenciaEnMillis / (1000 * 60 * 60 * 24 * 365.25));

        return edad;
    }
}