package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
	private File f;
	public Archivo() {
		 f = new File("nombres.txt");
	}	
	public int Leer() {
		int i =0;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while(linea!=null) {
				linea = br.readLine();
				i++;
			}
			fr.close();
		}
		catch(IOException e) {
		}
		return i;

	}
	public String escribir() {
		String hola = "";
		try {


			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			for( int i = 1;i<=20;i++) {
				pw.print(i+" ");	
			}
			hola = "Guardado con exito";
			fw.close();

		}
		catch(IOException e) {
			hola = "error";
		}
		return hola;
	
}

}
