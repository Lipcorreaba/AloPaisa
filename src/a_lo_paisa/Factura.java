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
public class Factura {
    private int id;
    private HashMap<String,Productos> b;
    private Fecha fecha;
    /**
     * Constructor de factura
     */
    public Factura(){
        this.fecha=new Fecha();
        this.b = new HashMap<>();
    }

    Factura(int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Metodo que muestra el ID de la factura
     * @return el  ID de la factura
     */

    public int getId() {
        return id;
    }
    /**
     * Metodo que recibe el ID de la factura
     * @param id int con el ID de la factura
     */

    public void setId(int id) {
        this.id = id;
    }
    /**
     * Metodo que muestra la coleccion de productos
     * @return la coleccion de productos
     */

    public HashMap<String, Productos> getB() {
        return b;
    }
    /**
     * Metodo que recibe una coleccion de productos
     * @param b Hashmap con la coleccion de productos
     */

    public void setB(HashMap<String, Productos> b) {
        this.b = b;
    }
    /**
     * Muestra la fecha 
     * @return la fecha
     */

    public Fecha getFecha() {
        return fecha;
    }
    /**
     * Metodo que recoge una fecha
     * @param fecha Fecha con la fecha en que se hizo la factura
     */

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    /**
     * Metodo que permite adicionar productos a la factura
     * @param p Productos con el producto
     */
    
    public void adicionar(Productos p){
        this.b.put(p.getNombre(),p);
        
    }
    /**
     * Metodo que calcula el total de la factura
     * @return el total de la factura
     */
    
    public double calcularTotal(){
        double total = 0;
        for (Productos p: b.values()){
            total+=p.getPrecio();
        }
        return total;
    }
}
