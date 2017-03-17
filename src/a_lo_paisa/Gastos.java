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
public class Gastos {
    private double Tot;
    private double servicios;
    private double arriendos;
    private double compras;
    private double impuestos;
    private Nomina nomina;
    private Fecha fecha;
    /**
     * Constructor de los gastos en una fecha
     */
    public Gastos() {
        this.nomina=new Nomina();
        this.Tot=0;
        this.fecha=new Fecha();
    }
    /**
     * Metodo que muestra el total de los gastos en una fecha
     * @return el total del gasto en una fecha 
     */

    public double getTot() {
        return Tot;
    }
    /**
     * Metodo que muestra la nomina 
     * @return el total de la nomina
     */

    public double getNomina() {
        return nomina.sacarNomina();
    }
    /**
     * Metodo que recibe una nomina
     * @param nomina Nomina con la nomina
     */
    
    public void setNomina(Nomina nomina) {    
        this.nomina = nomina;
    }
    /**
     * Metodo que calcula el total
     */
    public void setTot() {
        this.Tot = Tot+getServicios()+getImpuestos()+getArriendos()+getCompras()+getNomina();
    }
    /**
     * Metodo que muestra el gasto en servicios
     * @return el gasto en servicios
     */

    public double getServicios() {
        return servicios;
    }
    /**
     * Metodo que recibe el pago de servicios
     * @param servicios double con el precio de los servicios
     */

    public void setServicios(double servicios) {
        this.servicios = servicios;
    }
    /**
     * Metodo que muestra el pago de arriendo
     * @return el pago de arriendo
     */

    public double getArriendos() {
        return arriendos;
    }
    /**
     * Metodo que recibe el precio de los arriendos
     * @param arriendos double con el precio de los arriendos
     */

    public void setArriendos(double arriendos) {
        this.arriendos = arriendos;
    }
    /**
     * Metodo que muestra el pago de compras 
     * @return el pago de las compras
     */

    public double getCompras() {
        return compras;
    }
    /**
     * Metodo que recibe el precio de las compras
     * @param compras double con el precio de las compras
     */

    public void setCompras(double compras) {
        this.compras = compras;
    }
    /**
     * Metodo que muestra el pago de impuestos
     * @return el pago de impuestos
     */

    public double getImpuestos() {
        return impuestos;
    }
    /**
     * Metodo que recibe el precio de los impuestos
     * @param impuestos double con el precio de los impuestos
     */

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
    /**
     * Metodo que muestra la fecha
     * @return la fecha
     */

    public Fecha getFecha() {
        return fecha;
    }
    /**
     * Metodo que recibe una fecha
     * @param fecha Fecha con la fecha
     */

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
   
}
