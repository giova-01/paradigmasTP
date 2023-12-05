package gestion.Usuarios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alumno extends Usuario {
    private final String legajo;
    private final int id;

    private Alumno(AlumnoBuilder builder) {
        super(builder.nombre, builder.apellido, builder.dni, builder.fechaNacimiento, builder.edad);
        this.legajo = builder.legajo;
        this.id = ContadorAlumnos.getInstancia().getContador();
    }

    public String getLegajo() {
        return legajo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo='" + legajo + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                '}';
    }

    public static class AlumnoBuilder {
        String nombre;
        String apellido;
        String dni;
        Date fechaNacimiento;
        int edad;
        private String legajo;

        public AlumnoBuilder(String nombre, String apellido, String dni) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
        }

        public AlumnoBuilder fechaNacimiento(Date fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public AlumnoBuilder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public AlumnoBuilder legajo() {
            // Lógica para generar el legajo según los requisitos
            SimpleDateFormat dateFormat = new SimpleDateFormat("yy");
            String ultimosDigitosDNI = dni.substring(dni.length() - 3);
            legajo = ultimosDigitosDNI + "-" + dateFormat.format(new Date()) + "-" + ContadorAlumnos.getInstancia().getContador();
            return this;
        }

        public Alumno build() {
            return new Alumno(this);
        }
    }
}
