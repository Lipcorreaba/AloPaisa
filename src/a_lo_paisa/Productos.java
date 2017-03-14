/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 *
 * @author Usuario
 */
public class Productos {
    private String nom;
    private double precio;
    private Bodega[] ingred;
    public Productos() {
        this.nom = new String();
        this.precio = 0;
        this.ingred=new Bodega[6];
    } 
    public String getNom() {
        return nom;
    }
    public double getPrecio() {
        return precio;
    }
    
}
