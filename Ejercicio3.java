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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Elaborar un algoritmo que lea una cantidad de horas e imprima su equivalente
        en minutos, segundo y dias.
        */
        
        //Creo una variable para pedir por consola los datos
        Scanner horas = new Scanner(System.in);
        
        //Declaro variables
        int hora, min, dias, seg;
        
        //Solicitud al usuario para ingresar la variable
        System.out.println("Ingrese la hora:");
        hora=horas.nextInt();
        
        //Realizo la operación
        dias=hora/24;
        min=hora*60;
        seg=hora*3600;
        
        //Salida del resultado en pantalla
        System.out.println("La hora ingresada: "+hora+" tiene:\n "+dias+" dia(s)\n "+min+" minutos\n "+seg+" segundos");
    }
    
}
