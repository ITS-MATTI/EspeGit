    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espe.edu.ec.constructor;

/**
 *
 * @author pc
 */
public class Constructores {

 
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Ana Torres", 30);

        System.out.println("----- PERSONAS -----");
        persona1.mostrarDatos();
        persona2.mostrarDatos();

        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo vehiculo2 = new Vehiculo("Toyota", 2022);

        System.out.println("----- VEHÍCULOS -----");
        vehiculo1.mostrarDatos();
        vehiculo2.mostrarDatos();

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Carlos López", "Ingeniería en TIC", 21);

        System.out.println("----- ESTUDIANTES -----");
        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();

        Profesor profesor1 = new Profesor();
        Profesor profesor2 = new Profesor("Luis García", "Matemáticas", 45);

        System.out.println("----- PROFESORES -----");
        profesor1.mostrarDatos();
        profesor2.mostrarDatos();

        Curso curso1 = new Curso();
        Curso curso2 = new Curso("Programación Orientada a Objetos", 5);

        System.out.println("----- CURSOS -----");
        curso1.mostrarDatos();
        curso2.mostrarDatos();
    }
}


