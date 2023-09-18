/*
 Utilizando la herencia de forma apropiada, deberemos programar las clases y los métodos
necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el precio final de
su alquiler:  En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y
el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco 
(el modulo normal se obtiene simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco, se calcula sacando el modulo normal y
sumándole el atributo particular de cada barco. 
En los veleros se suma el número de mástiles, en los barcos a motor se le suma la potencia en CV. 
En los yates se suma la potencia en CV y el número de camarotes.
 */

import java.time.LocalDate;


public class PuertoAlquilerBarcos {
    public static void main(String[] args) {
        // Ejemplo de uso
        LocalDate fechaAlquiler = LocalDate.of(2023, 5, 1);
        LocalDate fechaDevolucion = LocalDate.of(2023, 5, 10);

        Velero velero = new Velero("V001", 15.5, 2005, 2);
        Alquiler alquilerVelero = new Alquiler("Cliente1", "123456789", fechaAlquiler, fechaDevolucion, 1, velero);
        double precioVelero = alquilerVelero.calcularPrecioAlquiler();
        System.out.println("Precio alquiler Velero: " + precioVelero);

        Barco barcoAMotor = new BarcoAMotor("M001", 20.0, 2010, 300);
        Alquiler alquilerBarcoAMotor = new Alquiler("Cliente2", "987654321", fechaAlquiler, fechaDevolucion, 2, barcoAMotor);
        double precioBarcoAMotor = alquilerBarcoAMotor.calcularPrecioAlquiler();
        System.out.println("Precio alquiler Barco a Motor: " + precioBarcoAMotor);

        Barco yate = new Yate("Y001", 25.0, 2015, 400, 4);
        Alquiler alquilerYate = new Alquiler("Cliente3", "567890123", fechaAlquiler, fechaDevolucion, 3, yate);
        double precioYate = alquilerYate.calcularPrecioAlquiler();
        System.out.println("Precio alquiler Yate: " + precioYate);
        Lancha lanchita = new Lancha("lanchita", 123, "rojo");
        System.out.println(lanchita.name);

        }
       
    
}
