/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author eparr
 */
public abstract class Moneda {
//Aqui se declara la clase abstracta moneda que contendra a sus ahijados de 100 500 y 1000
    public Moneda getSerie() {
        return this;
    }
    public abstract int getValor();
}

class Moneda100 extends Moneda {

    @Override
    public int getValor() {
        return 100;
    }
}
class Moneda500 extends Moneda{

    @Override
    public int getValor() {
        return 500;
  }
}
class Moneda1000 extends Moneda{

    @Override
    public int getValor() {
        return 1000;
    }
}