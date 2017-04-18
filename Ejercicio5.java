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
public class Ejercicio5 {
    //Variable estatica
    static int velocidad=300000;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        La velocidad de la luz es de 300.000km/s. Elaborar un algoritmo que lea
        un tiempo en segundos e imprima la distancia que recorre la luz en 
        dicho tiempo. 
        */
        
        //Creo una variable para pedir por consola los datos
        Scanner vl = new Scanner(System.in);
        
        //Declaro variables
        double tiempo, vt;
        
        //Solicitud al usuario para ingresar las variables
        System.out.println("Ingrese un tiempo en segundos:");
        tiempo=vl.nextInt();
        
        //Realizo la operacion
        vt=velocidad*tiempo;
        
        //Salida del resultado en pantalla
        System.out.println(" La distancia que recorre la luz en "+tiempo+" segundos "+" es de: "+vt);
    }
    
}
