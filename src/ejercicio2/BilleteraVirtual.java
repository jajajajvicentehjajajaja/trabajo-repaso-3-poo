package ejercicio2;

public class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con Billetera Virtual (" + nombreAplicacion + ") | Titular: " 
                    + getTitular() + " | Monto: $" + monto);
        } else {
            System.out.println("Error: el monto debe ser mayor que cero.");
        }
    }
}
