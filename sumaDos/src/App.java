import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n1,n2,suma;

        System.out.print("ingresa un num: ");
        n1 = input.nextInt();
        System.out.print("ingresa un num: ");
        n2 = input.nextInt();

        suma = n1+n2;
        System.out.println("la suma es: "+suma);

    }
}
