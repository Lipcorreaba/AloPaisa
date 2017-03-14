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
public class A_lo_Paisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=0;
        int m=0;
        Empleados[] empleado=new Empleados[50];
        Nomina[] nomina=new Nomina[50];
        Gastos[] gastos=new Gastos[500];
        Productos[] producto=new Productos[10];
        /**/
        do{
            System.out.println("1. Registrar empleado");
            System.out.println("2. Registrar producto");
            System.out.println("3. Registrar gastos");
            System.out.println("4. Registrar entradas");
            System.out.println("5. Registrar hora entrada");
            System.out.println("6. Registrar hora salida");
            System.out.println("7. Consulta");
            Scanner leer= new Scanner(System.in);
            int ch=leer.nextInt();
            switch(ch){
                case 1:
                    int a=0;                   
                    System.out.println("Id");
                    int id=leer.nextInt();
                    System.out.println("Nombre");
                    String nom=leer.next();
                    System.out.println("Hora de entrada");
                    int h_ent=leer.nextInt();
                    System.out.println("Hora de salida");
                    int h_sal=leer.nextInt();
                    System.out.println("Salario basico");
                    double basico=leer.nextDouble();
                    System.out.println("Auxilio de transporte");
                    double transp=leer.nextDouble();                   
                    nomina[a]=new Nomina();
                    nomina[a].setBasico(basico);
                    nomina[a].setAuxtransp(transp);
                    empleado[a]=new Empleados(nom, id, h_sal, h_ent, nomina[a]);
                    break;
                case 2:
                    break;
                case 3:
                    int b=-1;
                    System.out.println("1. Nomina");
                    System.out.println("2. Productos");
                    System.out.println("3. Arriendo");
                    System.out.println("4. Servicios");
                    System.out.println("5. Otras compras");
                    int ch1=leer.nextInt();
                    switch(ch1){
                        case 1:
                            do{
                            System.out.println("Ingrese Id del empleado");
                            int id1=leer.nextInt();
                            do{
                                b++;
                                if(id1==empleado[b].getId()){
                                    System.out.println("Ingrese comisiones");
                                    double comisiones=leer.nextDouble();
                                    System.out.println("Ingres horas extras");
                                    int h_ext=leer.nextInt();
                                    nomina[b].setComisiones(comisiones);
                                    nomina[b].setH_extras(h_ext);
                                    gastos[n]=new Gastos(nomina[b].sacarNomina());
                                    n++;
                                }
                            }while(id1!=empleado[b].getId());
                            System.out.println("Desea agregar otro empleado");
                                System.out.println("1. Si");
                                System.out.println("2. No");
                                m=leer.nextInt();
                            }while(m==1);
                            break;
                        case 2:                          
                            do{
                                System.out.println("Producto");
                                String nam=leer.next();
                                System.out.println("Cantidad");
                                int cant=leer.nextInt();
                                do{
                                    b++;
                                    if(nam==producto[b].getNom()){
                                        double precio=cant*producto[b].getPrecio();
                                        gastos[n]=new Gastos(precio);
                                        n++;
                                    }
                                }while(nam!=producto[b].getNom());
                                System.out.println("Desea agregar otro producto");
                                System.out.println("1. Si");
                                System.out.println("2. No");
                                m=leer.nextInt();
                            }while(m==1);
                            break;
                        case 3:
                            System.out.println("Pago de arriendo");
                            double arriendo=leer.nextDouble();
                            gastos[n]=new Gastos(arriendo);
                            n++;
                            break;
                        case 4:
                            System.out.println("Pago de servicios");
                            double servicios=leer.nextDouble();
                            gastos[n]=new Gastos(servicios);
                            n++;
                            break;
                        case 5:
                            System.out.println("Otros gastos");
                            double o_gastos=leer.nextDouble();
                            gastos[n]=new Gastos(o_gastos);
                            n++;
                            break;
                    }
                    break;
                case 4:
                    int p=-1;
                    do{
                        System.out.println("Ingrese nombre del producto");
                        String nombre=leer.next();
                        do{
                            p++;
                            if(nombre==producto[p].getNom()){
                                System.out.println("Cantidad");
                                int t=leer.nextInt();
                                gastos[n]=new Gastos(t*producto[p].getPrecio());
                                n++;
                            }
                        }while(nombre!=producto[p].getNom());
                        System.out.println("Desea agregar otro producto");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        m=leer.nextInt();
                    }while(m==1);
                    break;
                case 5:
                    System.out.println("Que desea consultar");
                    System.out.println("1. Hora de salida de un empleado");
                    System.out.println("2. Hora de entrada de un empleado");
                    System.out.println("3. Gastos");
                    System.out.println("4. Entradas");
                    int f=leer.nextInt();
                    switch(f){
                        case 1:
                            int r=-1;
                            do{
                                System.out.println("Id del empleado");
                                int id2=leer.nextInt();
                                do{
                                    r++;
                                    if(id2==empleado[r].getId()){
                                        System.out.println(empleado[r].getH_salida());
                                    }
                                }while(id2!=empleado[r].getId());
                                System.out.println("Desea consultar otro empleado");
                                System.out.println("1. Si");
                                System.out.println("2. No");
                                m=leer.nextInt();
                            }while(m==1);
                            break;
                        case 2:
                            int w=-1;
                            do{
                                System.out.println("Id del empleado");
                                int id2=leer.nextInt();
                                do{
                                    w++;
                                    if(id2==empleado[w].getId()){
                                        System.out.println(empleado[w].getH_entrada());
                                    }
                                }while(id2!=empleado[w].getId());
                                System.out.println("Desea agregar otro empleado");
                                System.out.println("1. Si");
                                System.out.println("2. No");
                                m=leer.nextInt();
                            }while(m==1);
                            break;
                        case 3:
                            System.out.println("1. Gasto en un dia");
                            System.out.println("2. Gasto en un mes");
                            System.out.println("3. Gasto anual");
                            int u=leer.nextInt();
                            switch(u){
                                case 1:
                                    
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                            }
                            break;
                        case 4:
                            break;
                    }
                    break;
            }
        }while(n==0);
    }
    
}
