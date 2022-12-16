package Proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

/**
 * Clase Archivo
 * 
 * Contiene métodos estáticos para imprimir y leer
 * archivos .txt
 */
public class Archivo {
	
	/**
	 * Genera un archivo .txt
	 * 
	 * @param ticket
	 * @param nombreTicket
	 */
    static void guardarTicket(List<Producto> ticket, String nombreTicket) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try {
            fichero = new FileWriter(nombreTicket);
            pw = new PrintWriter(fichero);

            for(Producto p: ticket) {
                pw.println(p);
            }

            System.out.println("Ticket impreso");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
           try {
               if (fichero != null)  fichero.close();
           } catch (Exception e2) {
               System.out.println(e2.getMessage());
           }
        }
    }
	
	/**
	 * Lee un archivo .txt a partir del nombre que se le
	 * pasa como parámetro
	 * 
	 * @param path
	 */
	static void leerTicket(String path) {
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;

	    try {
	    	archivo = new File(path);
	    	fr = new FileReader (archivo);
	        br = new BufferedReader(fr);
	        
	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null) {
	        	System.out.println(linea);
	         }
	    	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    } 
	}
	
	
	
}
