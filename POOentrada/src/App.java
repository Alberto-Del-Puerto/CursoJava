import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // scanner

        Scanner input = new Scanner(System.in);

        int x;
        double decimal;


        System.out.println("ingresa un num: ");
        x=input.nextInt();

        System.out.println("el numero es: "+x);

        System.out.println("ingresa un decimal: ");
        decimal = input.nextDouble();
        System.out.println("decimal: "+decimal);



    }
}
