/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transformar;
import java.text.*;
import java.util.Date;
import transformar.Transformar;
/**
 *
 * @author Beatriz Diaz Tortosa
 */
public class Convertir {
    
    public String cadenaAConvertir;
    
    public void TransformarCaracteres(){
        
        SimpleDateFormat formato = new SimpleDateFormat ("dd/mm/yyyy");
        
        try{
            Date fecha = formato.parse(cadenaAConvertir);
            System.out.println(fecha);
            System.out.println(formato.format(fecha));
        }
        catch(ParseException e){
            System.out.println(e);
        }
        
        
    }


    
}
