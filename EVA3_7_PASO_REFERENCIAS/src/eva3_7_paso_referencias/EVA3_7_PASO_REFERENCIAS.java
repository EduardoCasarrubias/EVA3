/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_paso_referencias;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class EVA3_7_PASO_REFERENCIAS {

    
    public static void main(String[] args) {
        String cliente[] = new String[5];
        double credito[] = new double[5];
        capturaCliente(cliente, credito);
        imprimir(cliente, credito);
        
    }
    public static void capturaCliente(String[]nombre, double[]credito){
        Scanner captu = new Scanner(System.in);
        for(int i =0; i < credito.length; i++){
            System.out.println("nombre del cliente");
            nombre[i] = captu.nextLine();
            System.out.println("credito del cliente");
            credito[i] = captu.nextDouble();
            captu.nextLine();
        }
    }
    public static void imprimir(String[]nombre, double[]credito){
        for (int i = 0; i < credito.length; i++) {
            System.out.println("nombre: " + nombre[i] + 
                    ", credito: $" + credito[i]);
        }
    }
    public static void imprimir(String[]nombre){
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("nombre: " + nombre[i]);
        }
}
    public static void imprimir(double[]credito){
        for (int i = 0; i < credito.length; i++) {
            System.out.println("credito: $" + credito[i]);
        }
    }
}