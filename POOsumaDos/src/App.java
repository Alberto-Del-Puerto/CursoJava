import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
// diseñar un programa para sumar dos numeros decimales

Scanner input = new Scanner(System.in);

double n1,n2, suma;
System.out.print("ingresa n1: ");
n1=input.nextDouble();
System.out.print("ingresa n2: ");
n2 = input.nextDouble();

suma = n1+n2;

System.out.println("la suma es: "+suma);



    }
}
