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
public class Fecha {
    private Calendar c1=Calendar.getInstance();
    private int dia;
    private int mes;
    private int annio;
    /**
     * Cosntructor de la fecha que hay en el ordenador
     */
    public Fecha(){
        this.dia = c1.get(Calendar.DATE);
        this.mes = c1.get(Calendar.MONTH);
        this.annio = c1.get(Calendar.YEAR);
    }
    /**
     * Constructor que recibe una fecha
     * @param dia int con el dia
     * @param mes int con el mes
     * @param annio int con el año
     */
    public Fecha(int dia, int mes, int annio) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
    }
    /**
     * Metodo que muestra el dia
     * @return el dia
     */
    
    public int getDia() {
        return dia;
    }
    /**
     * Metodo que muestra el mes 
     * @return el mes
     */
    public int getMes() {
        return mes;
    }
    /**
     * Metodo que muestra el año 
     * @return el año
     */
    public int getAnnio() {
        return annio;
    }
   
}
