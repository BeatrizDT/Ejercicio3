/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import transformar.Convertir;

/**
 *
 * @author Beatriz Diaz Tortosa
 */
public class ConvertirMain {
    
    public static void main(String [] args){
        Convertir convertir = new Convertir();
        convertir.cadenaAConvertir="12/05/2015";
        convertir.TransformarCaracteres();
        
    }
}
