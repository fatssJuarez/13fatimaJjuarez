/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paroimpar;

import java.util.Scanner;
//importamos un Scanner para la entrada de datos

/**
 *
 * @author maria
 */
public class PARoIMPAR {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        // Instanciamos Scanner (sc) 
        System.out.println ("Programa que indica si un numero es par o impar");
        // Indicamos de que se trata el codigo
        System.out.println("Coloque un numero: ");
        // Pedimos al usuario la variable a evaluar  
        int num = sc.nextInt();
        //colocamos una variable (num) para que luego sea remplazada por el valor del usuario
        if (num % 2 == 00 ){// se examina la variable
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
            //buen codigo
        }
    }
}
