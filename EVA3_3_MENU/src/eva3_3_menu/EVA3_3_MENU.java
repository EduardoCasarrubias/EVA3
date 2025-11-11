/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;

import java.util.Scanner;

/**
 *
 * @author ecasa
 */
public class EVA3_3_MENU {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
            imprimirMenu();
            opcion = captu.nextInt();
        if(opcion ==1){
            calcularPotencia();
        }else if(opcion ==2){
            calcularSuma();
        }
        
        }while(opcion !=3);
    }
    public static void imprimirMenu(){
        System.out.println("Bienvido al sistema");
        System.out.println("selecciona la opcion");
        System.out.println("1.calcula una potencia");
        System.out.println("2.sumar dos numeros");
        System.out.println("3. salir del sistema");
        System.out.println("selecionar una opccion");
    }
    public static void calcularPotencia(){
        Scanner captu = new Scanner (System.in);
        int base,exp;
        System.out.println("*******calculo de potencia*****");
        System.out.println("captura la base");
        base = captu.nextInt();
        System.out.println("captura el exponente");
        exp = captu.nextInt();
        System.out.println(base + "elevado a " + exp + "=" + calcularPot(base,exp));
    }

    public static int calcularPot(int base, int exp) {
        int resu = 1;
        for(int i = 1; i<= exp; i++){
            resu = resu * base;
        }
        return resu;
    }
          public static void calcularSuma(){
              Scanner captu = new Scanner (System.in);
              int suma1, suma2;
              System.out.println("***********calculo de la suma************");
              System.out.println("calcula la primer suma= ");
              suma1 = captu.nextInt();
              System.out.println("captura la segunda suma= ");
              suma2 = captu.nextInt();
              System.out.println("la suma es: " + (suma1 + suma2));
          }
           
           
}
