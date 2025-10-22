/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.ec.constructor;

/**
 *
 * @author pc
 */

public class Vehiculo {
    String marca;
    int anio;

    public Vehiculo() {
        marca = "Sin marca";
        anio = 2000;
    }

    public Vehiculo(String marcaVehiculo, int anioVehiculo) {
        marca = marcaVehiculo;
        anio = anioVehiculo;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
        System.out.println("--------------------");
    }
}
