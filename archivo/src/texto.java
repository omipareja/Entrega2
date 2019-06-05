
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
public class texto {
    
    private String palabras;
/*
    public texto(String palabras) {
        this.palabras = palabras;
    }
    
  */  
    
    public void crear_archivo() throws IOException{
        
      Scanner teclado = new Scanner(System.in);
        
      
      
        FileWriter archivo=new FileWriter("nombre.txt");
        PrintWriter imprimir=new PrintWriter(archivo);

        for(int i=0; i<4; i++)
        {
            System.out.println("Ingrese una palabra: ");
            String palabra=teclado.next();
             System.out.println("");
            imprimir.println(palabra);
        }

        archivo.close();


}
    
    public void leerTxt(String direccion){
        
        
        String texto = "";
        
        try{
            BufferedReader bf =new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                System.out.println(bfRead);
            
            //temp = temp +bfRead;
            
        }
           // texto =temp;
            
        }catch(Exception e){
        
            System.err.println("no se encontro el archivo");
        
        }
        
      //  return texto;
        
        
    }
    
}
