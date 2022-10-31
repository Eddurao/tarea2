/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author eparr
 */
public abstract class Bebida {
    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }
    public int getSerie() {
        return serie;
    }
    public abstract String beber();
}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }
    @Override
    public String beber() {
        return "CocaCola";
    }
}
class Fanta extends Bebida{
      
    public Fanta(int serie){
        super(serie);
    }
    public String beber(){
        return "Fanta";
    }
    
}
class Sprite extends Bebida{

    public Sprite(int serie){
        super(serie);
    }
    public String beber(){
        return "Sprite";
    }



}
