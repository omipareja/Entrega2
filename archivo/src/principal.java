
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan
 */
public class principal {
    
    public static void main(String[] args) throws IOException{
        
        
       // cra el objeto
        texto text = new texto();
        //llama el metodo crear archivo
        text.crear_archivo();
        //muestra el contenido del archivo
        text.leerTxt("nombre.txt");
        
        // crea el objeto
        binario bin =new binario();
        // crea el archivo con los numeros del 1 al 50
        bin.crear_binario();
        
        //lee en archivo con los numeros
        
        bin.leerTxt("binario.txt");
        
        
        
    }
    
}
