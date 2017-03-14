/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Empleados {
    private String nombre;
    private int id;
    private String cargo;
    private int h_salida;
    private int h_entrada;
    private Nomina salario;
    public Empleados(String nombre, int id, int h_salida, int h_entrada, Nomina salario) {
        this.nombre = nombre;
        this.id = id;
        this.h_salida = h_salida;
        this.h_entrada = h_entrada;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    public int getH_salida() {
        return h_salida;
    }

    public int getH_entrada() {
        return h_entrada;
    }

    public Nomina getSalario() {
        return salario;
    }
    
}
