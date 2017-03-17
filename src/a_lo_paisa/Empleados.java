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
public class Empleados {
    private String nombre;
    private int id;
    private String cargo;
    private Nomina salario;
    private ArrayList <Horario> hora;
   /**
 * Clase para almacenar materia prima.
 * @author Lina Paola Correa 
 * @author Diego Alejandro Guitierrez Rojas
 * @author Diego Alezander Ramirez Vela
 * @author Julian David Escobar Jamioy
 */
    public Empleados() {
        this.nombre = new String();
        this.salario = new Nomina();
        this.cargo=new String();
        this.hora=new ArrayList<Horario>();
    }
    /**
     * Metodo que muestra el  nombre del empleado
     * @return el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que muestra la identificacion del empleado
     * @return la ID del empleado
     */
    public int getId() {
        return id;
    }
    /**
     * Metodo que muestra el cargo de cada empleado
     * @return el cargo del empleado
     */
    public String getCargo() {
        return cargo;
    }
    /**
     * Metodo que muestra la Nomina del empleado
     * @return nomina del empleado
     */
    public Nomina getSalario() {
        return salario;
    }
    /**
     * Metodo que recibe el nombre del empleado
     * @param nombre String con el nombre del empleado
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que recibe el ID del empleado
     * @param id int con el ID del empleado
     */

    public void setId(int id) {
        this.id = id;
    }
    /**
     * Metodo que recibe el cargo del empleado
     * @param cargo String con el cargo del empleado
     */

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    /**
     * Metodo que recibe el salario basico del empleado
     * @param salario double con el salario basico
     */

    public void setSalario(double salario) {
        this.salario.setBasico(salario);
    }    
}
