/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.constructor;

/**
 *
 * @author pc
 */

public class Profesor {
    String nombre;
    String especialidad;
    int edad;

    public Profesor() {
        nombre = "Sin nombre";
        especialidad = "General";
        edad = 0;
    }

    public Profesor(String nombreProfesor, String especialidadProfesor, int edadProfesor) {
        nombre = nombreProfesor;
        especialidad = especialidadProfesor;
        edad = edadProfesor;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Edad: " + edad);
        System.out.println("--------------------");
    }
}
