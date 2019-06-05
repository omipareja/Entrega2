
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
        
        
       
        texto tex = new texto();
        tex.crear_archivo();
        
        binario bin =new binario();
        bin.crear_binario();
        
        texto a = new texto();
       a.leerTxt("nombre.txt");
        
    }
    
}
