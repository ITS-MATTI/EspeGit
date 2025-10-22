/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.constructor;

/**
 *
 * @author pc
 */

public class Curso {
    String nombre;
    int creditos;

    public Curso() {
        nombre = "Sin nombre";
        creditos = 0;
    }

    public Curso(String nombreCurso, int numeroCreditos) {
        nombre = nombreCurso;
        creditos = numeroCreditos;
    }

    public void mostrarDatos() {
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Créditos: " + creditos);
        System.out.println("--------------------");
    }
}
