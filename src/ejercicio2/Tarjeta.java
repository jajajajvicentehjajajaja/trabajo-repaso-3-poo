package ejercicio2;

public class Tarjeta extends MedioPago {
    private String ultimosCuatroDigitos;

    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con Tarjeta (**** " + ultimosCuatroDigitos + ") | Titular: " 
                    + getTitular() + " | Monto: $" + monto);
        } else {
            System.out.println("Error: el monto debe ser mayor que cero.");
        }
    }
}