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
public class Gastos {
    public double Tot=0;
    public int dia;
    public int mes;
    public int annio;
    private Calendar c1=Calendar.getInstance();
    public Gastos(double total) {
        this.Tot=Tot+total;
        this.dia = c1.get(Calendar.DATE);
        this.mes = c1.get(Calendar.MONTH);
        this.annio = c1.get(Calendar.YEAR);
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnnio() {
        return annio;
    }
}
