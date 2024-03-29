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
    //getters
    public String getCodFrutita() {
        return codFrutita;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }
    //setters
    public void setCodFrutita(String codFrutita) {
        this.codFrutita = codFrutita;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Frutitas{");
        sb.append("código: ").append(codFrutita);
        sb.append(", nombre ").append(nombre);
        sb.append(", peso ").append(peso);
        sb.append('}');
        return sb.toString();
    }
    
}
