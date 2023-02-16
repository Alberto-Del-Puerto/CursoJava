import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
// sumar dos numeros decimales
double n1, n2, suma;

Scanner input = new Scanner(System.in);

System.out.print("ingresa n1: ");
n1=input.nextDouble();
System.out.println("ingresa n2: ");
n2=input.nextDouble();

suma = n1+n2;
System.out.println("la suma es: "+suma);




    }
}
