/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 * Clase para almacenar materia prima.
 * @author Lina Paola Correa 
 * @author Diego Alejandro Guitierrez Rojas
 * @author Diego Alezander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
public class Bodega {
    private int cod;
    private String mprima;
    private int cantidad;
    private double precio_und;
    /**
     * Constructor del producto en Bodega
     */
    public Bodega() {
        this.mprima = new String();
    }
    /**
     * Metodo que muestra el codigo del producto
     * @return el codigo del producto
     */
    public int getCod() {
        return cod;
    }
    /**
     * Metodo para registrar el codigo del producto
     * @param cod int con el codigo del producto
     */
    public void setCod(int cod) {
        this.cod = cod;
    }
    /**
     * Metodo que muestra el nombre del producto
     * @return el nombre del producto en bodega
     */

    public String getMprima() {
        return mprima;
    }
    /**
     * Metodo que recoge el nombre del producto
     * @param mprima String con el nombre del producto
     */

    public void setMprima(String mprima) {
        this.mprima = mprima;
    }
    /**
     * Metodo que muestra la cantidad del producto en bodega
     * @return la cantidad de producto en bodega 
     */

    public int getCantidad() {
        return cantidad;
    }
    /**
     * Metodo que recoge la cantidad del producto
     * @param cantidad int con la cantidad del producto
     */

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * Metodo que muestra el precio unitario del producto en bodega
     * @return el precio unitario del producto
     */

    public double getPrecio_und() {
        return precio_und;
    }
    /**
     * Metodo que recoge el precio unitario del producto
     * @param precio_und double con el precio del producto
     */

    public void setPrecio_und(double precio_und) {
        this.precio_und = precio_und;
    }
    
}
