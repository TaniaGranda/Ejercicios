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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Elabore un algoritmo que lea la cantidad de dolares a comprar y el tipo
        de cambio a pesos (costo de un dolar en pesos), calcular e imprimir la 
        cantidad a pagar en pesos por la cantidad de dolares indicada.  
        */
        
        //Creo una variable para pedir por consola los datos
        Scanner conv = new Scanner(System.in);
        
        //Declaro variables
        double dolar, total, usd;
        
        //Asignacion de variables
        dolar=18.5732063;
        
        //Solicitud al usuario para ingresar las variables
        System.out.println("Ingrese el USD: ");
        usd=conv.nextDouble();
        
        //Realizo la operacion
        total=dolar*usd;
        
        //Salida del resultado en pantalla
        System.out.println(+usd+" equivale a: "+total+" pesos mexicanos");
    }
    
}
