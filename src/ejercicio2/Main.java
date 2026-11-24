package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Sofía Pérez", "4821");
        BilleteraVirtual billetera = new BilleteraVirtual("Sofía Pérez", "Mercado Pago");

        tarjeta.procesarPago(15000.50);
        billetera.procesarPago(4200.00);
        billetera.procesarPago(-100); // Prueba de validación
    }
}