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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Elaborar un algorimo que lea una temperatura en grados Celcius y obtenga
        e imprima la temperatura Fahrenheit equivalente.
        */
        
        //Creo una variable para pedir por consola los datos
        Scanner tem = new Scanner(System.in);
        
        //Declaro variables
        double gCe, gFa;
        
        //Solicitud al usuario para ingresar las variables
        System.out.println("Ingrese la temperatura en grados Celcius: ");
        gCe=tem.nextDouble();
        
        //Realizo la operacion
        gFa=(9/5*gCe)+32;
        
        //Salida del resultado en pantalla
        System.out.println("La temperatura en grados Fahrenheit es: "+gFa);
    }
    
}
