/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectosistemadepago;

/**
 *
 * @author T
 */
public class ProyectoSistemaDePago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pago chamaco1 = new Pago();
        
        //System.out.println( new Pago().hacerPago(30, 3000));
        System.out.println(chamaco1.hacerPago(10,2000));
        // TODO code application logic here
    }
    
}
