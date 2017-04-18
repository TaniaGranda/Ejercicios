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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Elaborar un algoritmo que calcule e imprima el costo de producción de un artículo
        teniendo como datos la descripcion  y el numero de unidades producidas. El costo se calcula
        multiplicando el numero de unidades producidas por un factor de costo de materiales de 3.5 
        y sumandole al producto un costo fijo de 10700.
        */
        
        //Creo una variable para pedir por consola los datos
        Scanner articulo = new Scanner(System.in);
        
        //Declaro variables
        String descripcion, nomArt;
        int up;
        double costo;
        
        //Solicitud al usuario para ingresar las variables
        System.out.println("Ingrese el nombre del articulo:");
        nomArt=articulo.next();
        System.out.println("Ingrese la descripcion del articulo:");
        descripcion=articulo.next();
        System.out.println("Ingrese el numero de unidades producidas:");
        up=articulo.nextInt();
        
        //Realizo la operacion
        costo=(up*3.5)+10700;
        
        //Salida del resultado en pantalla
        System.out.println("El costo de producción del articulo: "+nomArt+"\nCon descripción: "+descripcion+"\nEs de: $"+costo);
    }
    
}
