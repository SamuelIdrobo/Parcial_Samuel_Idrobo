// importo la libreria que nos dieron el semestre pasado
import java.util.Scanner;  

// Public class con el nombre del archivo
public class Parcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// defino como double para evitar problemas con decimales
    double numero1, numero2; 

// pido al usuario los numeros
    System.out.println("Ingrese el primer numero");
    numero1 = sc.nextDouble();

    System.out.println("Ingrese el segundo numero");
    numero2 = sc.nextDouble();

// Cierro el Scanner ya que no se van a leer mas datos
    sc.close(); 

// Me aseguro de que el cero no impida dividir
    if (numero2 == 0 || numero1 == 0) {
        System.out.println("No se puede dividir por cero");
    } else {
// Luego hacemos la operacion para saber si hay multiplos usando %
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es múltiplo de " + numero2);
        } else if (numero2 % numero1 == 0) {
            System.out.println(numero2 + " es múltiplo de " + numero1);
        } else {
            System.out.println("Ninguno de estos 2 números es múltiplo del otro");
// Y ya imprimimos el resultado final
        }
    }
}      
}
// Posibles errores ( Al hacer divisiones con 0, por eso esta especificado == 0)...