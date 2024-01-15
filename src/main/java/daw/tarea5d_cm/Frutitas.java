/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.tarea5d_cm;

/**
 *
 * @author clara
 */
public class Frutitas {
    
    private String codFrutita;
    private String nombre;
    private double peso;//kg
    
    //constructor por defecto
    public Frutitas() {
    }
    //constructor parametizado
    public Frutitas(String codFrutita, String nombre, double peso) {
        this.codFrutita = codFrutita;
        this.nombre = nombre;
        this.peso = peso;
    }
    
}
