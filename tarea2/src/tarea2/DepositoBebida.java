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

class DepositoBebida {
    private ArrayList<Bebida> list;

    public DepositoBebida() {
        this.list = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b) {
        this.list.add(b);
    }
    public Bebida getBebida() {
        if (!list.isEmpty()) {
            return this.list.remove(0);
        } else {
            return null;
        }
    }
}
