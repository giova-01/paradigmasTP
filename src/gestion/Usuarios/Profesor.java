package gestion.Usuarios;

import java.text.SimpleDateFormat;
import java.util.Date;

// Clase Docente con un constructor Builder
public class Profesor extends Usuario {
    private String curriculumVitae;
    private int id;

    private Profesor(ProfeBuilder builder) {
        super(builder.nombre, builder.apellido, builder.dni, builder.fechaNacimiento, builder.edad);
        this.curriculumVitae = builder.curriculumVitae;
        this.id = ContadorAlumnos.getInstancia().getContador();
    }


    public String getCurriculumVitae() {
        return curriculumVitae;
    }

    public static class ProfeBuilder {
        private String nombre;
        private String apellido;
        private String dni;
        private Date fechaNacimiento;
        private int edad;
        private String curriculumVitae;

        public ProfeBuilder(String nombre, String apellido, String dni,String curriculumVitae) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.curriculumVitae = curriculumVitae;
        }

        public Profesor.ProfeBuilder fechaNacimiento(Date fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Profesor.ProfeBuilder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Profesor.ProfeBuilder curriculumVitae() {
            this.curriculumVitae = curriculumVitae;
            return this;
        }

        public Profesor build() {
            return new Profesor(this);
        }
    }
}
