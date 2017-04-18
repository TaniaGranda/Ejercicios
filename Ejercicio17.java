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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Elaborar un algoritmo que permita leer el tamaño de un ángulo en radianes 
        e imprima la tangente, cotangente, secante y cosecante.
        */
        
        //Creo una variable para pedir por consola los datos
        Scanner a = new Scanner(System.in);
        
        //Declaro variables
        double tamRad, tg, ct, sc, cs, Rad;
                
        //Solicitud al usuario para ingresar las variables
        System.out.println("Ingrese el tamaño de un ángulo en radianes;");
        tamRad=a.nextDouble();
        
        //Realizo la operacion
        Rad=Math.toRadians(tamRad);
        tg=Math.sin(Rad)/Math.cos(Rad);
        sc=1/Math.cos(Rad);
        ct=Math.cos(Rad)/Math.sin(Rad);
        cs=1/Math.sin(Rad);
        
        //Salida del resultado en pantalla
        System.out.println("Tangente: "+tg);
        System.out.println("Secante: "+sc);
        System.out.println("Cotangente: "+ct);
        System.out.println("Cosecante: "+cs);
   
    }
    
}
