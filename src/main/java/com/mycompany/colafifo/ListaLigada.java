/*
*Nombre: Castillo Zavala Eduardo Roberto
*Matricula: 18-003-0851
*/
package com.mycompany.colafifo;

public class ListaLigada<T> {
    
    //atributos
    private Nodo<T> primerNodo;
    private int numeroNodos;
    
    
    //Se crea una lista ligada sin nodos y se inicializa el constructor
    public ListaLigada(){
        this.primerNodo = null;
        this.numeroNodos = 0;
    }

    public int getNumeroNodos() {
        return numeroNodos;
    }

    public void setNumeroNodos(int numeroNodos) {
        this.numeroNodos = numeroNodos;
    }
    
    
    //Crea una lista con un solo nodo, ¿es polimorfismo o sobre carga ?    
    public ListaLigada(Nodo<T> primerNodo){
        this.primerNodo = primerNodo;
        this.primerNodo = primerNodo;
        this.numeroNodos = 1;
        this.primerNodo.setNumeroNodo(1);
    }
    
    //Borrar todos los nodos de la lista
    public void vacialLista(){
        this.primerNodo= null;
    }
    
    //Validacion de lista vacia
    public boolean estaVacia(){
        return this.primerNodo == null;
    }
    
    
    
    public void insertarInicio(T dato) {
        // 1.
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        //Si la lista tiene nodos el nuevoNodo aputa al primero actual
        if (!estaVacia()) {
            nuevoNodo.setSiguienteNodo(this.primerNodo);
        }

        //Si la lista está vacía o no, el nuevo noso será el primero
        this.primerNodo = nuevoNodo;
        this.numeroNodos++;
        numerarNodos();
    }
    
    public void numerarNodos() {
        if (!estaVacia()) {
            Nodo<T> aux = this.primerNodo;      
            int i = 1;                          
            while (aux != null) {                 
                aux.setNumeroNodo(i);   
                i++;                            
                aux = aux.getSiguienteNodo();   
            }
        }
    }
    
    public void insertarFormado(T dato){
        
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        if (estaVacia()) {
            insertarInicio(dato);
        } else {
            Nodo<T> aux = this.primerNodo;

            while (aux.getSiguienteNodo() != null) {
                aux = aux.getSiguienteNodo();
            }
            aux.setSiguienteNodo(nuevoNodo);
            nuevoNodo.setSiguienteNodo(null);
            this.numeroNodos++;
            nuevoNodo.setNumeroNodo(this.numeroNodos);
        }
             
    }
    
    public void imprimirCola(){
        
        if(estaVacia()){
            System.out.println("La Cola está vacía");
        } else{
            Nodo<T> aux = this.primerNodo;
            
            System.out.println("\nLista ligada de la cola");
            
            while(aux != null){
                System.out.println(aux.toString());
                aux = aux.getSiguienteNodo();
            }
        }
    }
    
    public void borrarInicio() {
        if (estaVacia()) {
            System.out.println("La Cola está vacia no se puede borrar");
        } else {
            System.out.println("Salio el primero de la cola: "+this.primerNodo);
            this.primerNodo = this.primerNodo.getSiguienteNodo();
            this.numeroNodos--;
            numerarNodos();
        }
    }
}
