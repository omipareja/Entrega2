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
public class binario {
    
    private String palabras;
/*
    public texto(String palabras) {
        this.palabras = palabras;
    }
    
  */  
    
    public void crear_binario() throws IOException{
        
      Scanner teclado = new Scanner(System.in);
        
      
      
        FileWriter archivo=new FileWriter("binario.txt");
        PrintWriter imprimir=new PrintWriter(archivo);
        int cont=0;
        for(int i=0; i<1; i++)
        {
            
            cont=cont+1;
            
            
            imprimir.println(cont);
        }

        archivo.close();


}
    
    public String leerTxt(String direccion){
        
        
        String texto = "";
        
        try{
            BufferedReader bf =new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
            
            temp = temp +bfRead;
            
        }
            texto =temp;
            
        }catch(Exception e){
        
            System.err.println("no se encontro el archivo");
        
        }
        
        return texto;
        
        
    }
    
}
