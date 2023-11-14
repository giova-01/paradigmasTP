package gestionDeAlumnos.cursos;

import java.util.List;

public class Curso {
    private final String nombre;
    private final String catedra;
    private final String descripcion;
    private final String profesor;
    private final double costo;
    private final boolean isOnline;
    private final List listadoAlumnos;


    public Curso(Builder builder) {
        this.nombre = builder.nombre;
        this.catedra = builder.catedra;
        this.descripcion = builder.descripcion;
        this.profesor = builder.profesor;
        this.costo = builder.costo;
        this.isOnline = builder.isOnline;
        this.listadoAlumnos = builder.listadoAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCatedra() {
        return catedra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getProfesor() {
        return profesor;
    }

    public double getCosto() {
        return costo;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public List getListadoAlumnos() {
        return listadoAlumnos;
    }

    @Override
    public String toString() {
        return  "\n[Curso\n" +
                "Nombre = " + nombre + "\n" +
                "Catedra = " + catedra + "\n" +
                "Descripcion = " + descripcion + "\n" +
                "Profesor = " + profesor + "\n" +
                "Costo = " + costo + "\n" +
                "IsOnline = " + isOnline + "\n" +
                "ListadoAlumnos = " + listadoAlumnos + "]" + "\n";
    }
    public static class Builder {

        public Curso build() {return new Curso(this);}

        private String nombre;
        private String catedra;
        private String descripcion;
        private String profesor;
        private double costo;
        private boolean isOnline;
        private List listadoAlumnos;


        public Curso.Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Curso.Builder setCatedra(String catedra) {
            this.catedra = catedra;
            return this;
        }

        public Curso.Builder setDescripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Curso.Builder setProfesor(String profesor) {
            this.profesor = profesor;
            return this;
        }

        public Curso.Builder setCosto(double costo) {
            this.costo = costo;
            return this;
        }

        public Curso.Builder setOnline(boolean online) {
            isOnline = online;
            return this;
        }

        public Curso.Builder setListadoAlumnos(List listadoAlumnos) {
            this.listadoAlumnos = listadoAlumnos;
            return this;
        }
    }
}


