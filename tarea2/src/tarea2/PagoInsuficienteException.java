/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author eparr
 */
public class PagoInsuficienteException extends Exception{
    public static final long SerialVersionUID = 22020;
    public PagoInsuficienteException(String mensaje){
        super("PagoInsuficienteException: " + mensaje);
    }
}
