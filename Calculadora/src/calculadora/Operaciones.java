/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author Ernesto
 */
public class Operaciones {

    public static void Operaciones(){
    }

     public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b==0){
        System.out.println("no se puede dividir entre cero");
        }
        return a / b;
    }

}
