

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Alquiler {
    private String nombreCliente;
    private String documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler,
                    LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public double calcularPrecioAlquiler() {
        long numDias = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        double moduloBarco = barco.calcularModulo();
        return numDias * moduloBarco;
    }
}