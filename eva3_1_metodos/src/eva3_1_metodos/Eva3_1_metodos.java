/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author ecasa
 */
public class Eva3_1_metodos {

    
    public static void main(String[] args) {
        int val1= 5, val2 = 10;
        //1. si necesito guardar el valor entero
        int resu = sumarEnteros(val1, val2);//invocar el metodo
         System.out.println("suma de 5 + 10= " + resu);
         //2.no secesito guardar el valor, un solo uso
          System.out.println("suma de 5 +10= " + sumarEnteros(val1, val2));
          //3. solo necesito ejecutar el metodo, no interesa el resultado 
          sumarEnteros(val1, val2);
    }
    //metodo para sumar dos enteros
    //llamar a sus metodos usando verbos y escritura canelCase
    //1. modificadores de acceso: public,protected,private,
    //2. static ---> para usar los metodos dentro del main 
    //3.valor de retorno: pueden regresar cualquier dato
    //void --> si no quieren regresar un valor 
    //4. nombre del metodo: mismas reglas de identificadores
    //5. lista de parametro: pueden ser cero o n cantidad
    //1      2     3    4            5 
    public static int sumarEnteros(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
}
