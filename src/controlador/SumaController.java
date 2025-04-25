package controlador;
import modelo.SumaModel;
import vista.SumaView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaController {
    Scanner teclado = new Scanner(System.in);
    int numberOne;
    int numberTwo;
    SumaModel modelo = new SumaModel();
    SumaView vista = new SumaView();
    boolean error = false;

    public void iniciar(){
        try {
            System.out.println(" Ingresa el primer numero: ");
            numberOne = teclado.nextInt();

        } catch (InputMismatchException e) {
            vista.mostrarError(" Pusiste otro dato, en vez de un numero " );
            teclado.next();
            error = true;

        }

        try {
            System.out.println(" Ingresa el segundo numero: ");
            numberTwo = teclado.nextInt();

        } catch ( InputMismatchException e) {
            vista.mostrarError(" Pusiste otro dato, en vez de un numero ");
            teclado.next();
            error = true;

        }

        if (!error) {

            vista.mostrarResultado(modelo.suma(numberOne, numberTwo));

            teclado.close();

        }



    }
}
