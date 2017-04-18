/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1fp;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Elabore un algortimo que lea el articuo¿lo y su costo. La utilidad es el %150
        y el imouesto es el 15%. Calcular e imprimir articulo, utilidad, impuesto y
        precio de venta.
        */
        
        //Creo una variable para pedir por consola los datos
        Scanner art = new Scanner(System.in);
        
        //Declaro variables
        String articulo;
        double costo, utilidad, impuesto, pv, u, i;
        
        //Asignacion de variables
        utilidad=1.50;
        impuesto=0.15;
        
        //Solicitud al usuario para ingresar las variables
        System.out.println("Ingrese el nombre del articulo: ");
        articulo=art.next();
        System.out.println("Ingrese el costo: ");
        costo=art.nextDouble();
        
        //Realizo la operacion
        u=costo*utilidad;
        i=costo*impuesto;
        pv=u+i;
        
        //Salida del resultado en pantalla
        System.out.println("Articulo: "+articulo);
        System.out.println("Utilidad: "+u);
        System.out.println("Impuesto: "+i);
        System.out.println("Precio Venta: "+pv);
    }
    
}
