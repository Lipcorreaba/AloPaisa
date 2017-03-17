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
public class Nomina {
    private double basico;
    private double comisiones;
    private int h_extras;
    private double auxtransp;
    public double extras;
    /**
     * Contructor de una Nomina para un empleado
     */
    public Nomina() {
        this.auxtransp = 0;
        this.extras=30;
    }  
    /**
     * Metodo que recibe el salario basico 
     * @param basico double con el salario basico de un empleado
     */
    public void setBasico(double basico) {
        this.basico = basico;
    }
    /**
     * Metodo que recibe el valor de las comisiones
     * @param comisiones double con valor de las comisiones
     */
    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }
    /**
     * Metodo que recibe las horas extras de un empleado
     * @param h_extras int con las horas extras
     */
    public void setH_extras(int h_extras) {
        this.h_extras = h_extras*(int)extras;
    }
    /**
     * Metodo que recibe el precio del auxilio de transporte
     * @param auxtransp duble con precio de auxilio de transporte
     */
    public void setAuxtransp(double auxtransp) {
        this.auxtransp = auxtransp;
    }
    /**
     * Metodo que muestra el basico de un empleado
     * @return el salario basico de un empleado
     */
    public double getBasico() {
        return basico;
    }
    /**
     * Metodo que muestra las comisiones de un empleado
     * @return las comisiones del empleado
     */
    public double getComisiones() {
        return comisiones;
    }
    /**
     * Metodo que muestra el precio de las horas extras
     * @return el precio de las horas extras
     */
    public double getH_extras() {
        return h_extras;
    }
    /**
     * Metodo que muestra el precio del auxilio de transporte
     * @return el precio del auxilio de transporte
     */
    public double getAuxtransp() {
        return auxtransp;
    }
    /**
     * Metodo que saca el salario completo del empleado
     * @return el salario completo del empleado
     */
    public double sacarNomina(){
        Scanner leer=new Scanner(System.in);
        setComisiones(leer.nextDouble());
        setH_extras(leer.nextInt());
        setAuxtransp(leer.nextDouble());
        double Total=getBasico()+getComisiones()+getH_extras()+getAuxtransp();
        return Total;
    }
}
