import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
// Si While (EXPRESION LOGICA){ es verdadero se repite todo el while, si es falso salta el while.
// (nun++;) => nun = nun + 1, Incremento // (nun--;) => nun = nun - 1, Decremento
        
        System.out.println("Sentencias Repetitivas");
        System.out.println("Sentencia While");
        System.out.println("--Ingrese el numero de la tabla que desea ver--");
        byte n = lector.nextByte();
        byte x = 1;

        while ( n <= 0){
            System.out.println("--inserte numeros mayores a 0--");
            System.out.println("--Ingrese el numero de la tabla que desea ver--");
            n = lector.nextByte();
        }

        while (x <= 10) {
        System.out.println(n + " x " + x + " = "+ n*x);
        x++; 
        }
        System.out.println("Fuera del while chaval ");
        System.out.println("Tan Tan, o mejor dicho fin... chaval");

        lector.close();
        }
    }
