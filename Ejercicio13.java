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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Elaborar un algoritmo que lea el radio (r) de una esfera, calcule e 
        imprima el volumen y el area.
        */
        
        //Creo una variable para pedir por consola los datos
        Scanner radio = new Scanner(System.in);
        
        //Declaro variables
        double r, v, a;
        
        //Solicitud al usuario para ingresar las variables
        System.out.println("Ingrese el radio: ");
        r=radio.nextDouble();
        
        //Realizo la operacion
        v=(4*Math.PI*Math.pow(r, 3))/3;
        a=Math.PI*Math.pow(r, 2);
        
        //Salida del resultado en pantalla
        System.out.println("Volumen: "+v);
        System.out.println("Area: "+a);
    }
    
}
