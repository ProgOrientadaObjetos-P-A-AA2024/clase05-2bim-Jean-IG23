/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        TarjetaCredito t1 = new TarjetaCredito();
        t1.setNumero("11505444");
        
        MayorEdad representante = new MayorEdad("José", t1);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().getNumero() );
        
    }
}
