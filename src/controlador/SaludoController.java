package controlador;
import modelo.SaludoModel;
import vista.SaludoView;

import java.util.Scanner;

public class SaludoController {
    public void iniciar() {
        SaludoModel modelo = new SaludoModel();
        SaludoView vista = new SaludoView();

        Scanner teclado = new Scanner(System.in);

        vista.pedirNombre();

        String nombre = teclado.nextLine();

        modelo.setNameUser(nombre);

        vista.mostrarSaludo(modelo.getNameUser());

        if (modelo.getNameUser().equalsIgnoreCase("salir")) {
            teclado.close();
            System.out.println(" Programa finalizado ");
        }


    }
}
