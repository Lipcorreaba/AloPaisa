/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;
import java.util.*;
/**
 *Clase para almacenar el horario de cada empleado en cada dia
 * @author Lin4
 */
public class Horario {
    private Empleados empleado;
    private int h_entrada;
    private int h_salida;
    private Fecha fecha;
   /**
 * Clase para almacenar materia prima.
 * @author Lina Paola Correa 
 * @author Diego Alejandro Guitierrez Rojas
 * @author Diego Alezander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
    public Horario(){
        this.empleado=new Empleados();
        this.h_entrada=0;
        this.h_salida=0;
        this.fecha=new Fecha();    
    }/**
     * Metodo que recibe el empleado
     * @param empleado Empleados con el empleado correspondiente
     */

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }
    /**
     * Metodo que recibe la hora de entrada del empleado
     * @param h_entrada int con la hora de entrada del empleado
     */
    
    public void setH_entrada(int h_entrada) {
        this.h_entrada = h_entrada;
    }
    /**
     * Metodo que recibe la hora de salida del empleado
     * @param h_salida int con la hora de salida del empleado
     */

    public void setH_salida(int h_salida) {
        this.h_salida = h_salida;
    }
    /**
     * Metodo que muestra la fecha
     * @return la fecha
     */

    public Fecha getFecha() {
        return fecha;
    }
    
    
}
