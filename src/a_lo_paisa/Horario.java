/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;
import java.util.*;
/**
 *
 * @author Lin4
 */
public class Horario {
    public Empleados empleado;
    private Calendar c1=Calendar.getInstance();
    public int dia;
    public int mes;
    public int annio;
    private int h_entrada;
    private int h_salida;
    public Horario(Empleados empleado, int h_entrada){
        this.empleado=empleado;
        this.h_entrada=h_entrada;
        this.dia = c1.get(Calendar.DATE);
        this.mes = c1.get(Calendar.MONTH);
        this.annio = c1.get(Calendar.YEAR);
    }
    
}
