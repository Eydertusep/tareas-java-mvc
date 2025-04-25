import controlador.SaludoController;
import controlador.SumaController;
public class Main {


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SaludoController controlador1 = new SaludoController();
        SaludoController controlador2 = new SaludoController();

        controlador1.iniciar();
        controlador2.iniciar();

        SumaController suma1 = new SumaController();

        suma1.iniciar();

    }
}