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

public class Expendedor {
    private DepositoVuelto depVuelto;
    private ArrayList<DepositoBebida> depBebidas;
    private int precio;
    public Expendedor(int cantBebidas, int precioUnico) {
        this.precio = precioUnico;       
        this.depBebidas = new ArrayList<DepositoBebida>(3);
        depBebidas.add(new DepositoBebida());
        depBebidas.add(new DepositoBebida());
        depBebidas.add(new DepositoBebida());
        for (int i = 0; i < cantBebidas; i++) {
            depBebidas.get(0).addBebida(new CocaCola(100 + i));
            depBebidas.get(1).addBebida(new Fanta(200 + i));
            depBebidas.get(2).addBebida(new Sprite(300 + i));
        }
        this.depVuelto = new DepositoVuelto();
    }
    public Bebida comprarBebida(Moneda m, int num) {
        boolean devolverMoneda = false;
        Bebida compra;
        try {
            if (m == null) {
                compra = null;
                throw new PagoIncorrectoException("No ingreso dinero.");
            } else {
                if (m.getValor() >= precio) {
                    // Menú
                    switch (num) {
                        case 1:     compra = depBebidas.get(0).getBebida(); break;
                        case 2:     compra = depBebidas.get(1).getBebida(); break;
                        case 3:     compra = depBebidas.get(2).getBebida(); break;
                        default: {
                            compra = null;
                            throw new NoHayBebidaException("Elección inválida.");
                        }
                    }
                    if (compra == null) {
                        devolverMoneda = true;
                        throw new NoHayBebidaException("No hay bebidas");
                    } else {
                        if (m.getValor() > precio) {
                            depVuelto.generarVuelto(m.getValor() - precio);
                        }
                        return compra;
                    }

                // Caso de Dinero insuficiente
                } else {
                    devolverMoneda = true;
                    throw new PagoInsuficienteException("Pago insuficiente.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (devolverMoneda) depVuelto.guardarDevolucion(m);
        return null;
    }
    public Moneda getVuelto() {
        return depVuelto.getVuelto();
    }
}
