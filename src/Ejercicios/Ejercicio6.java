/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
public class Ejercicio6 {
//Burbuja mejorado
    public static void main(String[] args) {
        int[] Array = {89, 45, 68, 90, 29, 34, 17};
        MostrarArreglo(Array);
        ordenarBurbujaMejorado(Array);

        System.out.println("");
        MostrarArreglo(Array);
    }

    public static void ordenarBurbujaMejorado(int Arreglo[]) {
        
        boolean ordenado=false;
        int i=0;
        while(i<Arreglo.length-1 && !ordenado){
            ordenado=true;
            for(int j=0;j<=Arreglo.length-i-2;j++){
                if(Arreglo[j]>Arreglo[j+1]){
                    ordenado=false;
                    intercambio(j,j+1,Arreglo);
                }
            }
            i++;
        }
    }

    public static void intercambio(int pos, int posMenor, int Arreglo[]) {
        //posMenor es la posicion del menor
        //pos por la que intercambia
        int aux;

        aux = Arreglo[posMenor];
        Arreglo[posMenor] = Arreglo[pos];
        Arreglo[pos] = aux;
    }

    public static void MostrarArreglo(int Arreglo[]) {
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print(Arreglo[i] + "-");
        }
    }
}
