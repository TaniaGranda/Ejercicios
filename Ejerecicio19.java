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
public class Ejerecicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Elaborar un algoritmo que permita leer el tamaño de un ángulo en grados 
        e imprima el seno y coseno. Debe convertirse los grados leídos a radianes 
        antes de hacer los cálculos.
        */
        
        //Creo una variable para pedir por consola los datos
        Scanner a = new Scanner(System.in);
        
        //Declaro variables
        double tamAngulo, sin, cos, angulo, rad;
                
        //Asignacion de variables
       
        
        //Solicitud al usuario para ingresar las variables
        System.out.println("Ingrese el tamaño del angulo en grados: ");
        tamAngulo=a.nextDouble();
        
        //Realizo la operacion
        angulo=Math.toRadians(tamAngulo);
        sin=Math.sin(angulo);
        cos=Math.cos(angulo);
        
        //Salida del resultado en pantalla
        System.out.println("Seno: "+sin);
        System.out.println("Coseno: "+cos);
    }
    
}
