/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author eparr
 */
public class PagoIncorrectoException extends Exception {
    public static final long SerialVersionUID = 102120;
    public PagoIncorrectoException(String mensaje){
        super("PagoIncorrectoException: "  + mensaje);
    }
}
