/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.constructor;

/**
 *
 * @author pc
 */

public class Estudiante {
    String nombre;
    String carrera;
    int edad;

    public Estudiante() {
        nombre = "Sin nombre";
        carrera = "No definida";
        edad = 0;
    }

    public Estudiante(String nombreEstudiante, String carreraEstudiante, int edadEstudiante) {
        nombre = nombreEstudiante;
        carrera = carreraEstudiante;
        edad = edadEstudiante;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);
        System.out.println("--------------------");
    }
}
