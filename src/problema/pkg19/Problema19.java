/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg19;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Dado un angulo calcular seno, coseno y tangente
        double a;
        a = solicitarAngulo(); // dato introducido por teclad
        mostrarDatos(a); // realizar operaciones sen,cos y tan
    }
    public static double solicitarAngulo(){ //solicitar el angulo
        double a;
        System.out.println("Introduce el valor de un angulo: ");
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        return a;   
    } 
    public static void mostrarDatos(double a){
        System.out.println("El seno de " + a + "es igual a: " + Math.sin(a));     // seno del angulo
        System.out.println("El coseno de " + a + "es igual a: " + Math.cos(a));   // coseno del angulo
        System.out.println("La tangente de " + a + "es igual a: " + Math.tan(a)); // tangente del angulo
    }
}
