public class App {
    public static void main(String[] args) throws Exception {
        auto a1= new auto();

        System.out.println(a1.numPlaca);
        System.out.println(a1.modelo);

        auto a2=new auto("JML892", 2000);
        System.out.println(a2.numPlaca);
        System.out.println(a2.modelo); 

        a1.acelerar(100.56);

    }
}
