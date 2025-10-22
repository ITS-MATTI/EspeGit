/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.constructor;

/**
 *
 * @author pc
 */

public class Persona {
    String nombre;
    int edad;

    public Persona() {
        nombre = "Sin nombre";
        edad = 0;
    }

    public Persona(String nombrePersona, int edadPersona) {
        nombre = nombrePersona;
        edad = edadPersona;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("--------------------");
    }
}
