package archivos;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author utp
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        
        FileWriter archivo=new FileWriter("Achivo.txt");
        PrintWriter imprimir=new PrintWriter(archivo);
        
        for(int i=0; i<5; i++)
        {
            System.out.println("Ingrese una palabra: ");
            String palabra=teclado.next();
            imprimir.println(palabra);
        }
        
        archivo.close();
        
    }
    
}