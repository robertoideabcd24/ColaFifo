/*
*Nombre: Castillo Zavala Eduardo Roberto
*Matricula: 18-003-0851
*/
package com.mycompany.colafifo;

import java.util.Scanner;

public class ColaFifo {

    public static void main(String[] args) {
        
        
        ListaLigada cola = new ListaLigada();
        
        cola.insertarFormado("e");
        cola.insertarFormado(5);
        cola.insertarFormado("A");
        cola.insertarFormado(56);
        
        cola.imprimirCola();
                
        cola.borrarInicio();
        cola.imprimirCola();
        cola.borrarInicio();
        cola.imprimirCola();
        cola.borrarInicio();
        cola.imprimirCola();
        cola.borrarInicio();
        cola.imprimirCola();
        cola.borrarInicio();
        cola.imprimirCola();
        
        
                
    }
    
}
