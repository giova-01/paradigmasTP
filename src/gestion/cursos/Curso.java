package gestion.cursos;

import gestion.Usuarios.Alumno;
import gestion.Usuarios.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private final String nombre;
    private final String catedra;
    private final String descripcion;
    private final String objetivo;
    private final String dirigidoA;
    private final Profesor profesor;
    private final double costo;
    private List<Alumno> listadoAlumnos;


    public Curso(Builder builder) {
        this.nombre = builder.nombre;
        this.catedra = builder.catedra;
        this.descripcion = builder.descripcion;
        this.objetivo = builder.objetivo;
        this.dirigidoA = builder.dirigidoA;
        this.profesor = builder.profesor;
        this.costo = builder.costo;
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

    public String getObjetivo() {
        return  objetivo;
    }

    public  String getDirigidoA() {
        return  dirigidoA;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public double getCosto() {
        return costo;
    }

    public List<Alumno> getListadoAlumnos() {
        return listadoAlumnos;
    }

    @Override
    public String toString() {
        return  "\n[Curso\n" +
                "Nombre = " + nombre + "\n" +
                "Catedra = " + catedra + "\n" +
                "Descripcion = " + descripcion + "\n" +
                "Objetivo = " + objetivo + "\n" +
                "DirigidoA = " + dirigidoA + "\n" +
                "Profesor = " + profesor + "\n" +
                "Costo = " + costo + "\n" +
                "ListadoAlumnos = " + listadoAlumnos + "]" + "\n";
    }
    public static class Builder {

        public Curso build() {return new Curso(this);}

        private String nombre;
        private String catedra;
        private String descripcion;
        private String objetivo;
        private String dirigidoA;
        private Profesor profesor;
        private double costo;
        private List<Alumno> listadoAlumnos;


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

        public Curso.Builder setObjetivo(String objetivo) {
            this.objetivo = objetivo;
            return this;
        }

        public  Curso.Builder setDirigidoA (String dirigidoA) {
            this.dirigidoA = dirigidoA;
            return  this;
        }

        public Curso.Builder setProfesor(Profesor profesor) {
            this.profesor = profesor;
            return this;
        }

        public Curso.Builder setCosto(double costo) {
            this.costo = costo;
            return this;
        }

        public Curso.Builder setListadoAlumnos(List<Alumno> listadoAlumnos) {
            this.listadoAlumnos = listadoAlumnos;
            return this;
        }
    }
}


