package Proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;


public class Archivo {
	
	//Método guardar ticket
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
	
	//Leer ticket
	static void leerTicket(String path) {
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;

	    try {
	    	archivo = new File(path);
	    	fr = new FileReader (archivo);
	        br = new BufferedReader(fr);
	        
	         // Lectura del fitxer
	         String linea;
	         while((linea=br.readLine())!=null) {
	        	System.out.println(linea);
	         }
	    	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    } 
	}
	
	
	
}
