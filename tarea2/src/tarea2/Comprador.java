/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author eparr
 */
public class Comprador {
    private int vuelto = 0;
    private String Sabor;

    public Comprador(Moneda m, int numBebida, Expendedor exp) {
        Bebida b = exp.comprarBebida(m, numBebida);
        
        // caso donde se concretó la compra
        if (b != null) {
            Sabor = b.beber();

            // Contar vuelto en monedas de 100
            while (exp.getVuelto() != null) {
                vuelto += 100;
            }

        // no le alcanza
        } else {
            Sabor = "no tomé";
            
            Moneda devolucion = exp.getVuelto();
            if (devolucion != null) {
                vuelto += devolucion.getValor();
            }
        }
        
    }
    
    public int cuantoVuelto() {
        return vuelto;
    }
    public String queBebiste() {
        return Sabor;
    }
}
