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
public class A_lo_Paisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int n=0;
        ArrayList <Empleados> empleado=new ArrayList();
        ArrayList <Nomina> nomina=new ArrayList();
        ArrayList <Gastos> gastos=new ArrayList();
        ArrayList <Productos> producto=new ArrayList();
        ArrayList <Factura> factura=new ArrayList();
        ArrayList <Bodega> bodega=new ArrayList();
        ArrayList <Horario> hora=new ArrayList();
        Horario hora1=new Horario();
        Empleados p=new Empleados();
        Empleados p1=new Empleados();
        Empleados p2=new Empleados();
        Bodega q=new Bodega();
        Bodega q1=new Bodega();
        Bodega q2=new Bodega();
        Factura fact=new Factura(b);
        Productos produc=new Productos(); 
        Productos produc1=new Productos();
        Productos produc2=new Productos();
        Scanner leer= new Scanner(System.in);
        q.setCod(100);
        q.setCantidad(40);
        q.setMprima("Queso");
        q.setPrecio_und(300);
        bodega.add(q);
        q1.setCod(101);
        q1.setCantidad(50);
        q1.setMprima("Vegetales");
        q1.setPrecio_und(240);
        bodega.add(q1);
        q2.setCod(102);
        q2.setCantidad(30);
        q2.setMprima("Carne");
        q2.setPrecio_und(430);
        bodega.add(q2);
        p.setId(1);
        p.setNombre("Marco");
        p.setCargo("a");
        p.setSalario(100);
        empleado.add(p);
        p1.setId(2);
        p1.setNombre("Sofia");
        p1.setCargo("r");
        p1.setSalario(140);
        empleado.add(p1);
        p2.setId(3);
        p2.setNombre("Helena");
        p2.setCargo("t");
        p2.setSalario(100);
        empleado.add(p2);
        produc.setCod(120);
        produc.setIngred(bodega.get(1));
        produc.setIngred(bodega.get(2));
        produc.setNom("EspecialA");
        produc.setPrecio(604);
        producto.add(produc);
        produc1.setCod(130);
        produc1.setIngred(bodega.get(0));
        produc1.setIngred(bodega.get(2));
        produc1.setNom("EspecialB");
        produc1.setPrecio(503);
        producto.add(produc1);
        produc2.setCod(140);
        produc2.setIngred(bodega.get(0));
        produc2.setIngred(bodega.get(1));
        produc2.setNom("EspecialC");
        produc2.setPrecio(540);
        producto.add(produc2);
        /**/
        do{
            System.out.println("1. Registrar hora entrada");
            System.out.println("2. Registrar hora salida");
            System.out.println("3. Registrar gastos");
            System.out.println("4. Registrar ventas");
            System.out.println("5. Consultar productos en bodega");
            System.out.println("6. Consultar gastos");
            System.out.println("7. Consultar ventas");
            int ch=leer.nextInt();
            switch(ch){
                case 1:
                    do{
                    System.out.println("Ingrese ID de empleado");
                    int id=leer.nextInt();
                    for(Empleados e: empleado){
                        if(e.getId()==id){
                            System.out.println("Ingrese hora de entrada");
                            int hor=leer.nextInt();                   
                            hora1.setEmpleado(e);
                            hora1.setH_entrada(hor);
                        }
                    }
                    System.out.println("Registrar otra hora? 1.Si 2.No");
                    a=leer.nextInt();
                    }while(a==1);
                    break;
                case 2:
                    do{
                    System.out.println("Ingrese empleado");
                    int id=leer.nextInt();
                    for(Empleados e: empleado){
                        if(e.getId()==id){
                            System.out.println("Ingrese hora de salida");
                            int hor=leer.nextInt();
                            hora1.setEmpleado(e);
                            hora1.setH_salida(hor);
                        }
                    }  
                    System.out.println("Registrar otra hora? 1.Si 2.No");
                    a=leer.nextInt();
                    }while(a==1);
                    break;
                case 3:
                    Gastos gasto=new Gastos();
                    do{
                    System.out.println("1. Servicios");
                    System.out.println("2. Arriendo");
                    System.out.println("3. Impuesto");
                    System.out.println("4. Compras");
                    int ch1=leer.nextInt();
                    switch(ch1){
                        case 1:
                            double servicios=leer.nextDouble();
                            gasto.setServicios(servicios);
                            break;
                        case 2:
                            double arriendos=leer.nextDouble();                        
                            gasto.setArriendos(arriendos);
                            break;
                        case 3:
                            double impuesto=leer.nextDouble();
                            gasto.setImpuestos(impuesto);
                            break;
                        case 4:
                            double compras=leer.nextDouble();
                            gasto.setCompras(compras);
                            break;
                    }
                    System.out.println("Otro registro? 1. Si  2. No");
                    a=leer.nextInt();
                    }while(a==1);
                    gasto.setTot();
                    gastos.add(gasto);
                    int u=0;
                    break;
                case 4:
                    do{
                        int cod;
                        System.out.println("Agregar codigo producto");
                        cod=leer.nextInt();
                        for(Productos Producto: producto){
                            if(Producto.getCod()==cod){
                                fact.adicionar(Producto);
                                int i=0;
                                for(Bodega w:Producto.getIngred()){
                                    if(w.getCod()==bodega.get(i).getCod()){
                                        int l=bodega.get(i).getCantidad()-1;
                                        bodega.get(i).setCantidad(l);
                                    }
                                }
                            }
                        }
                        System.out.println("Otro producto? 1. Si  2.No");
                        a=leer.nextInt();
                    }while(a==1);
                    fact.calcularTotal();
                    factura.add(fact);
                    System.out.println(fact.calcularTotal());
                    break;
                case 5:
                    do{
                        System.out.println("Nombre del producto");
                        int codig;
                        codig=leer.nextInt();
                        for(Bodega t: bodega){
                            if(t.getCod()==codig){
                                System.out.println(t.getCantidad());
                            }
                        }
                        System.out.println("Otra consulta? 1.Si 2.No");
                        a=leer.nextInt();
                    }while(a==1);
                    break;
                case 6:
                    do{
                        System.out.println("1. Por dia");
                        System.out.println("2. Por mes");
                        System.out.println("3. Por año");
                        int ch2=leer.nextInt();
                        switch(ch2){
                            case 1:
                                double Total=0;
                                System.out.println("Ingrese dia mes y año");
                                int dia=leer.nextInt();
                                int mes=leer.nextInt();
                                int anio=leer.nextInt();
                                mes=mes-1;
                                for(Gastos g:gastos){
                                    if(g.getFecha().getDia()==dia && g.getFecha().getMes()==mes && g.getFecha().getAnnio()==anio){
                                        Total=Total+g.getTot();
                                    }
                                }
                                System.out.println(Total);
                                break;
                            case 2:
                                Total=0;
                                System.out.println("Ingrese mes y año");
                                mes=leer.nextInt();
                                anio=leer.nextInt();
                                mes=mes-1;
                                for(Gastos g:gastos){
                                    if(g.getFecha().getMes()==mes && g.getFecha().getAnnio()==anio){
                                        Total=Total+g.getTot();
                                    }
                                }
                                System.out.println(Total);
                                break;
                            case 3:
                                Total=0;
                                System.out.println("Ingrese año");
                                anio=leer.nextInt();
                                for(Gastos g:gastos){
                                    if(g.getFecha().getAnnio()==anio){
                                        Total=Total+g.getTot();
                                    }
                                }
                                System.out.println(Total);
                                break;
                        }
                        System.out.println("Otra consulta? 1.Si 2.No");
                        a=leer.nextInt();
                    }while(a==1);
                    break;
                case 7:
                    do{
                        System.out.println("1. Por dia");
                        System.out.println("2. Por mes");
                        System.out.println("3. Por año");
                        int ch3=leer.nextInt();
                        switch(ch3){
                            case 1:
                                double Total=0;
                                System.out.println("Ingrese dia mes y año");
                                int dia=leer.nextInt();
                                int mes=leer.nextInt();
                                int anio=leer.nextInt();
                                int s=0;
                                mes=mes-1;
                                for(Factura x: factura){
                                    if(x.getFecha().getDia()==dia && x.getFecha().getMes()==mes && x.getFecha().getAnnio()==anio){
                                        Total=Total+x.calcularTotal();
                                    }
                                    s++;
                                }
                                System.out.println(Total);
                                break;
                            case 2:
                                Total=0;
                                System.out.println("Ingrese mes y año");
                                mes=leer.nextInt();
                                anio=leer.nextInt();
                                s=0;
                                mes=mes-1;
                                for(Factura x:factura){
                                    if(x.getFecha().getMes()==mes && x.getFecha().getAnnio()==anio){
                                        Total=Total+x.calcularTotal();
                                    }
                                    s++;
                                }
                                System.out.println(Total);
                                break;
                            case 3:
                                Total=0;
                                System.out.println("Ingrese dia mes y año");
                                anio=leer.nextInt();
                                s=0;
                                for(Factura x:factura){
                                    if(x.getFecha().getAnnio()==anio){
                                        Total=Total+x.calcularTotal();
                                    }
                                    s++;
                                }
                                System.out.println(Total);
                                break;
                        }
                        System.out.println("Otra consulta? 1.Si 2.No");
                        a=leer.nextInt();
                    }while(a==1);
                    break;    
            }
        }while(n==0);
    }
    
}
