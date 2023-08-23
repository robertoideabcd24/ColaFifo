/*
*Nombre: Castillo Zavala Eduardo Roberto
*Matricula: 18-003-0851
*/
package com.mycompany.colafifo;

public class Nodo <T>{
    
    //atributos
    
    private Nodo<T> siguienteNodo; //Crea la flecha al siguiente Nodo
    private T dato; //Se crea La variable de tipo T con nombre dato
    private int numeroNodo; //almacena la cantidad de nodos
    private boolean tache; //si es falso, no ha visitado y si es true ya fue visitado
    
    //constructor para inicializar variables
    
    public Nodo(){
        this.dato = null;
        this.siguienteNodo = null;
        this.tache = false;
    }
    
    //constructor que recibe el dato T
    public Nodo(T dato){
        this.dato = dato;
        this.siguienteNodo = null;
        this.tache = false;
    }
    
    /*
    Esté constructor recibe la referencia (flecha)
    de otro nodo que ya debe  existir
    se asigna el parametro a las variables de referencia
    */
    
    public Nodo(Nodo<T> siguienteNodo){
        this.siguienteNodo = siguienteNodo;
        this.tache = false;
    }
    
    /*
    Esté nos devuelce la referencia al siguiente nodo. Lo que
    visualmente vemos como una flecha, desde un nodo al siguiente.
    Además, este método nos permitirá avanzar dentro de la lista
    
    Avanza la flecha
    */
    
    public Nodo<T> getSiguienteNodo(){
        return siguienteNodo;
    }
    
    /*
    Este permite "poner" una flecha desde un nodo a otro
    
    Marca el camino de un nodo a otro    
    */
    
    public void setSiguienteNodo(Nodo<T> siguienteNodo){
        this.siguienteNodo = siguienteNodo;
    }
    

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public int getNumeroNodo() {
        return numeroNodo;
    }

    public void setNumeroNodo(int numeroNodo) {
        this.numeroNodo = numeroNodo;
    }

    public boolean isTache() {
        return tache;
    }

    public void setTache(boolean tache) {
        this.tache = tache;
    }
    
    @Override
    public String toString(){
        return this.dato.toString();
    }
    
}
