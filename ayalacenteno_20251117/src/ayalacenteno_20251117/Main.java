/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayalacenteno_20251117;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolTernarioRecursivo arbol = new ArbolTernarioRecursivo(13);

        arbol.insertar('A');//indice 0 (raiz)
        arbol.insertar('B');//indice 1
        arbol.insertar('C');//indice 2
        arbol.insertar('D');//indice 3
        arbol.asignarHijos(0 , 1, 2, 3);
        arbol.insertar('E');//indice 4
        arbol.insertar('F');//indice 5
        arbol.insertar('G');//indice 6
        arbol.asignarHijos(1, 4, 5, 6);
        arbol.insertar('H');//indice 7
        arbol.insertar('I');//indice 8
        arbol.insertar('J');//indice 9
        arbol.asignarHijos(2, 7, 8, 9);
        arbol.insertar('K');//indice 10
        arbol.insertar('L');//indice 11
        arbol.insertar('M');//indice 12 
        arbol.asignarHijos(3, 10, 11, 12);
        
        System.out.println("Recorrido preorden");
        System.out.println("------------------");
        arbol.recorrerPreOrden(arbol.raiz);
        System.out.println();
        System.out.println("Recorrido in-orden");
        System.out.println("------------------");
        arbol.recorrerInOrden(arbol.raiz);
        System.out.println();
        System.out.println("Recorrido post-orden");
        System.out.println("--------------------");
        arbol.recorrerPostOrden(arbol.raiz);
        System.out.println();
    }
    
}
