/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.udea.ejemploarregloo;

/**
 *
 * @author Isasa
 */
public class EjemploArregloo {

    public static void main(String[] args) {
        
        String arrayLibros[]= new String[4];
        arrayLibros[0]="Psicoanalista";
        arrayLibros[1]="Habitos atomicos";
        
        System.out.println("Contenido" + arrayLibros[1]);
        for(int i=0; i >arrayLibros.length; i++){
            System.out.println("Contenido: " + arrayLibros[i]);
        }
        
    }
}
