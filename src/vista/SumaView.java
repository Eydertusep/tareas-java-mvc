package vista;

public class SumaView {
    public void pedirNumero(int orden){
        System.out.print(" Introduce el numero: " + orden + ": ");
    }

    public void  mostrarResultado(int suma) {
        System.out.println(" La suma es: " + suma);
    }

    public void mostrarError(String mensaje){
        System.err.println(" Error: " + mensaje);
    }
}
