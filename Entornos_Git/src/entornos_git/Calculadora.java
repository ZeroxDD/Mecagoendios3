 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos_git;

/**
 *
 * @author Zero
 */

    public class Calculadora {
    
    private int numero1;
    private int numero2;
    
    /**
     *
     * @param a entero que se comporta según el método que escojamos
     * @param b entero que se comporta según el método que escojamos
     */
    public Calculadora(int a, int b){
        numero1=a;
        numero2=b;
    }
    
    
    /**
     * Suma los dos números
     * 
     * @return El resultado total de la suma
     */
    public int suma(){
        int resul=numero1+numero2;
        return resul;
    }
   
    /**
     * Resta los dos números
     * 
     * @return El resultado de la resta
     */
    public int resta(){
        int resul=numero1-numero2;
        return resul;
    }
    
    /**
     * Multiplica los dos números
     * 
     * @return El resultado de la multiplicación
     */
    public int multiplica(){
        int resul=numero1*numero2;
        return resul;
    }
 
    
    /**
     * Divide los dos números
     * 
     * @return Devuelve el resultado de la división
     * @throws ArithmeticException si el divisor es 0
     */
    public int divide(){
        int resul=numero1/numero2;
        return resul;
    }
    
    /**
     * Divide los dos números
     * 
     * @return Devuelve el resultado de la operación
     * @throws ArithmeticException si el divisor es 0
     */
    public double divide2(){
        double resul=numero1/numero2;
        return resul;
    }
}

