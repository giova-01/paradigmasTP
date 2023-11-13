package gestionDeAlumnos.factory;
import  gestionDeAlumnos.product.AbstractProductPersona;

public interface IAbstractFactory {
    public void registrarPresona(String tipo, String nombre, String apellido, String DNi, int edad);
}
