import controlador.SaludoController;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SaludoController controlador1 = new SaludoController();
        SaludoController controlador2 = new SaludoController();

        controlador1.iniciar();
        controlador2.iniciar();

    }
}