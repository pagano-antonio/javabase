package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProva {

	public static void newFile() {
		String path = "C:/prova/provaNuovo.txt";
		try {
			File f = new File(path);

			if (f.exists())
				System.out.println("Il file " + path + " esiste");
			else if (f.createNewFile())
				System.out.println("Il file " + path + " è stato creato");
			else
				System.out.println("Il file " + path + " non può essere creato");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeFile() {
		String path = "C:/Prova/prova4.txt";
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			fw.write("Questo è il nostro primo file");
			fw.flush();
			fw.write("Questo è il nostro primo filefdf");

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeFile2() {
		String path = "C:/html.txt";
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Questo è il nostro primo file");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFile() {
		String path = "C:/Prova/prova4.txt";
		char[] in = new char[50];
		int size = 0;
		try {
			File file = new File(path);
			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.println("Caratteri presenti: " + size);
			System.out.println("Il contenuto del file è il seguente:");
			for (int i = 0; i < size; i++)
				System.out.print(in[i]);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFile2() {
		String path = "C:/Prova/prova4.txt";
		BufferedReader reader;
		try {
			File file = new File(path);
			FileReader fr = new FileReader(file);
			reader = new BufferedReader(fr);

			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		readFile2();
	}

}
