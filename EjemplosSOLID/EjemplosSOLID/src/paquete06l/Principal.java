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
        
        Banco b1 = new Banco();
        b1.setNombreB("Loja");
        
        TarjetaCredito t1 = new TarjetaCredito();
        t1.setNumero("11505444");
        t1.setBanco(b1);
        
        MayorEdad representante = new MayorEdad("José", t1);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s - Nombre Banco:%s\n" ,
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().getNumero(),
                menor.obtenerRepresentante().obtenerTarjeta().getBanco().getNombreB());
        
    }
}
