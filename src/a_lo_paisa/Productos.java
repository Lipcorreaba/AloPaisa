/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;
import java.util.*;
/**
 * Clase para almacenar materia prima.
 * @author Lina Paola Correa 
 * @author Diego Alejandro Guitierrez Rojas
 * @author Diego Alezander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
public class Productos {
    private int cod;
    private String nom;
    private double precio;
    private ArrayList <Bodega> ingred;
    /**
     * Constructor de cada producto (platos)
     */
    public Productos() {
        this.nom = new String();
        this.ingred=new ArrayList<Bodega>();
    } 
    /**
     * Metodo que muestra el nombre del plato
     * @return el nombre del plato
     */
    public String getNombre() {
        return nom;
    }
    /**
     * Metodo que muestra el codigo de producto (plato)
     * @return el codigo del plato
     */
    public int getCod() {
        return cod;
    }
    /**
     * Metodo que recibe el codigo para el plato
     * @param cod int con el codigo del plato
     */
    public void setCod(int cod) {
        this.cod = cod;
    }
    /**
     * Metodo que permite llamar a la lista de ingredientes
     * @return la lista de ingredientes
     */

    public ArrayList<Bodega> getIngred() {
        return ingred;
    }
    /**
     * Metodo que muestra el precio del plato
     * @return el precio del plato
     */

   
    public double getPrecio() {
        return precio;
    }
    /**
     * Metodo que recibe el nombre del plato
     * @param nom String con el nombre del plato
     */

    public void setNom(String nom) {
        this.nom = nom;
    }/**
     * Metodo que recibe el precio de un plato
     * @param precio double con el precio del plato
     */

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Metodo que recibe un producto de bodega
     * @param pro Bodega con un ingrediente del plato
     */

    public void setIngred(Bodega pro) {
        this.ingred.add(pro);
    }

    
    
}
