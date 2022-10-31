/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author eparr
 */
import java.util.ArrayList;

public class DepositoVuelto {
    private ArrayList<Moneda100> vuelto;
    private Moneda reembolso;

    
    
    public DepositoVuelto() {
        vuelto = new ArrayList<Moneda100>();
        reembolso = null;
    }

    
    
    public Moneda getVuelto() {
        // Vuelto
        if (reembolso != null) {
            Moneda aux = reembolso;
            reembolso = null;
            return aux;

        
        } else {
            if (!vuelto.isEmpty()) {
                return vuelto.remove(0);
            } else {
                return null;
            }
        }
    }
    
    
    public void generarVuelto(int cuantoVuelto) {
        int cantMonedas = cuantoVuelto/100;
        for (int i = 0; i < cantMonedas; i++) {
            vuelto.add(new Moneda100());
        }
    }
    
    
    public void guardarDevolucion(Moneda m) {
        reembolso = m;
    }
}
