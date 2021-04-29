/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

public class Calculadora {

    public static void main(String[] args) {
        /*
         * Declaracion de las variables que ocupamos en la calculadora para
         * realizar las operaciones necesarias.
         */
        int numA = 6;
        int numB = 9;


        Operaciones operacion = new Operaciones();
        /*
         *Declaramos variables para almacenar los resultados que generan
         * los metodos que realizan suma, resta, multiplicacion y divicion
         */
        int rSuma = operacion.suma(numA, numB);
        int rResta = operacion.resta(numA, numB);
        int rMult = operacion.multiplicacion(rSuma, numB);
        float rDiv = operacion.division(rSuma, numB);
        /*
         * Mostramos los resultados en pantalla
         */
        System.out.println("Resultadoo de suma: "+rSuma);
        System.out.println("Resultadoo de resta: "+rResta);
        System.out.println("Resultadoo de multiplicacion: "+rMult);
        System.out.println("Resultadoo de Division: "+rDiv);
  }
    /*
     * En esta seccion tenemmos todos los metodos que realizan los operaciones
     * de nuestra calculadora,
     */
   
}
