/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;

/**
 *
 * @author eparr
 */
public class Tarea2 {
    public static void main(String[] args) {
        // 1......... CocaCola
        // 2......... Fanta 
        // 3......... Sprite.
        //

        // Compra concretada.
        System.out.println("Fernando:");
        Moneda Mil_Pesos = new Moneda1000();
        Expendedor Ex1 = new Expendedor(10,800);
        Comprador Fernando = new Comprador(Mil_Pesos, 2, Ex1);
        System.out.println(Fernando.queBebiste());
        System.out.println(Fernando.cuantoVuelto());
        System.out.println();

        // Falta dinero.
        System.out.println("Javier:");
        Moneda Cien_Pesos = new Moneda100();
        Expendedor Ex2 = new Expendedor(7,1000);
        Comprador Javier = new Comprador(Cien_Pesos,1, Ex2);
        System.out.println(Javier.queBebiste());
        System.out.println(Javier.cuantoVuelto());
        System.out.println();
        
        // No queda bebida.
        System.out.println("Juan:");
        Moneda Mil_Pesos2 = new Moneda1000();
        Expendedor Ex3 = new Expendedor(0,1000);
        Comprador Juan = new Comprador(Mil_Pesos2, 2, Ex3);
        System.out.println(Juan.queBebiste());
        System.out.println(Juan.cuantoVuelto());
        System.out.println();
        
        // No hay dinero
        System.out.println("Jose:");
        Moneda Vacio = null;
        Expendedor Ex4 = new Expendedor(0,1000);
        Comprador Jose = new Comprador(Vacio, 2, Ex4);
        System.out.println(Jose.queBebiste());
        System.out.println(Jose.cuantoVuelto());
        System.out.println();

        // No queda bebida.
        System.out.println("Mario:");
        Moneda Mil_Pesos3 = new Moneda1000();
        Expendedor Ex5 = new Expendedor(5,1000);
        Comprador Mario = new Comprador(Mil_Pesos3, 0, Ex5);
        System.out.println(Mario.queBebiste());
        System.out.println(Mario.cuantoVuelto());
        System.out.println();
    }
}
