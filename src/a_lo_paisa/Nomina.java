/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 *
 * @author Usuario
 */
public class Nomina {
    private double basico;
    private double comisiones;
    private int h_extras;
    private double auxtransp;
    public double extras;
    public Nomina() {
        this.basico = basico;
        this.comisiones = 0;
        this.h_extras = 0;
        this.auxtransp = auxtransp;
        this.extras=30;
    }   
    public void setBasico(double basico) {
        this.basico = basico;
    }
    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }
    public void setH_extras(int h_extras) {
        this.h_extras = h_extras*(int)extras;
    }
    public void setAuxtransp(double auxtransp) {
        this.auxtransp = auxtransp;
    }
    public double getBasico() {
        return basico;
    }
    public double getComisiones() {
        return comisiones;
    }
    public double getH_extras() {
        return h_extras;
    }
    public double getAuxtransp() {
        return auxtransp;
    }
    public double sacarNomina(){
        double Total=getBasico()+getComisiones()+getH_extras()+getAuxtransp();
        return Total;
    }
}
