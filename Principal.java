
import java.util.Scanner;
/**
 * Calcular la energia total que se necesita para que una cantidad de agua alcance una temperatura deseada
 * 
 * @author Jeimmy Naranjo
 * @version 1
 */
public class Principal  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: masa del agua (m),Temperatura deseada (Tf)
        // 1. Definicion de variables
        // Datos de entrada
        double m, Tf, C;
        // Datos de salida
        double Q;
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese la masa del agua:");
        m = teclado.nextDouble();
        System.out.print("Ingrese la temperatura deseada para el agua:");
        Tf = teclado.nextDouble();
        
        
        // 2. Realizar calculos
        C = 4184; // 4184 J/(K·kg) en sistema internacinal
        Q = m * C * (Tf-0);
      
        
        // 3. Mostrar datos de salida
        System.out.println("La energia total que se necesita es de:" + Q + "J/(K·kg)");
        
                                 
      
         
  } //Fin de la clase principal
}