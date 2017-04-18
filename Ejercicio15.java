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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Elaborar un algoritmo que lea la cantidad de dólares a comprar y el 
        tipo de cambio (costo de un dólar) en: yenes, pesetas, libras esterlinas 
        y marcos; calcular e imprimir la cantidad a pagar en yenes, pesetas, 
        libras esterlinas y marcos
        */
        
        //Creo una variable para pedir por consola los datos
        Scanner conv = new Scanner(System.in);
        
        //Declaro variables
        double d1y, d2p, d3lE, d4m, usd;
        double t1, t2, t3, t4;
                
        //Asignacion de variables
        d1y=109.25300;
        d2p=157;
        d3lE=0.79920;
        d4m=1.84;
        
        //Solicitud al usuario para ingresar las variables
        System.out.println("Ingrese el USD que desea convertir: ");
        usd=conv.nextDouble();
        
        //Realizo la operacion
        t1=usd*d1y;
        t2=usd*d2p;
        t3=usd*d3lE;
        t4=usd*d4m;
        
        //Salida del resultado en pantalla
        System.out.println(+usd+" equivale a: "+t1+" yenes");
        System.out.println(+usd+" equivale a: "+t2+" pesetas");
        System.out.println(+usd+" equivale a: "+t3+" libras esterlinas");
        System.out.println(+usd+" equivale a: "+t4+" marcos");
    }
    
}
