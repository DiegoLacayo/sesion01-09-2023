import java.util.Scanner;
public class AppWhile {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Hasta que tabla de multiplicar desea ver");
        byte n = lector.nextByte();
        byte x= 1, num = 1;

        while (num <= n){
            while (x <= 12){
                System.out.println(num + " x " + x + " = " + num*x);
                x++;
            }
            System.out.print("::::::::::::::::::::::::::::::::::::::::::::::::::");
            x = 1;
            num++;
        }
        lector.close();
    }
}
